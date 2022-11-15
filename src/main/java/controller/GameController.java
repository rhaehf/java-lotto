package controller;

import service.InputValidation;
import service.LottoNumber;
import view.Input;
import view.Output;

public class GameController {
    public static int lottoCount;

    public void play() {
        buyLotto();
        publishLotto();
    }

    private void buyLotto() {
        String inputMoney = Input.purchaseAmount();

        int money = InputValidation.isInteger(inputMoney);
        lottoCount = InputValidation.existRemainder(money);
        Output.lottoCount(lottoCount);
    }

    private void publishLotto() {
        LottoNumber lottoNumber = new LottoNumber();
        for (int i = 0; i < lottoCount; i++) {
            lottoNumber.makeNumbers();
        }
        System.out.println(LottoNumber.lottoNumbers);
    }
}

package controller;

import service.WinningNumber;
import service.InputValidation;
import service.LottoNumber;
import view.Input;
import view.Output;

public class GameController {
    public static int lottoCount;

    public void play() {
        buyLotto();
        publishLotto();
        inputWinningNumber();
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

        Output.lottoNumbers();
    }

    private void inputWinningNumber() {
        String inputNumber = Input.winningNumber();
        WinningNumber winningNumber = new WinningNumber();
        winningNumber.split(inputNumber);
    }
}

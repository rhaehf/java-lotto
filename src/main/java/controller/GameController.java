package controller;

import service.InputValidation;
import view.Input;
import view.Output;

public class GameController {

    public void play() {
        String inputMoney = Input.purchaseAmount();

        int money = InputValidation.isInteger(inputMoney);
        int lottoCount = InputValidation.existRemainder(money);
        Output.lottoCount(lottoCount);
    }
}

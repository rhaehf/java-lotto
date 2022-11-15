package controller;

import service.*;
import view.Input;
import view.Output;

import java.util.List;

public class GameController {
    public static int lottoCount;
    public static List<Integer> matchWinningNumbersCount;
    public static List<Integer> matchBonusNumbersCount;
    public static List<Integer> matchResult;

    private final LottoNumber lottoNumber;
    private final WinningNumber winningNumber;
    private final BonusNumber bonusNumber;
    private final CompareNumber compareNumber;

    public GameController() {
        lottoNumber = new LottoNumber();
        winningNumber = new WinningNumber();
        bonusNumber = new BonusNumber();
        compareNumber = new CompareNumber();
    }

    public void play() {
        buyLotto();
        publishLotto();
        inputWinningNumber();
        inputBonusNumber();
        matchLotto();
        outputResults();
    }

    private void buyLotto() {
        String inputMoney = Input.purchaseAmount();

        int money = InputValidation.isInteger(inputMoney);
        lottoCount = InputValidation.existRemainder(money);
        Output.lottoCount(lottoCount);
    }

    private void publishLotto() {
        for (int i = 0; i < lottoCount; i++) {
            lottoNumber.makeNumbers();
        }

        Output.lottoNumbers(lottoNumber.getLottoNumbers());
    }

    private void inputWinningNumber() {
        String inputNumber = Input.winningNumber();
        winningNumber.split(inputNumber);
    }

    private void inputBonusNumber() {
        String inputNumber = Input.bonusNumber();
        bonusNumber.store(inputNumber);
    }

    private void matchLotto() {
        compareNumber.matchWinning(lottoCount, lottoNumber, winningNumber);
        compareNumber.matchBonus(lottoCount, lottoNumber, bonusNumber);
        matchResult = compareNumber.matchResults(lottoCount);
//        System.out.println(matchResult);
    }

    private void outputResults() {
        Output.lottoMatch(matchResult);

    }
}

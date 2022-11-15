package service;

public class BonusNumber {
    private static int bonusNumber;

    public void store(String inputNumber) {
        bonusNumber = Integer.parseInt(inputNumber.strip());
    }
}

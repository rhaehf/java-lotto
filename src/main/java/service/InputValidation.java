package service;

public class InputValidation {

    public static int isInteger(String inputMoney) {
        try {
            return Integer.parseInt(inputMoney);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 구입금액을 숫자로 입력하지 않았습니다.");
        }
        return 0;
    }

    public static int existRemainder(int money) {
        int lottoCount = money / 1000;
        int remainder = money % 1000;
        if (remainder != 0) {
            System.out.println("[ERROR] 구입금액이 1,000원으로 나누어 떨어지지 않았습니다.");
            throw new IllegalArgumentException();
//            throw new IllegalArgumentException("[ERROR] 구입금액이 1,000원으로 나누어 떨어지지 않았습니다.");
        }
        return lottoCount;
    }
}

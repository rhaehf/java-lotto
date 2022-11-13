package lotto;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("구입금액을 입력해 주세요.");
        int lottoCount = purchaseAmount();
        System.out.println(lottoCount + "개를 구매했습니다.");
    }

    private static int purchaseAmount() {
        String inputMoney = Console.readLine();
        System.out.println(" ");

        int money = isInteger(inputMoney);
        int lottoCount = existRemainder(money);
        return lottoCount;
    }

    private static int isInteger(String inputMoney) {
        try {
            int money = Integer.parseInt(inputMoney);
            return money;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 구입금액을 숫자로 입력하지 않았습니다.");
        }
        return 0;
    }

    private static int existRemainder(int money) {
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

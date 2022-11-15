package view;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    // 구입금액 입력
    public static String purchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }

    // 당첨 번호 입력
    public static String winningNumber() {
        System.out.println("\n" + "당첨 번호를 입력해 주세요.");
        return Console.readLine();
    }

    // 보너스 번호 입력
    public static String bonusNumber(){
        System.out.println("\n" + "보너스 번호를 입력해 주세요.");
        return Console.readLine();
    }
}


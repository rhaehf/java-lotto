package view;

import java.util.List;

public class Output {
    // 구매 개수 출력
    public static void lottoCount(int lottoCount) {
        System.out.println("\n" + lottoCount + "개를 구매했습니다.");
    }

    // 구매한 로또 번호 출력
    public static void lottoNumbers(List<List<Integer>> lottoNumbers) {
        lottoNumbers.forEach(
                System.out::println
        );
    }

    // 당첨 결과 출력
    public static void lottoMatch(List<Integer> matchResult){
        System.out.println("\n" + "당첨 통계" + "\n" + "---");
        System.out.printf("6개 일치 (2,000,000,000원) - %s개", matchResult.get(0));
        System.out.printf("\n" + "5개 일치, 보너스 볼 일치 (30,000,000원) - %s개", matchResult.get(1));
        System.out.printf("\n" + "5개 일치 (1,500,000원) - %s개", matchResult.get(2));
        System.out.printf("\n" + "4개 일치 (50,000원) - %s개", matchResult.get(3));
        System.out.printf("\n" + "3개 일치 (5,000원) - %s개", matchResult.get(4));
    }

    // 수익률 출력
    public static void lottoEarning(){
    }
}

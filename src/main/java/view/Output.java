package view;

import service.LottoNumber;

public class Output {
    // 구매 개수 출력
    public static void lottoCount(int lottoCount) {
        System.out.println("\n" + lottoCount + "개를 구매했습니다.");
    }

    // 구매한 로또 번호 출력
    public static void lottoNumbers(){
        LottoNumber.lottoNumbers.forEach(
                System.out::println
        );
    }

    // 당첨 결과 출력

    // 수익률 출력

}

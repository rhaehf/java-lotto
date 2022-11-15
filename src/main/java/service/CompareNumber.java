package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CompareNumber {
    public static List<Integer> matchWinningNumbers = new ArrayList<>();
    public static List<Integer> matchBonusNumbers = new ArrayList<>();
    public static List<Integer> grade = new ArrayList<>(Collections.nCopies(5, 0));

    public void matchWinning(int lottoCount, LottoNumber lottoNumber, WinningNumber winningNumber) {
        for (int i = 0; i < lottoCount; i++) {
            List<Integer> matchNumbers = lottoNumber.getLottoNumbers().get(i)
                    .stream()
                    .filter(number -> winningNumber.getWinningNumbers().stream().anyMatch(Predicate.isEqual(number)))
                    .collect(Collectors.toList());
            matchWinningNumbers.add(matchNumbers.size());
        }
//        System.out.println(matchWinningNumbers);
    }

    public void matchBonus(int lottoCount, LottoNumber lottoNumber, BonusNumber bonusNumber) {
        for (int i = 0; i < lottoCount; i++) {
            List<Integer> matchNumbers = lottoNumber.getLottoNumbers().get(i)
                    .stream()
                    .filter(number -> number.equals(bonusNumber.getBonusNumber()))
                    .collect(Collectors.toList());
            matchBonusNumbers.add(matchNumbers.size());
        }
//        System.out.println(matchBonusNumbers);
    }

    public List<Integer> matchResults(int lottoCount) {
        for (int i = 0; i < lottoCount; i++) {
            if (matchWinningNumbers.get(i) == winningResult.FIRST.matchCount() && matchBonusNumbers.get(i) == 0) {
                int count = grade.get(0);
                count += 1;
                grade.add(0, count);
            }
            if (matchWinningNumbers.get(i) == winningResult.SECOND.matchCount() && matchBonusNumbers.get(i) == 1) {
                int count = grade.get(1);
                count += 1;
                grade.add(1, count);
            }
            if (matchWinningNumbers.get(i) == winningResult.THIRD.matchCount() && matchBonusNumbers.get(i) == 0) {
                int count = grade.get(2);
                count += 1;
                grade.add(2, count);
            }
            if (matchWinningNumbers.get(i) == winningResult.FOURTH.matchCount() && matchBonusNumbers.get(i) == 0) {
                int count = grade.get(3);
                count += 1;
                grade.add(3, count);
            }
            if (matchWinningNumbers.get(i) == winningResult.FIFTH.matchCount() && matchBonusNumbers.get(i) == 0) {
                int count = grade.get(4);
                count += 1;
                grade.add(4, count);
            }
        }
        return grade;
    }
}

enum winningResult {
    FIRST(6), SECOND(5), THIRD(5), FOURTH(4), FIFTH(3);
    private final int value;

    winningResult(int value) {
        this.value = value;
    }

    public int matchCount() {
        return value;
    }
}

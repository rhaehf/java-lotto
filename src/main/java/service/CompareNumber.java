package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CompareNumber {
    public static List<Integer> matchWinningNumbers = new ArrayList<>();
    public static List<Integer> matchBonusNumbers = new ArrayList<>();

    public List<Integer> matchWinning(int lottoCount, LottoNumber lottoNumber, WinningNumber winningNumber) {
        for (int i = 0; i < lottoCount; i++) {
            List<Integer> matchNumbers = lottoNumber.getLottoNumbers().get(i)
                    .stream()
                    .filter(number -> winningNumber.getWinningNumbers().stream().anyMatch(Predicate.isEqual(number)))
                    .collect(Collectors.toList());
            matchWinningNumbers.add(matchNumbers.size());
        }
        System.out.println(matchWinningNumbers);
        return matchWinningNumbers;
    }


    public List<Integer> matchBonus(int lottoCount, LottoNumber lottoNumber, BonusNumber bonusNumber) {
        for (int i = 0; i < lottoCount; i++) {
            List<Integer> matchNumbers = lottoNumber.getLottoNumbers().get(i)
                    .stream()
                    .filter(number -> number.equals(bonusNumber.getBonusNumber()))
                    .collect(Collectors.toList());
            matchBonusNumbers.add(matchNumbers.size());
        }
        System.out.println(matchBonusNumbers);
        return matchBonusNumbers;
    }
}

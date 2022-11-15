package service;

import camp.nextstep.edu.missionutils.Randoms;
import domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumber {
    private final List<List<Integer>> lottoNumbers = new ArrayList<>();

    public void makeNumbers() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Lotto lotto = new Lotto(numbers);
        lottoNumbers.add(lotto.getNumbers());
    }

    public List<List<Integer>> getLottoNumbers() {
        return lottoNumbers;
    }
}

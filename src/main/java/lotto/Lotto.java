package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(final List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(final List<Integer> numbers) {
        if (numbers.size() != Number.NUMBER_NUM.toValue()) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
}

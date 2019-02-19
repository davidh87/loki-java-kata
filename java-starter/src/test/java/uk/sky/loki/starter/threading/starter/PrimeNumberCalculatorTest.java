package uk.sky.loki.starter.threading.starter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PrimeNumberCalculatorTest {

    @MethodSource("possiblePrimeNumbers")
    @ParameterizedTest
    public void fourIsNotPrime(boolean isPrime, int possiblePrime) {
        Assertions.assertThat(PrimeNumberCalculator.isPrime(possiblePrime)).isEqualTo(isPrime);
    }

    private static Stream<Arguments> possiblePrimeNumbers() {
        return Stream.of(
                Arguments.of(false, 4),
                Arguments.of(false, 14),
                Arguments.of(false, 6),
                Arguments.of(false, 9),
                Arguments.of(true, 3),
                Arguments.of(true, 5),
                Arguments.of(true, 7),
                Arguments.of(true, 11),
                Arguments.of(true, 13),
                Arguments.of(true, 1),
                Arguments.of(true, 2),
                Arguments.of(false, 12)
        );
    }


}

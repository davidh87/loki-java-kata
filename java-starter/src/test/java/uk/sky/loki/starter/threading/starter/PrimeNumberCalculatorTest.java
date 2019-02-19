package uk.sky.loki.starter.threading.starter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberCalculatorTest {

    @Test
    public void oneIsPrime() {
        Assertions.assertThat(PrimeNumberCalculator.isPrime(1)).isTrue();
    }

}

package com.heuyathic.javalab.effective;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import java.util.Random;

import com.heuyathic.javalab.effective.StaticFactoryMethod;
import org.junit.jupiter.api.Test;

public class StaticFactoryMethodTest {

    @Test
    void convertBoolean() {
        assertThat(StaticFactoryMethod.valueOf(true)).isEqualTo(Boolean.TRUE);
        assertThat(StaticFactoryMethod.valueOf(false)).isEqualTo(Boolean.FALSE);
    }

    @Test
    void probablePrimeTest() {
        assertThat(BigInteger.probablePrime(2, new Random())).isIn(BigInteger.TWO, BigInteger.valueOf(3));
        assertThat(BigInteger.probablePrime(3, new Random())).isIn(BigInteger.valueOf(5), BigInteger.valueOf(7));
    }
}

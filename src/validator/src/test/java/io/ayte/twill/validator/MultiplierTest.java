package io.ayte.twill.validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MultiplierTest {
    @Test
    public void validateGetter() {
        assertThat(new Multiplier(12).getValue(), equalTo(12));
    }

    @Test
    public void validateMultiplication() {
        assertThat(new Multiplier(21).apply(2), equalTo(42));
    }

    public static Object[][] dataProvider() {
        return new Object[][] {
                {1, 2, 2},
                {3, 4, 12}
        };
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void validateParameterizedMultiplication(int leftHand, int rightHand, int expectation) {
        assertThat(new Multiplier(leftHand).apply(rightHand), equalTo(expectation));
    }
}

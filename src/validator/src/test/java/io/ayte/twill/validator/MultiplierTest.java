package io.ayte.twill.validator;

import org.junit.jupiter.api.Test;

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
}

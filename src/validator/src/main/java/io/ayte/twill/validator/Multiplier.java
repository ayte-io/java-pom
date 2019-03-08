package io.ayte.twill.validator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Multiplier {
    @Getter
    private final int value;

    public int apply(int other) {
        return value * other;
    }
}

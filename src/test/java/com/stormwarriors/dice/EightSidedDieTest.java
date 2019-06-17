package com.stormwarriors.dice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EightSidedDieTest {

    private final Rollable underTest = new EightSidedDie();

    @Test
    @DisplayName("Rolling dice should return a number between 1 and 8 (inclusive)")
    void shouldRollNumberBetweenOneAndEightInclusive() {
        int[] multipleRollArray = IntStream.range(0, 5000).map(idx -> underTest.roll()).toArray();
        Arrays.sort(multipleRollArray);
        assertTrue(multipleRollArray[0] >= 1 && multipleRollArray[4999] <= 8);
    }

}

package com.stormwarriors.deck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CardTypeTest {

    @Test
    @DisplayName("Card types should only contain Warrior, Element, Item and Weather")
    void shouldContainAllCardTypes() {
        final List<String> allCardTypes = Arrays.stream(CardType.values())
                .map(Enum::name)
                .collect(Collectors.toList());
        assertEquals(4, allCardTypes.size());
        assertTrue(allCardTypes.contains("WARRIOR"));
        assertTrue(allCardTypes.contains("ELEMENT"));
        assertTrue(allCardTypes.contains("ITEM"));
        assertTrue(allCardTypes.contains("WEATHER"));
    }

}

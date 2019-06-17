package com.stormwarriors.deck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementCardTest {

    private ElementCard underTest = new ElementCard();

    @Test
    @DisplayName("Matches the card type")
    void shouldMatchCardType() {
        assertTrue(underTest.isOneOf(CardType.ELEMENT));
    }

    @Test
    @DisplayName("Does not match the card type")
    void shouldNotMatchCardType() {
        assertFalse(underTest.isOneOf(CardType.ITEM, CardType.WARRIOR, CardType.WEATHER));
    }

}

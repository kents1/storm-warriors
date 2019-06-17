package com.stormwarriors.deck.io;

import com.stormwarriors.deck.Decks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecksReaderTest {

    @Test
    void shouldReadBaseDeck() throws Exception {
        Decks decks = new DecksReader().read("packs/test-deck.xml");
        assertEquals(1, decks.getDecks().size());
    }

}

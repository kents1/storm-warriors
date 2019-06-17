package com.stormwarriors.deck.io;

import com.stormwarriors.deck.Card;
import com.stormwarriors.deck.Deck;
import com.stormwarriors.deck.Decks;
import com.stormwarriors.deck.ElementCard;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class DecksReader {

    public Decks read(final String resourceName) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Decks.class,
                Deck.class, Card.class, ElementCard.class);

        final Unmarshaller unmarshaller = jc.createUnmarshaller();
        return (Decks) unmarshaller.unmarshal(getClass()
                .getClassLoader().getResourceAsStream(resourceName));
    }

}

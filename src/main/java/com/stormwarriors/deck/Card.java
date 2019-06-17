package com.stormwarriors.deck;

import com.stormwarriors.deck.io.CardCustomizer;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlCustomizer;

import static java.util.Arrays.stream;

@XmlCustomizer(CardCustomizer.class)
@Data
public abstract class Card {

    public Card view() {
        return this;
    }

    abstract CardType getType();

    boolean isOneOf(final CardType... types) {
        return stream(types).anyMatch(cardType -> cardType.equals(getType()));
    }

}

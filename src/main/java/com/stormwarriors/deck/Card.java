package com.stormwarriors.deck;

import com.stormwarriors.deck.io.CardCustomizer;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlCustomizer;

@XmlCustomizer(CardCustomizer.class)
@Data
public abstract class Card {

    public Card view() {
        return this;
    }

    abstract CardType getType();

}

package com.stormwarriors.deck;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlDiscriminatorValue("ELEMENT")
@Data
public class ElementCard extends Card {

    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "elementalType")
    private ElementalType elementalType;

    public ElementCard() {
        super();
    }

    @Override
    public CardType getType() {
        return CardType.ELEMENT;
    }

}

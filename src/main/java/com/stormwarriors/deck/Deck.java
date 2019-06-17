package com.stormwarriors.deck;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Deck {

    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "card")
    private List<Card> cards;

}

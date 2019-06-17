package com.stormwarriors.deck;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "decks")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Decks {

    @XmlElement(name = "deck")
    private List<Deck> decks;

}

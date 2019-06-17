package com.stormwarriors.game;

import com.stormwarriors.deck.Deck;
import com.stormwarriors.deck.io.DecksReader;
import com.stormwarriors.dice.EightSidedDie;
import com.stormwarriors.dice.Rollable;
import com.stormwarriors.dice.TwentySidedDie;
import com.stormwarriors.player.Player;

import java.util.HashSet;
import java.util.Set;

public class GameInstance {

    private static int INITIAL_PLAYER_CAPACITY = 2;

    private Rollable eightSidedDie;
    private Rollable twentySidedDie;
    private Set<Player> players;
    private GameState gameState;
    private Deck gameDeck;

    public GameInstance() {
        super();

        this.eightSidedDie = new EightSidedDie();
        this.twentySidedDie = new TwentySidedDie();
        this.players = new HashSet<>(INITIAL_PLAYER_CAPACITY);
        this.gameState = GameState.INITIALISING;

        // TODO: This needs clean up already.
        try {
            this.gameDeck = new DecksReader().read("packs/base-deck.xml")
                    .getDecks().get(0);
        }
        catch (Exception e) {
            System.err.println("Invalid deck.");
            System.exit(-1);
        }
    }

}

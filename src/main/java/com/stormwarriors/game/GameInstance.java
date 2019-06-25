package com.stormwarriors.game;

import com.stormwarriors.deck.Deck;
import com.stormwarriors.deck.io.DecksReader;
import com.stormwarriors.dice.EightSidedDie;
import com.stormwarriors.dice.Rollable;
import com.stormwarriors.dice.TwentySidedDie;
import com.stormwarriors.player.Player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameInstance {

    private static int INITIAL_PLAYER_CAPACITY = 2;

    private Rollable eightSidedDie;
    private Rollable twentySidedDie;
    private Set<Player> players;
    private GameState gameState;
    private List<Deck> playableDecks;
    private Deck playDeck;
    private List<GameStateChangeNotifier> changeNotifiers;

    public GameInstance() {
        super();

        this.eightSidedDie = new EightSidedDie();
        this.twentySidedDie = new TwentySidedDie();
        this.players = new HashSet<>(INITIAL_PLAYER_CAPACITY);
        this.gameState = GameState.INITIALISING;
        this.changeNotifiers = new ArrayList<>();

        // TODO: This needs clean up already.
        try {
            this.playableDecks = new DecksReader().read("packs/base-deck.xml")
                    .getDecks();
        }
        catch (Exception e) {
            System.err.println("Invalid deck.");
            System.exit(-1);
        }
    }

    public void addGameStateChangeNotifier(final GameStateChangeNotifier listener) {
        this.changeNotifiers.add(listener);
    }

    public void selectDeck() {
        updateStateTo(GameState.SELECTING_DECK);
        if (this.playableDecks.size() == 1) {
            useDeck(playableDecks.get(0));
        }
    }

    private void useDeck(final Deck deck) {
        if (isOfState(GameState.SELECTING_DECK)) {
            this.playDeck = deck;
            updateStateTo(GameState.WAITING_FOR_PLAYERS);
        }
    }

    public boolean isOfState(final GameState state) {
        return this.gameState.equals(state);
    }

    private void updateStateTo(final GameState gameState) {
        this.gameState = gameState;
        notifyListeners();
    }

    private void notifyListeners() {
        final GameStateChangeEvent event = new GameStateChangeEvent(this.gameState);
        this.changeNotifiers.forEach(listener -> listener.gameStateChanged(event));
    }

}

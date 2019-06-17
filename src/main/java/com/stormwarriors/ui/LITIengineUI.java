package com.stormwarriors.ui;

import com.stormwarriors.game.GameInstance;
import de.gurkenlabs.litiengine.Game;

public class LITIengineUI implements UI {

    private GameInstance gameInstance;

    public LITIengineUI(final GameInstance gameInstance) {
        this.gameInstance = gameInstance;
    }

    @Override
    public void init(String[] args) {
        Game.init(args);
        Game.screens().add(new WaitForPlayersScreen());
    }

    @Override
    public void start() {
        Game.start();
    }

}

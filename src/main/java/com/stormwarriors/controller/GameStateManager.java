package com.stormwarriors.controller;

import com.stormwarriors.game.GameInstance;
import com.stormwarriors.ui.UI;
import de.gurkenlabs.litiengine.input.Input;

import java.awt.event.KeyEvent;

public class GameStateManager {

    private GameInstance gameInstance;
    private UI ui;

    public GameStateManager(final GameInstance gameInstance,
                            final UI ui) {
        super();

        this.gameInstance = gameInstance;
        this.ui = ui;
    }

    public void init(final String[] args) {
        ui.init(args);

        // Exit game on ESC key (only while in development)
        Input.keyboard().onKeyPressed(KeyEvent.VK_ESCAPE, e -> System.exit(0));
    }

    public void startGame() {
        ui.start();
    }

}

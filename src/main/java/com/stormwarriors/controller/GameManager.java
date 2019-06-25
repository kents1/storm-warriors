package com.stormwarriors.controller;

import com.stormwarriors.game.GameInstance;
import com.stormwarriors.input.InputController;
import com.stormwarriors.ui.JMonkeyEngineUI;
import com.stormwarriors.ui.UI;

public class GameManager {

    private final GameInstance gameInstance;
    private final InputController inputController;
    private final UI ui = new JMonkeyEngineUI();

    public GameManager(final GameInstance gameInstance,
                       final InputController inputController) {
        this.gameInstance = gameInstance;
        this.inputController = inputController;
    }

    public void init(final String[] args) {
        inputController.init();
        gameInstance.selectDeck();
        ui.init(args);
    }

    public void startGame() {
        ui.start();
    }

}

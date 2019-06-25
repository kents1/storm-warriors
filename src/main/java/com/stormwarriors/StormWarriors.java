package com.stormwarriors;

import com.stormwarriors.controller.GameManager;
import com.stormwarriors.game.GameInstance;
import com.stormwarriors.input.InputController;
import com.stormwarriors.input.JMonkeyEngineInputController;
import com.stormwarriors.ui.JMonkeyEngineUI;
import com.stormwarriors.ui.UI;

public class StormWarriors {

    public static void main(String[] args) {
        final GameInstance gameInstance = new GameInstance();

        final InputController inputController = new JMonkeyEngineInputController();
        final GameManager gameManager = new GameManager(gameInstance, inputController);

        gameManager.init(args);
        gameManager.startGame();
    }

}

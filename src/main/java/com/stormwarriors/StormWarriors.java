package com.stormwarriors;

import com.stormwarriors.game.GameInstance;
import com.stormwarriors.controller.GameStateManager;
import com.stormwarriors.ui.LITIengineUI;
import com.stormwarriors.ui.UI;

public class StormWarriors {

    public static void main(String[] args) {

        final GameInstance gameInstance = new GameInstance();
        final UI ui = new LITIengineUI(gameInstance);

        final GameStateManager gameStateManager = new GameStateManager(gameInstance, ui);
        gameStateManager.init(args);
        gameStateManager.startGame();
    }

}

package com.stormwarriors.game;

import lombok.Value;

import java.io.Serializable;

@Value
public class GameStateChangeEvent implements Serializable {

    private GameState gameState;

}

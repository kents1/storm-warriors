package com.stormwarriors.player;

public class CPUPlayer implements Player {

    private String playerName;

    public CPUPlayer(final String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String name() {
        return playerName;
    }

}

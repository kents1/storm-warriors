package com.stormwarriors.dice;

public abstract class AbstractDie implements Rollable {

    // Number of sides on the die.
    private int sides;

    AbstractDie(int sides) {
        this.sides = sides;
    }

    @Override
    public int roll() {
        return (int) (Math.random() * this.sides + 1);
    }

}

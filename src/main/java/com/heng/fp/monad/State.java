package com.heng.fp.monad;

public class State {

    private final int value;

    public State(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "State{" +
                "value=" + value +
                '}';
    }
}
package com.terasoft.common.domain.enums;

public enum UserState {
    INACTIVE(0),
    ACTIVE(1);

    private final int value;

    UserState(final int state) {
        value = state;
    }

    public int getValue() { return value; }
}

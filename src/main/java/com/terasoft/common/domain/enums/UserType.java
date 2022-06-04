package com.terasoft.common.domain.enums;

public enum UserType {
    LAWYER(0),
    CUSTOMER(1);

    private final int value;

    UserType(final int state) {
        value = state;
    }

    public int getValue() { return value; }
}

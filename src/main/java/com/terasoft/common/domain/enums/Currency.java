package com.terasoft.common.domain.enums;

public enum Currency {
    USD(0),
    SOL(1);

    private final int value;

    private Currency(final int state) {this.value = state;}
    public int getValue() {return this.value;}
}

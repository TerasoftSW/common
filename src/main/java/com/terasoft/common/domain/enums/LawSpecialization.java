package com.terasoft.common.domain.enums;

public enum LawSpecialization {
    CIVIL_LAW(0),
    PENAL_LAW(1),
    CORPORATE_LAW(2),
    COMMERCIAL_LAW(3);

    private final int value;

    LawSpecialization(final int state) {
        value = state;
    }

    public int getValue() { return value; }
}

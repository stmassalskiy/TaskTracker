package org;

public enum Status {
    NEW(1),
    IN_PROGRESS(2),
    COMPLETED(3);

    private final int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

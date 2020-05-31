package com.nabildaden.javacourse.lesson10;

// déclaration d'une énumération
public enum LoggingLevel {
    DEBUG(0),
    INFO(1),
    WARNING(2),
    ERROR(3);

    private int i;

    private LoggingLevel(int i) {
        this.i = i;
    }

    public int code() {
        return i;
    }
}

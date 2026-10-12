package com.anukriti.logger.enums;

public enum LogLevel {
    DEBUG(4),
    INFO(3),
    WARN(2),
    ERROR(1);

    private final int priority;

    LogLevel(int priority) {
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }
}

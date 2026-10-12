package com.anukriti.logger.model;

import com.anukriti.logger.enums.LogLevel;
import java.time.Instant;

public class LogMessage {
    private String id;
    private String message;
    private Instant time;
    private LogLevel level;

    public LogMessage(String id, String message, LogLevel level){
        this.id = id;
        this.message = message;
        this.time = Instant.now();
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Instant getTime() {
        return time;
    }

    public LogLevel getLevel() {
        return level;
    }
}

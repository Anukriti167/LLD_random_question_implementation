package com.anukriti.logger.output;

import com.anukriti.logger.model.LogMessage;

public class ConsoleDestination implements Destination{
    public void outputLog(LogMessage message) {
        System.out.println(message.getTime() + " [" + message.getLevel() + "] " + message.getMessage());
    }
}

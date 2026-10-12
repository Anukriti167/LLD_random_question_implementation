package com.anukriti.logger.model;

import com.anukriti.logger.enums.LogLevel;
import com.anukriti.logger.output.Destination;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private String id;
    private String desc;
    private LogLevel minLogLevel;
    private List<Destination> destinationList;

    public Service(String id, String desc){
        this.id = id;
        this.desc = desc;
        this.minLogLevel = LogLevel.INFO;
        this.destinationList = new ArrayList<Destination>();

    }

    public void log(LogMessage message){
        int priority = message.getLevel().getPriority();
        if(priority > minLogLevel.getPriority()) return;

        for(Destination dest: destinationList){
            dest.outputLog(message);
        }
    }

    public void setMinLogLevel(LogLevel level){
        this.minLogLevel = level;
    }

    public void addDestination(Destination destination){
        destinationList.add(destination);
    }
}

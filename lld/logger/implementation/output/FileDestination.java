package com.anukriti.logger.output;

import com.anukriti.logger.model.LogMessage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDestination implements Destination{
    private String filePath;

    public FileDestination(String filePath){
        this.filePath = filePath;
    }
    public void outputLog(LogMessage message) {
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(message.getTime() + " ["
                    + message.getLevel() + "] "
                    + message.getMessage() + "\n");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

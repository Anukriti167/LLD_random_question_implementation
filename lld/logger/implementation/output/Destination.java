package com.anukriti.logger.output;

import com.anukriti.logger.model.LogMessage;

public interface Destination {
    void outputLog(LogMessage message);
}

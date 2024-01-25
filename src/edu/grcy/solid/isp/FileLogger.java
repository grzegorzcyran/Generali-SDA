package edu.grcy.solid.isp;

import java.util.Collection;
import java.util.Collections;

public class FileLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("Writing new log line :" + message);
    }

    @Override
    public Collection<String> readMessages() {
        return Collections.EMPTY_LIST;
    }
}

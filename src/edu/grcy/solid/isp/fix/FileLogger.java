package edu.grcy.solid.isp.fix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FileLogger implements ReadableLogger {

    private Collection<String> messages = new ArrayList<>();

    @Override
    public Collection<String> readMessages() {
        if (messages.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        return messages;
    }

    @Override
    public void writeMessage(String message) {
        messages.add(message);
        System.out.println("Writing new message to file");
    }
}

package edu.grcy.solid.isp.fix;

import java.util.Collection;

//@FunctionalInterface
public interface ReadableLogger extends Logger {
    Collection<String> readMessages();

    /**
     * Readable logger rozszerza Logger więc ma tak naprawdę
     * dwie metody abstrakcyjne i nie może być
     * oznaczony anotacją FunctionalInterface
     */
}

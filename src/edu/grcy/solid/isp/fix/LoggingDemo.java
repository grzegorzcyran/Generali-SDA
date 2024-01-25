package edu.grcy.solid.isp.fix;

public class LoggingDemo {
    public static void main(String[] args) {
        //readable logger zapisuje i odczytuje
        ReadableLogger readableLogger = new FileLogger();

        readableLogger.writeMessage("aaaa");
        readableLogger.writeMessage("b");
        readableLogger.writeMessage("cc");
        readableLogger.writeMessage("  ");

        System.out.println("Odczyt zawartości loga:");
        readableLogger.readMessages().forEach(System.out::println);

        //logger tylko zapisuje
        Logger logger = new ConsoleLogger();
        logger.writeMessage("xxx");
        logger.writeMessage("t");
        logger.writeMessage("yy");
        logger.writeMessage("qqq");

        /**
         * FileLogger może być implementacją Loggera
         */
        Logger anotherLogger = new FileLogger();
        anotherLogger.writeMessage("message");
        //jeśli chcemy odczytać to robimy explicite rzutowanie
        //ale tak nie powinniśmy robić
        ((ReadableLogger) anotherLogger).readMessages();
    }
}

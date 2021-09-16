package JULogger;

import java.io.IOException;
import java.util.logging.*;

public class JULogger2 {

    public Logger LOGGER;
    private final Level LEVEL = Level.ALL;
    private final String pattern = "./log/jul_2/JULogger.%g.log";

    public JULogger2 (String className) {

        LOGGER = Logger.getLogger(className);

        Handler consoleHandler = null;
        Handler fileHandler = null;
        Formatter simpleFormatter = null;


        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler(pattern, 20000,5,true);
            simpleFormatter = new SimpleFormatter();

            fileHandler.setFormatter(simpleFormatter);
            consoleHandler.setFormatter(simpleFormatter);


            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(LEVEL);
            fileHandler.setLevel(LEVEL);
            LOGGER.setLevel(LEVEL);

            LOGGER.config("Configuration done.\n");

            LOGGER.removeHandler(consoleHandler);

            LOGGER.log(Level.FINE, "Finer logged\n");
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.\n", exception);
        }

        LOGGER.finer("Finest example on LOGGER handler completed.\n");
    }
}

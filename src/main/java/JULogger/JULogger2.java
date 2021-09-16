package JULogger;

import java.io.IOException;
import java.util.logging.*;

public class JULogger2 {

    public Logger LOGGER;
    private final Level LEVEL = Level.INFO;
    private final String logPath = "./log/JULogger.%g.log";

    public JULogger2 (String className) {

        LOGGER = Logger.getLogger(className);

        Handler consoleHandler = null;
        Handler fileHandler = null;
        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler(logPath);

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(LEVEL);
            fileHandler.setLevel(LEVEL);
            LOGGER.setLevel(LEVEL);

            LOGGER.config("Configuration done.");

            LOGGER.removeHandler(consoleHandler);

            LOGGER.log(Level.FINE, "Finer logged");
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }

        LOGGER.finer("Finest example on LOGGER handler completed.");
    }
}

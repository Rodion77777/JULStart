package JULogger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JULogger {

    public Logger myLogger;
    private String className;

    public JULogger(String className) {
        this.className = className;
        myLogger = Logger.getLogger(className);

        try {
            LogManager.getLogManager()
                    .readConfiguration(new FileInputStream("src/main/resources/JULogger.config"));
        } catch (IOException ioException) {
            myLogger.log(Level.SEVERE, "Error in loading configuration!", ioException);
        }

        myLogger.fine("\"" + className + "\" is successfully configured");
    }
}
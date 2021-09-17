package JUL;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogTest {

    private static final String CLASS_NAME = LogTest.class.getName();
    private static final Logger LOGGER = JULStart.LOGGER;

    public static void myTest () {
        final String methodName = "myTest";
        LOGGER.logp(Level.INFO, CLASS_NAME, methodName, "Example of using logger");
        System.out.println("Using logger without its create.");
    }
}

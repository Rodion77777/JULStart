package JUL;

import JULogger.JULogger;
import java.io.PrintStream;
import java.util.logging.Logger;

public class JULStart {

    private static final JULogger MY_LOGGER = new JULogger(JULStart.class.getName());
    private static final Logger LOGGER = MY_LOGGER.myLogger;
    public static final PrintStream OUT = System.out;

    public static void main (String[] args) {

        String message = getMessage();
        //message = getEmptyMessage();

        if (!message.isEmpty()) OUT.print("===========");
        else {
            LOGGER.severe("Empty message!\n");
        }
    }

    public static String getMessage () {
        LOGGER.info("Call method \"getMessage\"\n");
        return "Message : \"Hello JUL!\" (Java Util Logger)\n"
                .replaceAll("[\"()]", "")
                .repeat(1);
    }

    public static String getEmptyMessage () {
        LOGGER.info("Call method \"getEmptyMessage\"\n");
        return "";
    }
}

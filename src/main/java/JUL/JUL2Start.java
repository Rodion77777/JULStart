package JUL;

import JULogger.JULogger2;
import java.io.PrintStream;
import java.util.logging.Logger;

public class JUL2Start {

    private static final JULogger2 MY_LOGGER2 = new JULogger2(JUL2Start.class.getName());
    private static final Logger LOGGER2 = MY_LOGGER2.LOGGER;
    public static final PrintStream OUT = System.out;

    public static void example2 () {

        String message = getMessage2();
        //message = getEmptyMessage2();

        if (!message.isEmpty()) OUT.print("===========");
        else LOGGER2.severe("Empty message!\n");
    }

    public static String getMessage2 () {
        LOGGER2.info("Call method \"getMessage2\"\n");
        return "Message : \"Hello JUL!\" (Java Util Logger)\n"
                .replaceAll("[\"()]", "")
                .repeat(1);
    }

    public static String getEmptyMessage2 () {
        LOGGER2.info("Call method \"getEmptyMessage2\"\n");
        return "";
    }
}

package JUL;

import JULogger.JULogger;
import junit.framework.TestCase;

import java.util.logging.Logger;

public class JULStartTest extends TestCase{

    private final JULogger MY_LOGGER = new JULogger(JULStartTest.class.getName());
    private final Logger LOGGER = MY_LOGGER.myLogger;

    public void testGetMessage() {
        LOGGER.info("Call method \"testGetMessage\"\n");
        assertNotNull(JULStart.getMessage());
        assertTrue(JULStart.getMessage().contains("JUL"));
        assertTrue(JULStart.getMessage().contains("Message :"));
        LOGGER.info("Test : \"testGetMessage\" is successfully!\n");
    }

    public void testGetEmptyMessage() {
        LOGGER.info("Call method \"testGetEmptyMessage\"\n");
        assertTrue("\"getEmptyMessage\" is not empty!", JULStart.getEmptyMessage().isEmpty());
        LOGGER.info("Test : \"testGetEmptyMessage\" is successfully!\n");
    }
}
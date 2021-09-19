package JUL;

import junit.framework.TestCase;

public class JUL2StartTest extends TestCase {

    public void testGetMessage2() {
        assertNotNull(JULStart.getMessage());
        assertTrue(JULStart.getMessage().contains("JUL"));
        assertTrue(JULStart.getMessage().contains("Message :"));
    }

    public void testGetEmptyMessage2() {
        assertTrue("\"getEmptyMessage\" is not empty!", JULStart.getEmptyMessage().isEmpty());
    }
}
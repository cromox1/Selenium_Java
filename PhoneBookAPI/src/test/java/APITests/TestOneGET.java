package APITests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOneGET {

    private static void testingString(String actual, String expected) {
        assertEquals(expected, actual);
    }
    private static void testingInteger(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testGETname() {
        // System.out.println("Tests PhoneBook user - Name");
        testingString(RESTUtil.RESTGetName("admintwo", "password"), "admintwo");
        testingString(RESTUtil.RESTGetName("noneexistuser", "anywordtext"), "ErrorGET");
    }

    @Test
    public void testGETnameAnonymous() {
        // System.out.println("Tests PhoneBook user - Name");
        testingString(RESTUtil.RESTGetNameAnonymous("admintwo"), "admintwo");
        testingString(RESTUtil.RESTGetNameAnonymous("noneexistuser"), "ErrorGET");
    }

    @Test
    public void testGETStatusCode() {
        // System.out.println("Tests PhoneBook user - StatusCode");
        testingInteger(RESTUtil.RESTcheckStatus("admintwo", "password"), 200);
        testingInteger(RESTUtil.RESTcheckStatus("noneexistuser", "anywordtext"), 401);
    }
}

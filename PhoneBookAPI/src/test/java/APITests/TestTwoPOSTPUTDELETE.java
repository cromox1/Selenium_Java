package APITests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTwoPOSTPUTDELETE {

    private static void testingString(String actual, String expected) {
        assertEquals(expected, actual);
    }
    private static void testingInteger(int actual, int expected) { assertEquals(expected, actual); }

    static String user1 = "testone";

    @Test
    public void test1POSTuser() {
        String firstname = "Cubaan";
        String inputPOST = "{ \"nickname\": \"" + user1 + "\", \"password\": \"" + user1 + "\", \"firstName\": \"" + firstname + "\" }";
        testingInteger(RESTUtil.RESTPOSTName(inputPOST), 200);
    }

    @Test
    public void test2GETuserAnonymous() {
        testingString(RESTUtil.RESTGetNameAnonymous(user1), user1);
    }

    @Test
    public void test3PUTuser() {
        String firstname = "Testing";
        String inputPOST = "{ \"nickname\": \"" + user1 + "\", \"password\": \"test123\", \"firstName\": \"" + firstname + "\" }";
        testingInteger(RESTUtil.RESTPUTName(inputPOST, user1), 200);
    }

    @Test
    public void test4GETmodifyuser() {
        String firstname = "Testing";
        testingString(RESTUtil.RESTGetFirstname(user1), firstname);
    }

    @Test
    public void test5DELETEuser() {
        testingInteger(RESTUtil.RESTDELETEuser(user1), 200);
    }

}

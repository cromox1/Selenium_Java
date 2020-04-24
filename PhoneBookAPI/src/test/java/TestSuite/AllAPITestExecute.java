package TestSuite;


import APITests.TestOneGET;
import APITests.TestTwoPOSTPUTDELETE;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestOneGET.class,
        TestTwoPOSTPUTDELETE.class,
})

public class AllAPITestExecute {
    // This class remains empty, it is used only as a holder for the above annotations
}
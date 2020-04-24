package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class PageTitleTests extends BaseTest {
    @Test (priority = 1)
    public void LoginPageTest () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedTitle = "Log in | Django site admin";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .assertEqualsPageTitle(expectedTitle);
    }
}

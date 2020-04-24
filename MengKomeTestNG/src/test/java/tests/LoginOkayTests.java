package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class LoginOkayTests extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest_ValidUserNameValidPassword () {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedPageTitle = "Site administration | Django site admin";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .goToLoginPage()
                .loginToMengKome("akardua", "qawsed456789")
                .assertEqualsPageTitle(expectedPageTitle);
    }
}

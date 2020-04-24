package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class LoginFailTests extends BaseTest {

    @Test (priority = 1)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedTextError = "Please enter the correct username and password for a staff account. Note that both fields may be case-sensitive.";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .goToLoginPage()
                .loginToMengKome("testjerni", "11223344hentam")
                .verifyLoginUserName(expectedTextError)
                .verifyLoginPassword(expectedTextError);
    }

    @Test (priority = 2)
    public void invalidLoginTest_InvalidUserEmptyPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedTextError = "Please enter the correct username and password for a staff account. Note that both fields may be case-sensitive.";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .goToLoginPage()
                .loginToMengKome("testjernicom","x")
                .verifyLoginUserName(expectedTextError)
                .verifyLoginPassword(expectedTextError);
    }

    @Test (priority = 3)
    public void invalidLoginTest_EmptyUserValidPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedTextError = "Please enter the correct username and password for a staff account. Note that both fields may be case-sensitive.";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .goToLoginPage()
                .loginToMengKome("x","11223344hentam")
                .verifyLoginUserName(expectedTextError)
                .verifyLoginPassword(expectedTextError);
    }

    @Test (priority = 4)
    public void invalidLoginTest_EmptyUserEmptyPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedTextError = "Please enter the correct username and password for a staff account. Note that both fields may be case-sensitive.";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .goToLoginPage()
                .loginToMengKome("x","x")
                .verifyLoginUserName(expectedTextError)
                .verifyLoginPassword(expectedTextError);
    }

    @Test (priority = 5)
    public void invalidLoginTest_ValidUserEmptyPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        String expectedTextError = "Please enter the correct username and password for a staff account. Note that both fields may be case-sensitive.";

        //*************PAGE METHODS********************
        homePage.goToMengKomePage()
                .goToLoginPage()
                .loginToMengKome("mainakar","x")
                .verifyLoginUserName(expectedTextError)
                .verifyLoginPassword(expectedTextError);
    }
}

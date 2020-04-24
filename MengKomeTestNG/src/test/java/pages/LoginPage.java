package pages;

/*
public class LoginPage {
}
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //*********Web Elements*********
    By usernameBy = By.id("id_username");
    By passwordBy = By.name("password");
    By loginButtonBy = By.xpath("//*[@type='submit']");
    By errorMessageUsernameBy = By.xpath("//p[@class='errornote']");
    By errorMessagePasswordBy = By.xpath("//p[@class='errornote']");

    //*********Page Methods*********

    public LoginPage loginToMengKome(String username, String password){
        //Enter Username(Email)
        elementSendText(usernameBy,username);
        //Enter Password
        elementSendText(passwordBy, password);
        //Click Login Button
        clickElement(loginButtonBy);
        return this;
    }

    //Verify Username Condition
    public LoginPage verifyLoginUserName (String expectedText) {
        // System.out.println("Error = " + elementReadText(errorMessageUsernameBy));
        // System.out.println(elementReadText(usernameBy));
        assertEqualsElementVsText(errorMessageUsernameBy, expectedText);
        return this;
    }

    //Verify Password Condition
    public LoginPage verifyLoginPassword (String expectedText) {
        // System.out.println("Error = " + elementReadText(errorMessagePasswordBy));
        // System.out.println(elementReadText(passwordBy));
        assertEqualsElementVsText(errorMessagePasswordBy, expectedText);
        return this;
    }
}

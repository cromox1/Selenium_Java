package pages;

/*
public class HomePage {
}
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "http://mengkome.pythonanywhere.com/";

    //*********Web Elements*********
    By signInButtonBy = By.xpath("//*[@type='submit']");

    //*********Page Methods*********
    //Go to Homepage
    public HomePage goToMengKomePage(){
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        clickElement(signInButtonBy);
        return new LoginPage(driver);
    }
}
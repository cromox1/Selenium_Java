package pages;

/*
public class BasePage {
}
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void clickElement(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    public void elementSendText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String elementReadText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //AssertElementText
    public void assertEqualsElementVsText(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(elementReadText(elementBy), expectedText);
    }

    //AssertPageTitle
    public void assertEqualsPageTitle(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.AfterSuite;
// import org.testng.annotations.AfterMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest         // same with @BeforeClass / @BeforeSuite not working / @BeforeMethod working but run many times
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterTest          // same with @AfterClass / @AfterSuite not working / @AfterMethod working but run many times
    public void teardown () {
        driver.close();
        driver.quit();
    }
}

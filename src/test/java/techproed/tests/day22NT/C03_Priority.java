package techproed.tests.day22NT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C03_Priority {


    WebDriver driver;


    @Test(priority = -2 )
    public void amazontest() {

        driver.get("http://amazon.com");
    }
    @Test(priority =-3 )
    public void techprotest() {

        driver.get("http://techproeducation.com");
    }
    @Test(priority = -1)
    public void facebooktest() {
        driver.get("http://facebook.com");
    }

    @BeforeMethod
    public void techproName() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod

    public void tearDown() {
        driver.close();
}}

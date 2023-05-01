package techproed.tests.day24Properties_Pages.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class NegativeTest {

    @Test
    public void test01() throws InterruptedException {
        /*
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        Acceptance Criteria
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error:
        User with email fake@bluerentalcars.com not found

         */

        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.
                        getProperty("fakeemail"),
                Keys.TAB, ConfigReader.getProperty("fakepass"),Keys.TAB,Keys.ENTER);

        Thread.sleep(3000);
        Assert.assertTrue(blueRentalPage.hatamesaji.isDisplayed());
        Driver.closeDriver();


    }
}

package techproed.tests.day24Properties_Pages.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class PositiveTest {
    @Test(groups = {"smoke"})
    public void test01() {
/*
        Acceptance Criteria:
        Admin olarak, uygulamaya giriş yapabilmeliyim
        https://www.bluerentalcars.com/
        Admin email: jack@gmail.com
        Admin password: 12345
         */
        Driver.getDriver("").get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.
                getProperty("fakeemail"),
                Keys.TAB, ConfigReader.getProperty("fakepass"), Keys.ENTER);

      Driver.closeDriver();

    }
}

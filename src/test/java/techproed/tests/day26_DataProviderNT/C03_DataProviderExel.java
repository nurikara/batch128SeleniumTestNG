package techproed.tests.day26_DataProviderNT;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.*;

import java.util.Arrays;

public class C03_DataProviderExel {
    @Test
    public void test01() {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");

        System.out.println("excelUtils.getDataArrayWithoutFirstRow() = " + Arrays.deepToString(excelUtils.getDataArrayWithoutFirstRow()));
    }

    @Test(dataProvider="blueRental",dataProviderClass = DataProviderUtils.class)
    public void test01(String email, String password) {
        Driver.getDriver("chrome").get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}

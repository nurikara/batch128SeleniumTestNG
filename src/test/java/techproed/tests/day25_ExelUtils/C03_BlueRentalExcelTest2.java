package techproed.tests.day25_ExelUtils;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;

import java.io.IOException;

public class C03_BlueRentalExcelTest2 {
    @Test
    public void test01() throws IOException, InterruptedException {
      /*
EXCEL dosyasindaki tum email ve passwordler ile
BlueRentalCar sayfasina gidip login olalim?
 */
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx", "customer_info");
        Driver.getDriver("").get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        for (int i = 1; i <= excelUtils.rowCount(); i++) {
            //i yi birden başlattık çünkü veriler birinci satırda başlıyor
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);

            blueRentalPage.login.click();
            Thread.sleep(2000);
            blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            assert blueRentalPage.verify.isDisplayed();
            Thread.sleep(2000);
            blueRentalPage.login3.click();
            Thread.sleep(2000);
            blueRentalPage.logout.click();
            Thread.sleep(2000);
            blueRentalPage.ok.click();
            Thread.sleep(2000);



        } Driver.closeDriver();

    }
}

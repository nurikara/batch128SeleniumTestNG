package techproed.tests.odev;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Odev02 {

    @Test
    public void test01() {
//        Description:
//        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
//        Acceptance Criteria:
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
//        Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
        BlueRentalPage blueRentalPage = new BlueRentalPage();
       blueRentalPage.login.click();
       blueRentalPage.email.
               sendKeys(ConfigReader.getProperty("email11"), Keys.TAB,ConfigReader.
                       getProperty("pass11"),Keys.TAB,Keys.ENTER);


//        Hata Mesaji:
   //   assert (blueRentalPage.hata.getText().equals("Bad credentials"));
//        Bad credentials
//        Test Data:
//        Customer email: jack@gmail.com
//        Customer password: fakepass

    }
}

package techproed.tests.odev;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Odev03 {
//    ODEV-3
//    Description:
//    Geçerli giriş yapmadan rezervasyon yapamamalı

//    Acceptance Criteria:
//    Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
//    Ve giris yapilmadiginda
//    Hata mesaji almali : Please first login
//    Giris yapildiginda hata mesaji alınmamalı
//    User Story 5


    @Test
    public void test01() {

        Driver.getDriver("edge").get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();


        blueRentalPage.selectCar.
                sendKeys("BZ",
                        Keys.TAB,"Istanbul",Keys.TAB,"Yozgat",
                        Keys.TAB,"20.03.2023",Keys.TAB,"23.00",
                        Keys.TAB,"18.03.2023",Keys.TAB,"23.00",Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(3);
        Assert.assertTrue(blueRentalPage.errorMessage.getText().contains("Please first login"));
    }
}

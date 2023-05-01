package techproed.tests.odev;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class Odev01 {
//    ODEV-1
//    Description:
//    Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
//    Acceptance Criteria:
//    Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
//    Error Message: email must be a valid email
//    Dogru email uzantisi girildiğinde hata mesajı alınmamalı
//    https://email-verify.my-addr.com/list-of-most-popularemail-
//    domains.php
//    User Story 4

    @Test
    public void testName() {
        //sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blue_Url"));
    BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentAcar_Email"),
    Keys.TAB, ConfigReader.getProperty("blueRentAcar_Password"), Keys.ENTER);
        ReusableMethods.bekle(3);

    assertTrue(blueRentalPage.hataMesaji2.getText().equals("Bad credentials"));
}}

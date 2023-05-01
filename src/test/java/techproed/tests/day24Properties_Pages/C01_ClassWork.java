package techproed.tests.day24Properties_Pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.TestCenterTechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_ClassWork {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        Driver.closeDriver();
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
    }

    public static class C03_PageKullanimi {
        @Test
        public void test01() {


            //https://testcenter.techproeducation.com/index.php?page=form-authentication

            Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));
            //Page object Model kullanarak sayfaya giriş yapildigini test edin
            TestCenterTechproPage testCenterTechproPage=new TestCenterTechproPage();
            testCenterTechproPage.userName.sendKeys(ConfigReader.getProperty("kaniciadi"), Keys.TAB,
                    ConfigReader.getProperty("kullaniciPassword"),Keys.ENTER);
            //Sayfadan cikis yap ve cikis yapildigini test et

            Assert.assertTrue(testCenterTechproPage.text.isDisplayed());
            testCenterTechproPage.logout.click();
            Assert.assertTrue(testCenterTechproPage.giris.isDisplayed());

            Driver.closeDriver();
        }
    }
}

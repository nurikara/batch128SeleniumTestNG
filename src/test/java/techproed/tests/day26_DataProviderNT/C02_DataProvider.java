package techproed.tests.day26_DataProviderNT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

import javax.xml.crypto.Data;

public class C02_DataProvider {
    @Test(dataProvider="City",dataProviderClass = DataProviderUtils.class)
    public void test1(String ad,String bolge,String plaka ) {

        System.out.println("Sehir adı: " + ad + ", Bölge: " + bolge + ", Plaka: " + plaka);
    }
    /*
    Yukardaki örneklerdeki gibi blueRentalCar sayfasına login olunuz
    Her data için login olduğunuzu doğrulayınız
    NOT:configuration.properties dosyasındaki verileri kullanınız
     */

}

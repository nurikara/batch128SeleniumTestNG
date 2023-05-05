package techproed.tests.day28_liseteners;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class C02 {
     /*
    Bir class'ta listener kullanabilmek için class'dan önce @Listeners notasyonu eklememiz gerekir.
    Notasyon içine parametre olarak olusturmus oldugumuz utulities package
     nin altindakiListeners class'ının yolunu belirtmemiz gerekir.
     */

    @Test
    public void test01() {
        System.out.println("PASSED");
        Assert.assertEquals(2,2);
    }

    @Test
    public void test02() {
        System.out.println("FAILED");
        Assert.assertEquals(2,1);
    }

    @Test
    public void test03() {
        throw new SkipException("Method atlandi");
    }

    @Test
    public void test04() {
        System.out.println("no such element exception");
        //Driver.getDriver("chrome").findElement(By.xpath("sdASDs"));
        throw new NoSuchElementException("No such element exception");

    }
}


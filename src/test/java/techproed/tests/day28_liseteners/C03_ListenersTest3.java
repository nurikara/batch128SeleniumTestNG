package techproed.tests.day28_liseteners;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class C03_ListenersTest3 {
    /*
Test class'ımızda fail olma durumu olan bir testin listeners ile tekrar çalışmasını istersek
@Test notasyonundan sonra parametre olarak retryAnalyzer yazar ve oluşturmuş olduğumuz ListenersRetry class'ının
yolunu belirtiriz.
*/

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test01() {
        System.out.println("PASSED");
        Assert.assertEquals(2,2);
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test02() {
        System.out.println("FAILED");
        Assert.assertEquals(2,1);
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test03() {
        throw new SkipException("Method atlandi");
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test04() {
        System.out.println("no such element exception");
        //Driver.getDriver("chrome").findElement(By.xpath("sdASDs"));
        throw new NoSuchElementException("No such element exception");

    }
}

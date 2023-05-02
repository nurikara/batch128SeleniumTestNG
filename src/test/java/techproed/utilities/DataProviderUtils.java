package techproed.utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUtils {
    @DataProvider
    public Object[][] sehirVerileri(){

        return new Object[][]{ {"İstanbul","Marmara", "34"}, {"Diyarbakır", "Güneydoğu", "21"}, {"Ankara", "İçanadolu", "06"} };

    }

    @DataProvider
    public static Object[][] kullaniciBilgileri(){

        return new Object[][]{ {"Ali", "Ali.123"}, {"Ayşe", "Ayse.123"}, {"Fatma", "Ftm_987"}   };

    }
    @DataProvider
    public static Object[][] City() {
        return new Object[][]{{"İstanbul","Marmara", "34"}, {"Diyarbakır", "Güneydoğu", "21"}, {"Ankara", "İçanadolu", "06"} };
    }

    @DataProvider()
    public Object[][] customerData() {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        //ExcelUtils objesi oluşturarak  getDataArray() methodu ile iki boyutlu String Array'i DataProvider olarak return yapıyorum.
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();
    }


    @DataProvider
    public Object[][] blueRental() {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();

    }
}

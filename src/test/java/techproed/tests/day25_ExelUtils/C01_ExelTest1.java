package techproed.tests.day25_ExelUtils;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtils;

import java.io.IOException;

public class C01_ExelTest1 {
    @Test
    public void ExelTest01() throws IOException {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        ExcelUtils excelUtils=new ExcelUtils(path,sayfa);
        System.out.println(excelUtils.getCellData(1, 0));
        String email = excelUtils.getCellData(1,0);
        String password = excelUtils.getCellData(1,1);
        System.out.println(email+" || "+password);

        System.out.println("excelUtils.columnCount() = " + excelUtils.columnCount());
    }
}

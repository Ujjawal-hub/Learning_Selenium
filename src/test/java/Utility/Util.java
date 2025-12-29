package Utility;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.devtools.v140.io.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Util {





    public static Object[][] getdata(String sheetname){

           FileInputStream fileInputStream;
        Workbook book;
          Sheet sheet;

        Object[][] data=null;

       String  Sheetpath = System.getProperty("user.dir") +"/src/test/resources/login_credentials.xlsx";

        try {
            fileInputStream = new FileInputStream(Sheetpath);
            book = WorkbookFactory.create(fileInputStream);
            sheet = book.getSheet(sheetname);






         data = new   Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

            for(int i=0; i< data.length;i++){

                for(int j=0; j<data[0].length;j++){

                    data[i][j] = sheet.getRow(i+1).getCell(j).toString();

                }

            }





        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}

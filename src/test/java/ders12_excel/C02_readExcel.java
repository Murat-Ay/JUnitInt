package ders12_excel;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;
public class C02_readExcel {
    @Test
    public void readExcelTesti() throws IOException {
        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu=System.getProperty("user.home")+"/Desktop/ulkeler.xlsx";
        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu);
        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //10. WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fis);
        //11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet= workbook.getSheet("Sayfa1");
        //12. Row objesi olusturun sheet.getRow(index)
        Row row = sheet.getRow(2);
        //13. Cell objesi olusturun row.getCell(index)
        Cell cell= row.getCell(2);
        System.out.println(cell); // Arnavutluk
    }
}
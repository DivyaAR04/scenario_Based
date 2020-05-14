import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\seleniumworks\\ClassicSelenium1\\data\\selenium1.xls");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		Row rc=sh.getRow(1);
		Cell cc=rc.getCell(1);
		// data= cc.toString();
		String data=cc.getStringCellValue();
		System.out.println(data);
		
		
        Cell c=wb.getSheet("Sheet1").getRow(3).getCell(0);
		
		String data1=new DataFormatter().formatCellValue(c);
		System.out.println(data1);
		}

}

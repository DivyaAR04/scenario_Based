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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataBaseConn {
//static
//{
//	System.setProperty("webdriver.gecko,driver","./ClassicSelenium1/driver/geckodriver.exe" );
//}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
     //WebDriver driver=new FirefoxDriver();
     File file=new File("C:\\Users\\viprava\\Desktop\\Excelsheet.xls");
     FileInputStream fis= new FileInputStream(file);
     Workbook wb=WorkbookFactory.create(fis);
   	 Sheet sh=wb.getSheet("sheet1");
   	 Row rc=sh.getRow(1);
   	 Cell cc=rc.getCell(1);
   	 String data= cc.toString();
   	// String data=cc.getStringCellValue();
    	System.out.println(data);
     
    	//File f=new File("C:\\manu4\\dollibar\\src\\test\\resources\\Data\\Sample.xls");
		//FileInputStream file= new FileInputStream(f);
		//Workbook wb=WorkbookFactory.create(file);
		//Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
		
		//String data1=new DataFormatter().formatCellValue(c);
		//System.out.println(data1);
				
     
     
     
     
     
     
     
     
     
     
     
    // FileInputStream fis= new FileInputStream(file);
     //Workbook wb=WorkbookFactory.create(fis);
     //Sheet sh=wb.getSheet("sheet1");
     //Row rc=sh.getRow(1);
     //Cell cc=rc.getCell(1);
     //String data=cc.toString();
     //String data=cc.getStringCellValue();
    // System.out.println(data);
     
     
     
     

	}

}

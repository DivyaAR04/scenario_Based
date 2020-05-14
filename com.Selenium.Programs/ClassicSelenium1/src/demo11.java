import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo11 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//File file=new File("‪E:\\selenium1.xls");
		FileInputStream fis=new FileInputStream("C:\\Users\\viprava\\Desktop\\Excelsheet.xls");
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet s=wb.getSheet("Testdata");
		Iterator<Row> rowIt=s.iterator();
		while(rowIt.hasNext())
		{
			System.out.println(rowIt.next().getCell(0).getStringCellValue());
		}
       
		}

	

	
}

package seleniumPractice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowsCols {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
        
		List <WebElement> cols=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		int csize=cols.size();
		
		List <WebElement> rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
		int rsize=rows.size();
		
		System.out.println("number of rows "+rsize);
		System.out.println("number of coloum "+csize);

		driver.quit();
	
	}

}

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxWithOutDup {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> options=month.getOptions();
		
		HashSet<String> hs=new HashSet<String>();
		Iterator it=hs.iterator();
		if(it.hasNext())
		{
			it.next();
			
		}
		
		
		driver.quit();
		
	}

}

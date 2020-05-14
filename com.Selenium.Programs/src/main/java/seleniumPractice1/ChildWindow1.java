package seleniumPractice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(20);

		Set<String> ws = driver.getWindowHandles();
		System.out.println(ws.size());
		
		for(String win:ws)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			Thread.sleep(20);
			driver.close();
			
		}
		driver.close();
	}

}

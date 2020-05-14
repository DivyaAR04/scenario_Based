import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");

		Set<String> ws = driver.getWindowHandles();
		
	// code for closing child windows and parent window	
		for(String win:ws)
		{
			driver.switchTo().window(win);
			driver.quit();
			
		}
		driver.quit();
	}

}

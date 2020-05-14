import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAllChild {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
 
		String win=driver.getWindowHandle();
		
		Set<String> ws = driver.getWindowHandles();
		
		driver.switchTo().window(win);
		String tit=driver.getTitle();
		
	// code for closing child windows and parent window	
		for(String win1:ws)
		{
			driver.switchTo().window(win1);
			String ctit=driver.getTitle();
			System.out.println(ctit);
			if(!tit.equals(ctit))
			 {driver.close();}
			Thread.sleep(200);
			
		}
		driver.quit();

	}

}

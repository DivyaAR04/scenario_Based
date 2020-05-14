package seleniumPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		String expTitle="Demo Guru99 Page";
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		
		
		if(expTitle.equals(driver.getTitle()))
		{
			System.out.println("landed on expected page");
		}
		else
		{
			System.out.println("landed on other page");
		}
		
	
		
		driver.quit();
	}

}

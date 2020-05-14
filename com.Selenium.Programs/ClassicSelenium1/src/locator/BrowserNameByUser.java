package locator;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNameByUser {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the browser you want to open");
	String browser=sc.next();
	
	if(browser.equalsIgnoreCase("Firefox"))
	{driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com/"); 
	 Thread.sleep(2000);
	 driver.close();
	}
	else
	{	
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.close();
			
		}
	}
	
	}

}

package seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLink {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/login/identify?ctx=recover");
	driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
	
	if (driver.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at Facebook's homepage");					
    } else {			
        System.out.println("We are NOT in Facebook's homepage");					
    }		
			driver.quit();		

	}

}

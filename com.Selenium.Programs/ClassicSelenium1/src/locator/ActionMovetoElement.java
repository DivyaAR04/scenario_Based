package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMovetoElement {
static
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		Thread.sleep(2000);
		String xp="/html/body/header/div/nav/div[2]/ul/li[2]/a";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions act= new Actions(driver);
		act.moveToElement(menu).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/div/nav/div[2]/ul/li[2]/ul/li[1]/a"));
		Thread.sleep(2000);
		driver.close();
		
	}

}

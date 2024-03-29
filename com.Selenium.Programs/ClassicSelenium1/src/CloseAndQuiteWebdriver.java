import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseAndQuiteWebdriver {
static
{
	System.setProperty("webdriver.gecko.driver","C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
	
}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement owe=driver.findElement(By.linkText("Gmail"));
	Thread.sleep(5000);
	Actions oAction=new Actions(driver);
	oAction.moveToElement(owe);
	//Thread.sleep(2000);
	oAction.contextClick(owe).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	//driver.close();
	driver.quit();
}
}

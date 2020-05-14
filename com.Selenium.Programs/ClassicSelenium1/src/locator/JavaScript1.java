package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
// code to blink in a webpage
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript1 {
public static void flash(WebElement element, WebDriver driver)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0;i<100;i++)
	{
		changeColor("#000000",element,driver);
		changeColor(bgcolor,element,driver);
	}
	}
	
	private static void changeColor(String color, WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
	try
	{
		Thread.sleep(20);
	}
	catch(InterruptedException e)
	{
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		
		driver.manage().window().maximize();
		
		WebElement tryfree = driver.findElement(By.xpath("/html/body/header/div/a[2]"));
		
		JavaScript1.flash(tryfree,driver);
		

	}

}

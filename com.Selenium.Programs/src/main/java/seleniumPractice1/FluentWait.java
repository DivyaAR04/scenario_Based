package seleniumPractice1;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 // System.setProperty("WebDriver.gecko.Driver", "./Driver/geckodriver.exe");
	    WebDriverManager.firefoxdriver().setup();
		
		
		WebDriver driver=new FirefoxDriver();
		String url="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin ";
		driver.get(url);
		
		//WebElement email=driver.findElement(By.id("identifierId"));
		//email.sendKeys("divyaar04@gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("divyaar04@gmail.com");
		driver.findElement(By.xpath("//*[@class='CwaK9']//*[text()='Next']")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement passwd1 = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath(".//*[@type='password']"));
			}
			
		});
		
		passwd1=driver.findElement(By.xpath(".//*[@type='password']"));
		System.out.println(passwd1.isDisplayed());
		
		driver.quit();
	}

}

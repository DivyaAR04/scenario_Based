package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();

	// find the webelement i.e. day, and store it in a webelement variable
	WebElement month_dropdown = driver.findElement(By.id("day"));
	//select the drop down box with the help of web element
	Select oSelect = new Select(month_dropdown);
	// select the 3rd index with the help of select class
	oSelect.selectByIndex(3);
	Thread.sleep(3000);
	
	//WebElement year_yy = driver.findElement(By.id("year"));
	Select year_y = new Select(driver.findElement(By.id("year")));
	year_y.selectByValue("2000");
	Thread.sleep(3000);
	
	//WebElement month_m = driver.findElement(By.id("month"));
	Select month_d1 = new Select(driver.findElement(By.id("month")));
	month_d1.selectByVisibleText("Jul");
	driver.quit();
}
}


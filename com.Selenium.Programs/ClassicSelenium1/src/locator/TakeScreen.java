package locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreen {
static
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}

	public static void main(String[] args) throws InterruptedException,IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sou=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshor/image1.png");
		FileUtils.copyFile(sou, des);
		Thread.sleep(2000);
		driver.quit();
		
	}

}

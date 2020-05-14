package locator;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotdemo {
	public static void main(String[] args) throws InterruptedException, IOException
	{   System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://commons.apache.org//proper//commons-io//download_io.cgi");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String sysdate = dateFormat.format(date);
		System.out.println("Current date and time: --- "+sysdate);
		String dfile="img";
		File dest=new File("./screenshor/"+dfile+".png"+sysdate);
		//File dest=new File("./screenshor/image.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.quit();
		
		
				
	}
	

}

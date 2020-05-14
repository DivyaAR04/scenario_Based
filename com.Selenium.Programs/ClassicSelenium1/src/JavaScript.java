import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.xml.txw2.Document;

public class JavaScript {
static
{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/viprava/Desktop/sample1.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String entertext="document.getElementById('un').value='divya'";
		
		js.executeScript(entertext);
		Thread.sleep(2000);
		
		String cleartext="document.getElementById('un').value=' '";
		js.executeScript(cleartext);
		Thread.sleep(2000);
		
		String scrol="window.scrollBy(0,1500)";
		js.executeScript(scrol);
		Thread.sleep(2000);
		
		
		
		
		String onclick="document.getElementById('bt').click()";
		js.executeScript(onclick);
		Thread.sleep(2000);
		driver.quit();

	}

}

package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Idlocator {
static
{
	System.setProperty("webdriver.gecko.driver", "C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("file:/// C:/Users/viprava/Desktop/sample1.html");
//driver.findElement(By.id("/n")).click();
//Thread.sleep(2000);
//driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.name("uname")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.className("abc")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.close();
	}

}

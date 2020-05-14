import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program101 {
static
{
	System.setProperty("webdriver.gecko.driver", "C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/56");
		WebElement fn=driver.findElement(By.id("u_0_m"));
		fn.sendKeys("viprava@yahoo.com");
		fn.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		WebElement ln=driver.findElement(By.id("u_0_o"));
		ln.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}

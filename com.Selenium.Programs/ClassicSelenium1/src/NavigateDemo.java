import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateDemo {
static
{
	System.setProperty("webdriver.gecko.driver", "C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(6000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}

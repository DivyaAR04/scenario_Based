import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateWebDriver {
static
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		String url="https://www.toolsqa.com/selenium-webdriver/object-repository-for-selenium-using-json/";
		driver.navigate().to(url);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}

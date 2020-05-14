import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {
static {
	System.setProperty("webdriver.gecko.driver", "C:\\seleniumworks\\ClassicSelenium\\driver\\geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
Thread.sleep(2000);
driver.close();
	}

}

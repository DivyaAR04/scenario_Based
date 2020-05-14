import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Program100 {
static
{
	//System.setProperty("webdriver.chrome.driver","C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe" );
	System.setProperty("webdriver.gecko.driver", "C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
     	WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		

	}

}

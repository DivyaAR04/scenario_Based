import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethodsWebdriver 
{
static
{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	String title=driver.getTitle();
	Thread.sleep(2000);
	System.out.println(title);
	String url=driver.getCurrentUrl();
	Thread.sleep(2000);
	System.out.println(url);
	String source=driver.getPageSource();
	Thread.sleep(2000);
	System.out.println(source);
	driver.close();
	
	
}
	
}

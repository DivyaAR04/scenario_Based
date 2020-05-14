
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
		static {
			
		}
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.gmail.com");
	Thread.sleep(2000);
	driver.close();

	}

}

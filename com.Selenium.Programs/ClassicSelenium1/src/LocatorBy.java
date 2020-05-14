import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorBy {
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		String link="https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com";
		driver.get(link);
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_m")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		
	}

}

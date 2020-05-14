package locator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Select 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//js.executeScript("window.scrollBy(0,300)");
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select oSelect = new Select(month_dropdown);
		List<WebElement> month_list = oSelect.getOptions();
		int total_month = month_list.size();
		System.out.println("Total count is "+total_month);
		for(WebElement ele:month_list)
		{
		String month_name = ele.getText();
		System.out.println("Months are"+month_name);
		}
		 
		driver.quit();
		 
		}
		 
}

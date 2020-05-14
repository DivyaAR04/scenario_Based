import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {
static {
	System.setProperty("webdriver.gecko.driver","C:\\seleniumworks\\ClassicSelenium1\\driver\\geckodriver.exe");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String Tit= driver.getTitle();
		String cur=driver.getCurrentUrl();
		String ps=driver.getPageSource();
		System.out.println(Tit);
		System.out.println(cur);
		System.out.println(ps);
		

	}

}

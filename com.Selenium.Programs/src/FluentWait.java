import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FluentWait {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver", "./Driver/geckodriver.exe ");
		WebDriver driver=new FirefoxDriver();
		String url="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(url);
		
		
		driver.quit();
	}

}

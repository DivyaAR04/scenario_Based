import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseWindowInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");

		Set<String> ws = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(ws);
		int size=ws.size();
		
		
	// code for closing child windows and parent window	
		for(int i=size-1;i>=0;i++)
		{
			String ws1=al.get(i);
			driver.switchTo().window(ws1);
			driver.close();
		}
		driver.quit();
	}

}

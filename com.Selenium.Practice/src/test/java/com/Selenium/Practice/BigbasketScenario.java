package com.Selenium.Practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BigbasketScenario 
{
	WebDriver driver;
	@Test
	public void BigBasket() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		
		Actions action=new Actions(driver);
		
		WebElement menu1=driver.findElement(By.xpath("//li[@class='dropdown full-wid hvr-drop']//a[@class='dropdown-toggle meganav-shop']"));
		System.out.println(menu1.getText());
		action.moveToElement(menu1).build().perform();

		
		String menuxpath="//li[@class='dropdown full-wid hvr-drop']//a[@class='dropdown-toggle meganav-shop']//parent::li[@class='dropdown full-wid hvr-drop']//descendant::ul[@class='dropdown-menu']//div[@class='tabs-left']//ul[@id='navBarMegaNav']//li[@class='ng-scope']";
		List<WebElement> elements = driver.findElements(By.xpath(menuxpath));
		
		int size=elements.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String firstMenuItemText=elements.get(i).getText();
			System.out.println(elements.get(i).getText());
			System.out.println("----------------------------------------");
			
			action.moveToElement(elements.get(i)).build().perform();

	
			Thread.sleep(1000);
			
		    String menuxpath1="//li[@class='dropdown full-wid hvr-drop']//a[@class='dropdown-toggle meganav-shop']//parent::li[@class='dropdown full-wid hvr-drop']//descendant::ul[@class='dropdown-menu']//div[@class='tabs-left']//ul[@id='navBarMegaNav']//li[@class='ng-scope']//a[contains(text(),'"+ firstMenuItemText +"')]//ancestor::ul[@class='dropdown-menu']//div[@class='tab-content col-md-9']//div[@class='col-md-3 pad-rt-0 desgn-fix']//ul[@class='nav nav-pills nav-stacked']//li[@class='ng-scope']//a";
		    List<WebElement> elements1=driver.findElements(By.xpath(menuxpath1));
		    System.out.println(elements1.size());
		    
		    for(int j=0;j<elements1.size();j++)
			{
				String firstMenuItemText1=elements1.get(j).getText();
				System.out.println(firstMenuItemText1);
			
				System.out.println("=====================================");
				
			//	action.moveToElement(elements1.get(i)).build().perform();
			}
		    Thread.sleep(1000);
		   
		    
		}
		driver.quit();
	}

}

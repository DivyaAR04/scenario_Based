package com.Selenium.Practice;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrbanLadder 
{
	WebDriver driver;
	@Test
	public void getAllNavOptions() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.urbanladder.com/");
		
		Actions action=new Actions(driver);
		
	 //   driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		
		List<WebElement> topNavItems=driver.findElements(By.xpath("//div[@id='topnav_wrapper']//descendant::span[@class='topnav_itemname']"));
		
		for(int i=0;i<topNavItems.size();i++)
		{
			String topNavItemName=topNavItems.get(i).getText();
			System.out.println("\n" + topNavItemName);
			System.out.println("------------------------------------");
			
		//	action.moveToElement(topNavItems.get(i)).build().perform();
			Thread.sleep(1000);
			
			String firstSubMenu="//div[@id='topnav_wrapper']//descendant::span[contains(text(),'"+topNavItemName +"')]//parent::li//descendant::div[@class='taxontype']//descendant::a";
			
			List<WebElement>firstSubMenuItem=driver.findElements(By.xpath(firstSubMenu));
			System.out.println(firstSubMenuItem.size());
			
			for(int j=0;j<firstSubMenuItem.size();j++)
			{
				String firstMenuItemText=firstSubMenuItem.get(j).getText();
				System.out.println(firstMenuItemText);
				System.out.println("=======================================");
				
			//	action.moveToElement(firstSubMenuItem.get(i)).build().perform();
				Thread.sleep(1000);
				
				String innersubmenu="//div[@id='topnav_wrapper']//child::span[contains(text(),'"+ topNavItemName +"')]//parent::li//child::div[@class='taxontype']//child::a[text()='"+ firstMenuItemText +"']//ancestor::li[@class='sublist_item']//ul[@class='taxonslist']//span";
				
				List<WebElement> innersubmenuText=driver.findElements(By.xpath(innersubmenu));
				
				for(int k=0;k<innersubmenuText.size();k++)
				{
					String innersubmenuname=innersubmenuText.get(k).getText();
					System.out.println(innersubmenuname);
				}
				System.out.println();
			}
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		}
		
	
	
	
	
	driver.close();
	}
	

}

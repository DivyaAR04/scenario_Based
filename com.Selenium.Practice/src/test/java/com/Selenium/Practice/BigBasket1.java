package com.Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		WebElement mainMenu = driver.findElement(By.xpath("//a[contains(.,'Shop by Category ')]"));
		Actions act=new Actions(driver);
		act.moveToElement(mainMenu).perform();
		Thread.sleep(3000);
		
		List<WebElement> subMenu = driver.findElements(By.xpath("//div[@id='navbar']/descendant::ul[@class='dropdown-menu']/descendant::div[@class='tabs-left']/ul[@id='navBarMegaNav']"));
		for(WebElement ListOfSubMenu:subMenu)
		{
			System.out.println(ListOfSubMenu.getText());
			System.out.println("==========================");
		}
		
		WebElement firstOption = driver.findElement(By.xpath("//div[@id='navbar']/descendant::ul[@class='dropdown-menu']/descendant::div[@class='tabs-left']/ul[@id='navBarMegaNav']/descendant::li[@class='ng-scope']/a[contains(.,'Foodgrains')]"));
		act.moveToElement(firstOption).perform();
		Thread.sleep(3000);
		
		List<WebElement> miniMenu = driver.findElements(By.xpath("//div[@id='navbar']/descendant::ul[@class='dropdown-menu']/descendant::div[@class='tabs-left']/div[@class='tab-content col-md-9']/descendant::div[@class='ng-scope']/descendant::ul[@class='nav nav-pills nav-stacked']"));
		for(WebElement listOfSubMenu:miniMenu)
		{
			System.out.println(listOfSubMenu.getText());
			System.out.println("--------------------------");
		}
		
		WebElement UnderfirstOption = driver.findElement(By.xpath("//div[@id='navbar']/descendant::ul[@class='dropdown-menu']/descendant::div[@class='tabs-left']/descendant::div[@class='ng-scope']/descendant::ul[@class='nav nav-pills nav-stacked']/descendant::li[@class='ng-scope']/a[contains(.,'Fresh Vegetables')]"));
		act.moveToElement(UnderfirstOption).perform();
		Thread.sleep(3000);
	
		List<WebElement> LastList = driver.findElements(By.xpath("//div[@id='navbar']/descendant::ul[@class='dropdown-menu']/descendant::div[@class='tabs-left']/descendant::div[@class='tab-content col-md-9']/div[@class='ng-scope']/descendant::div[@id='fruits-vegetables']/descendant::div[@class='tab-pane active']"));
		for(WebElement allOptions:LastList)
		{
			System.out.println(allOptions.getText());
			System.out.println("+++++++++++++++++++++++++++");
		}
		
	}
}


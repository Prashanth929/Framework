package com.CapsuleApplication.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
	{
		public  static void elementToBeClickable(WebDriver driver,WebElement element,int timeout)
		{
			WebDriverWait web=new WebDriverWait(driver, timeout);
			web.until(ExpectedConditions.visibilityOf(element));
			element.click();
		}
		public  static void sendValvesToTheWebelement(WebDriver driver,String valves,WebElement element,int timeout)
		{
			WebDriverWait web=new WebDriverWait(driver, timeout);
			web.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(valves);
		}
		}

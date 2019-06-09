package com.CapsuleApplication.Base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.CapsuleApplication.Utils.PropertyFile;


public class Basetest
	{		
		public static WebDriver driver;	
		
		public static void initilization() throws Exception
		{
			if(PropertyFile.fetchProperties("Browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\CapsuleCrmApplication\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
		
			else if(PropertyFile.fetchProperties("Browser").equals("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\CapsuleApplication\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
				driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get((PropertyFile.fetchProperties("Url")));
		}
		
		public static void exitBrowser()
		{
				driver.quit();
		}
	}
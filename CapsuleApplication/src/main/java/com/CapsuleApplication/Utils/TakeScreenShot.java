package com.CapsuleApplication.Utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.CapsuleApplication.Base.Basetest;

public class TakeScreenShot extends Basetest
	{
		public static void getPhoto(String getName)
		{
			TakesScreenshot n=(TakesScreenshot)driver;
			File src=n.getScreenshotAs(OutputType.FILE);
			File gg=new File(".//Screenshots//"+getName+".png");
			try 
			{
				org.openqa.selenium.io.FileHandler.copy(src, gg);
			}	 
			catch (Exception e) {
			e.printStackTrace();
			}
		}	
	}


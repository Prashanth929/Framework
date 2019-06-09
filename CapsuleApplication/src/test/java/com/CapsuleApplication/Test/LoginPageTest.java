package com.CapsuleApplication.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.CapsuleApplication.Base.Basetest;
import com.CapsuleApplication.Pages.DashBoardPage;
import com.CapsuleApplication.Pages.LoginPage;
import com.CapsuleApplication.Utils.PropertyFile;


public class LoginPageTest extends Basetest
{
	LoginPage login;
	DashBoardPage dashboard;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Basetest.initilization();
		login=new LoginPage();
	}

	@Test(priority=1)
	public void validateLoginPageTitle()
	{
		String expected_title=login.verifyLoginPageTitle();
		Assert.assertEquals(expected_title, "other CRM", "LoginPageTitle is not matching");	
	}
	
	@Test(priority=2)
	public void validateLoginButton() throws Exception 
	{
		 dashboard=login.verifyLogin(PropertyFile.fetchProperties("Username"),(PropertyFile.fetchProperties("Password")));
	}
	@AfterMethod
	public void teardown()
	{
		Basetest.exitBrowser();
	}
}

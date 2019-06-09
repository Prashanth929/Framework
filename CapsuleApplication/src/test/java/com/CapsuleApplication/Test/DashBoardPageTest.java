package com.CapsuleApplication.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.CapsuleApplication.Base.Basetest;
import com.CapsuleApplication.Pages.DashBoardPage;
import com.CapsuleApplication.Pages.LoginPage;
import com.CapsuleApplication.Pages.PeoplePage;
import com.CapsuleApplication.Utils.PropertyFile;

public class DashBoardPageTest extends Basetest
{
	LoginPage login;
	DashBoardPage dashboard;
	PeoplePage peoplepage;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Basetest.initilization();
		login=new LoginPage();
		dashboard=login.verifyLogin(PropertyFile.fetchProperties("Username"),(PropertyFile.fetchProperties("Password")));
	}
	
	@Test(priority=1)
	public void validateDashBoardPageTitle()
	{
		String	expected_title=dashboard.verifyDashBoardPagetTitle();
		Assert.assertEquals(expected_title, "Dashboard | other CRM", "DashBoardPagetTitle is not matching");
	}
	
	@Test(priority=2)
	public void validatePeopleOrganizationLink()
	{
		dashboard.clickOnPeopleOrganizationLink();
	}
	@AfterMethod
	public void teardown()
	{
		Basetest.exitBrowser();
	}
}

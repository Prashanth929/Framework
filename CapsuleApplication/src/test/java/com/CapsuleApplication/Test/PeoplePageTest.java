package com.CapsuleApplication.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.CapsuleApplication.Base.Basetest;
import com.CapsuleApplication.Pages.DashBoardPage;
import com.CapsuleApplication.Pages.LoginPage;
import com.CapsuleApplication.Pages.PeoplePage;
import com.CapsuleApplication.Utils.DataGenerator;
import com.CapsuleApplication.Utils.PropertyFile;

public class PeoplePageTest extends Basetest
{
	 LoginPage login;
	 DashBoardPage dashboard;
	 PeoplePage peoplepage;
	 
	 	public static String sheetName="PeopleInformation";
	 	@BeforeMethod
		public void setup() throws Exception
		{
			Basetest.initilization();
			login=new LoginPage();
			dashboard=login.verifyLogin(PropertyFile.fetchProperties("Username"),(PropertyFile.fetchProperties("Password")));
			
			dashboard.clickOnPeopleOrganizationLink();
			peoplepage=new PeoplePage();
		}

	 @DataProvider
	 public Object[][] getTestData()
	 {
		 Object data[][] = DataGenerator.getTestData(sheetName);
		 return data;
	 }
	 
	 @Test(priority=1,dataProvider="getTestData")
	 public void verifyNewContact(String Title,String Firstname,String Lastname,String jobtitle,String organization,String Email,String Adress) throws Exception
	 {
		 peoplepage.clickOnNewPeople();
		 peoplepage.createNewContact(Title,Firstname, Lastname, jobtitle,organization,Email,Adress);
		 dashboard.clickOnProfile();
		}
	 @AfterMethod
		public void teardown()
		{
			Basetest.exitBrowser();
		}
}


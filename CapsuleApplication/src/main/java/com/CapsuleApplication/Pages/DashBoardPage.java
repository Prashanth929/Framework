package com.CapsuleApplication.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.CapsuleApplication.Base.Basetest;
import com.CapsuleApplication.Utils.Waits;

public class DashBoardPage extends Basetest
{
	@FindBy(xpath="//a[@id='ember18']")
	 WebElement peopleOrganizationLink;

	@FindBy(id="ember24")
	WebElement caseLink;
	
	@FindBy(xpath="//div[@class='nav-bar-section nav-bar-account']")
	WebElement profile;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logout;
	
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String verifyDashBoardPagetTitle()
	{
		return driver.getTitle(); 
	}

	public PeoplePage clickOnPeopleOrganizationLink()
	{
		this.peopleOrganizationLink.click();
		return new PeoplePage();
	}
	public void clickOnProfile()
	{
		Waits.elementToBeClickable(driver, profile, 9);
		Waits.elementToBeClickable(driver, logout, 5);
	}
	
}

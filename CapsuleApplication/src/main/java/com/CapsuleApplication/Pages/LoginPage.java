package com.CapsuleApplication.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.CapsuleApplication.Base.Basetest;
import com.CapsuleApplication.Utils.Waits;
public class LoginPage extends Basetest
{
	//PageFactory
	
	@FindBy(xpath="//input[@name='login:usernameDecorate:username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='login:passwordDecorate:password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login:login']")
	WebElement loginButton;
	
	@FindBy(xpath="//img[@alt='capsulecrm']")
	WebElement logo;
	
	//initElements is to initilize non static webelements present in PageFactory class
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//actions performed on the webelements
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLogo()
	{
		return this.logo.isDisplayed();
	}
	//DashBoardPage is the landing page of LoginPage
	
	public DashBoardPage verifyLogin(String Username,String Password )
	{
		this.userName.sendKeys(Username);
		this.password.sendKeys(Password);
		Waits.elementToBeClickable(driver, loginButton, 9);
		return new DashBoardPage();
	}
	}
	

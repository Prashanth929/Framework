package com.CapsuleApplication.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CapsuleApplication.Base.Basetest;
import com.CapsuleApplication.Utils.Waits;

public class PeoplePage extends Basetest
{
	@FindBy(xpath="//a[text()='Add Person']")
	WebElement addPerson;
	
	@FindBy(xpath="//input[@id='party:fnDecorate:fn']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='party:lnDecorate:ln']")
	WebElement sureName;
	
	@FindBy(xpath="//input[@name='party:roleDecorate:jobTitle']")
	WebElement jobTitle;
	
	@FindBy(xpath="//input[@name='party:orgDecorate:org']")
	WebElement organizatn;
	
	@FindBy(xpath="//input[@name='party:j_id325:0:phnDecorate:number']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='party:j_id342:0:emlDecorate:nmbr']")
	WebElement email;
	
	@FindBy(xpath="(//span[@class='js-autocompleteOff'])[4]")
	WebElement adressButton;
	
	@FindBy(xpath="//textarea[@name='party:j_id389:0:strDecorate:str']")
	WebElement adressTextFeild;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement saveButton;

	public PeoplePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewPeople()
	{
		this.addPerson.click();
	}
	
	public  void createNewContact(String Title,String Firstname,String Lastname,String jobtitle,String organization,String Email,String Adress)
	{
		Select title_dropdown=new Select(driver.findElement(By.xpath("//select[@name='party:j_id108:j_id116']")));
		title_dropdown.selectByVisibleText(Title);
		Waits.sendValvesToTheWebelement(driver, Firstname, firstName, 9);
		Waits.sendValvesToTheWebelement(driver, Lastname, sureName, 5);
		Waits.sendValvesToTheWebelement(driver, jobtitle, jobTitle, 4);
		Waits.sendValvesToTheWebelement(driver,organization, organizatn, 9);
		Waits.sendValvesToTheWebelement(driver, Email, email, 9);
		Waits.elementToBeClickable(driver, adressButton, 9);
		Waits.sendValvesToTheWebelement(driver, Adress, adressTextFeild, 9);
		Waits.elementToBeClickable(driver, saveButton, 8);
	}
}

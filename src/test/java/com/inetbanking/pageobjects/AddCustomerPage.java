package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	
	WebDriver ldriver;
	
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
				
	}
	
	
	@FindBy(linkText="New Customer")
	WebElement linkAddNewCustomer;
	
	@FindBy(name="name")
	WebElement txtCustomer_Name;
	
	@FindBy(name="rad1")
	WebElement radioButtonGender;
		
	@FindBy(name="dob")
	WebElement DOB;
	
	@FindBy(name="addr")
	WebElement txtAddress;
	
	@FindBy(name="city")
	WebElement txtCity;
	
	@FindBy(name="state")
	WebElement txtstate;
	
	@FindBy(name="pinno")
	WebElement txtPin;
	
	@FindBy(name="telephoneno")
	WebElement txttelephone;
	
	@FindBy(name="emailid")
	WebElement txtemail;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath=".//input[@value='submit']")
	WebElement Bsubmit;
	
	@FindBy(xpath=".//input[@value='reset']")
	WebElement Breset;
	
	
	
	public void clickAddNewCustomer()
	{
		
		linkAddNewCustomer.click();
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custGender(String cgender)
	{
		radioButtonGender.click();
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}
	
	public void custName(String name)
	{
		txtCustomer_Name.sendKeys(name);
		
	}

}

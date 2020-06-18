package com.inetbanking.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {


WebDriver ldriver;

public loginPage(WebDriver rdriver)

{

ldriver=rdriver;
PageFactory.initElements(rdriver, this);

}

@FindBy(name="uid")
@CacheLookup
WebElement txtUserName;

@FindBy(name="password")
@CacheLookup
WebElement txtpassword;

@FindBy(name="btnLogin")
@CacheLookup
WebElement btnLogin;

@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
@CacheLookup
WebElement lnkLogout;

public void setusername(String uname)

{
txtUserName.sendKeys(uname);
}

public void setpwd(String pwd)

{
txtpassword.sendKeys(pwd);
}

public void clickSubmit()

{
btnLogin.click();
}
public void clickLogout()

{
	lnkLogout.click();
}




}

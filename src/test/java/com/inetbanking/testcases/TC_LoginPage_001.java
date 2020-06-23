package com.inetbanking.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.loginPage;

public class TC_LoginPage_001 extends BaseClass {



@Test(groups="mobile")
public void logintest() throws IOException
{


logger.error("URL is opened");

loginPage lp= new loginPage(driver);
lp.setusername(username);
logger.error("Entered Username");
lp.setpwd(password);
logger.info("Entered password");
lp.clickSubmit();

if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
{

Assert.assertTrue(true);
logger.info("Login test passed");
}
else {
	
captureScreen(driver,"logintest");
Assert.assertTrue(false);
logger.info("Login test Failed");

}



}



}


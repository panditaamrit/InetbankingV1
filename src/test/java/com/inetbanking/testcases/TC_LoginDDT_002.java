package com.inetbanking.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.loginPage;
import com.inetbanking.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider="logindata")
	public void loginDDT(String user,String pwd)
	{
		loginPage lp=new loginPage(driver);
		lp.setusername(user);
		lp.setpwd(pwd);
		lp.clickSubmit();
		if(isAlertPresent()==true) 
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
					
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
						
		}
		
		
		
	}
	
	public boolean isAlertPresent()
	{
		try {
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e)
		{
			
			return false;
		}
		
	}
	
	@DataProvider(name="logindata")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testdata/logindata.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int cocount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][cocount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<cocount;j++)
			{
				
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
							
			}
			
			
		}
		
		return logindata;
		
		
		
	}
	
	

}

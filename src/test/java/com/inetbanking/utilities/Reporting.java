package com.inetbanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter
{

	public ExtentHtmlReporter HtmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	
	public void onStart(ITestContext testcontext)
	{
		String timestamp = new SimpleDateFormat("yyMMddHHmmssZ").format(new Date());
		String repname="Test-Report-"+timestamp+".html";
		HtmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+repname);
		HtmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("OS","windows");
		extent.setSystemInfo("testername","Amrit");
		extent.setSystemInfo("Browser","chrome");
			
		HtmlReporter.config().setDocumentTitle("Inetbanking test project Report");	
		HtmlReporter.config().setReportName("Functional Report");
		HtmlReporter.config().setTheme(Theme.DARK);
		
			
	}
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS, "TEST CASE PASSED IS"+tr.getName());
			
	}
	
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.FAIL, "TEST CASE FAILED IS"+tr.getName());
		logger.log(Status.FAIL, "TEST CASE FAILED IS"+tr.getThrowable());
		
		String screenshotpath =System.getProperty("user.dir")+"/Screenshots"+tr.getName()+".png";
		File f= new File(screenshotpath);
		if(f.exists())
		{
			try {
				logger.fail("Screenshot is below"+ logger.addScreenCaptureFromPath(screenshotpath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
		
		
	}
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP, "TEST CASE SKIPPED IS"+tr.getName());
		
		
	}
	public void endReport(){
	     extent.flush();
	        }
}

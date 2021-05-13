package facebookproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import commonmethods.reusable;
import pages.createaccount;

public class facebookaccountcreation extends Browser
{
	createaccount ca;
	reusable rs = new reusable();

	@BeforeClass
	public void createaccountbuttonclick()
	{ 
		ca= new createaccount(dr);
		ca.createaccbutton();
		
	}
	
	@Test(priority=1)
	public void accoutncreate()
	{
		try
		{
		ca.firstname("sathish");
		ca.surname("kumar");
		ca.mobilenumber("9159211184");
		ca.newpassword("sathish");
		String reportpath =rs.capture(dr);
		et.log(LogStatus.PASS,et.addScreenCapture(reportpath));
		}
		catch(Exception e)
		{
			et.log(LogStatus.FAIL,e);
		}
	}
}

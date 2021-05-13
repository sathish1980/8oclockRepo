package pack.oclockmavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 
{
	@BeforeTest(alwaysRun=true)
	public void method3()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass(alwaysRun=true)
	public void method5()
	{
		System.out.println("Beforeclass in class 1");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method7()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test(priority=1,groups="Sanity")
	public void method9()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=0,groups="Sanity",dependsOnMethods="method9"
			,description="testcase2",enabled=true)
	public void method10()
	{
		System.out.println("Test case 2");
	}
	@Test(priority=2,groups= {"SIT","Sanity"})
	public void method11()
	{
		System.out.println("Test case 3");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method8()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass(alwaysRun=true)
	public void method6()
	{
		System.out.println("Afterclass in class 1");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4()
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite(alwaysRun=true)
	public void method2()
	{
		System.out.println("AfterSuite");
	}
	
}

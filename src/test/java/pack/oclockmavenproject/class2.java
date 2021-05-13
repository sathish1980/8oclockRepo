package pack.oclockmavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class2 
{


	@BeforeSuite(alwaysRun=true)
	public void method1()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass(alwaysRun=true)
	public void method5()
	{
		System.out.println("Beforeclass in class 2");
	}
	@AfterClass(alwaysRun=true)
	public void method6()
	{
		System.out.println("Afterclass in class 2");
	}
	
	@Test(groups="SIT")
	public void method11()
	{
		System.out.println("Test case 1 in class 2");
	}
	
	@Test(groups="SIT",invocationCount=4,
			invocationTimeOut=60,successPercentage=40,timeOut=60)
	public void method12()
	{
		System.out.println("Test case 2 in class 2");
	}
}

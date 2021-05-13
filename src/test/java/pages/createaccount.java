package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonmethods.reusable;

public class createaccount 
{
	WebDriver dr;
	reusable rs= new reusable();
	
	public createaccount(WebDriver dr)
	{
		this.dr=dr;
	}

	public void createaccbutton()
	{
		WebElement buttonclick=dr.findElement(By.xpath("//a[text()='Create New Account']"));
		rs.clickaction(buttonclick);
	}
	
	public void firstname(String fname)
	{
		rs.elementvisible(dr,By.name("firstname"));
		WebElement buttonclick=dr.findElement(By.name("firstname"));
		rs.Textenter(buttonclick,fname);	
	}
	
	public void surname(String sname)
	{
		rs.elementvisible(dr,By.name("lastname"));
		WebElement buttonclick=dr.findElement(By.name("lastname"));
		rs.Textenter(buttonclick,sname);	
	}
	
	public void mobilenumber(String mnumber)
	{
		rs.elementvisible(dr,By.name("reg_email__"));
		WebElement buttonclick=dr.findElement(By.name("reg_email__"));
		rs.Textenter(buttonclick,mnumber);	
	}
	public void newpassword(String npassword)
	{
		rs.elementvisible(dr,By.id("password_step_input"));
		WebElement buttonclick=dr.findElement(By.id("password_step_input"));
		rs.Textenter(buttonclick,npassword);	
	}
}

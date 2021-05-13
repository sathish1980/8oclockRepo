package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonmethods.reusable;


public class facebooklogin 
{
	@FindBy(id="email")
	WebElement usern;
	@FindBy(id="pass")
	WebElement pswrd;
	@FindBy(name="login")
	WebElement lognbtn;
	
	
	WebDriver dr;
	reusable cs = new reusable();
	
	public facebooklogin(WebDriver dr)
	{
		this.dr =dr;
		PageFactory.initElements(dr,this);
	}
	
	public void username(String uname)
	{
		//dr.findElement(By.id("email")).sendKeys(uname);
		cs.elementvisible(dr,By.id("email"));
		usern.sendKeys(uname);
	}
	
	public void password(String pass)
	{
		//dr.findElement(By.id("pass")).sendKeys(pass);
		pswrd.sendKeys(pass);
	}
	
	public void DOB(String D)
	{
		dr.findElement(By.id("pass")).sendKeys(D);
	}
	
	public void loginbutton()
	{
		//dr.findElement(By.name("login")).click();
		lognbtn.click();
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonmethods.reusable;

public class facebooklogout 
{
	WebDriver dr;
	reusable cs= new reusable();
	public facebooklogout(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void logoutdropdown()
	{
	cs.elementclickable(dr,By.xpath("//div[@aria-label='Account']"));
	WebElement logoutdpdown=dr.findElement(By.xpath("//div[@aria-label='Account']"));
	cs.clickaction(logoutdpdown);
	
	}
	
	public void signout() 
	{
	cs.elementclickable(dr,By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	WebElement sigoutbutton=dr.findElement(By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	cs.clickaction(sigoutbutton);
	}	

}

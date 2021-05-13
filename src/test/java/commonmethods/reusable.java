package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reusable 
{

	public void elementclickable(WebDriver dr,By elementvalue)
	{
		WebDriverWait wait = new WebDriverWait(dr,60);
		wait.until(ExpectedConditions.elementToBeClickable(elementvalue));
	}
	
	public void elementvisible(WebDriver dr,By elementvalue)
	{
		WebDriverWait wait = new WebDriverWait(dr,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementvalue));
	}
	
	public void clickaction(WebElement buttonaction)
	{
		Boolean buttondisplay=buttonaction.isDisplayed();
		if(buttondisplay==true)
		{
			Boolean buttonenabled=buttonaction.isEnabled();
			if(buttonenabled==true)
			{
				buttonaction.click();
			}
		}
	}
	
	public void Textenter(WebElement testwebelement,String valuetobeeneter)
	{
		Boolean elementdisplay=testwebelement.isDisplayed();
		if(elementdisplay==true)
		{
		testwebelement.clear();
		testwebelement.sendKeys(valuetobeeneter);
		}
	}
	
public static String capture(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
	
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File(System.getProperty("user.dir")+"\\screenshot\\" + System.currentTimeMillis()+ ".png");
	
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
}

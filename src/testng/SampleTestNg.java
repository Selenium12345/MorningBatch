package testng;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestNg 
{
@Test
public void appLaunch()
{
	String exp="LOGIN Panel";
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	String act=driver.findElement(By.xpath(".//*[@id='logInPanelHeading']")).getText();
	Assert.assertEquals(exp, act);
	
	
	
}
}

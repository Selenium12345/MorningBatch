package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class AdminLoginTest 
{
public static FirefoxDriver driver;
@Test
public static void appLaunch()
{
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
}
@Test
public static void appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
}
@Test
public static void appLogout()
{
	
}
}

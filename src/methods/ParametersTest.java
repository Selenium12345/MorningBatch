package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParametersTest
{
public static FirefoxDriver driver;
	public static void main(String[] args)
	{
		ParametersTest app=new ParametersTest();
		app.appLogin("Admin", "admin");

	}
public void appLogin(String userName,String pwd)
{
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnLogin")).click();
}
}

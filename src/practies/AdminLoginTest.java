package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest {

	public static void main(String[] args) 
	{
		String expName="Welcome Admin";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	String actName=driver.findElement(By.id("welcome")).getText();
		if (expName.equals(actName))
		{
			System.out.println("AdminLogin Successfully");
		}else
		{
			System.out.println("AdminLogin Fail");
		}
			

	}

}

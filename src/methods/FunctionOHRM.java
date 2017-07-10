package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionOHRM
{
public static  String res,expName;
public static FirefoxDriver driver;
public static String userName="Admin";
public static String password="admin";
  
	public static void main(String[] args) 
	{
		
		FunctionOHRM lg=new FunctionOHRM();
		lg.appLaunch();
		String result=lg.appLogin(userName, password);
		System.out.println(result);
		
		
	}
	public  String appLaunch()
	{
	   driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		if (driver.findElement(By.id("logInPanelHeading")).isDisplayed())
		{
			res="Pass";
			
		}else
		{
			res="Fail";
		}
		return res;
	}
	public  String appLogin(String userName,String password)
	{
		expName="Welcome Admin";
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	String actName=driver.findElement(By.id("welcome")).getText();
		if (expName.equals(actName))
		{
			res="pass";
		}else
		{
			res="Fail";
		}
		return res;
			
	}
	public String addEmp(String fName,String lName) 
			throws InterruptedException
	{Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
	
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
	if (driver.findElement(By.xpath
			(".//*[@id='profile-pic']/h1")).isDisplayed())
	{
		res="Pass";
	}else
	{
		res="Fail";
	}
	return res;
	}

}

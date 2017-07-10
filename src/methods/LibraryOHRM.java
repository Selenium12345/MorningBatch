package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibraryOHRM 
{
public static String res;
public static FirefoxDriver d;
	public static void main(String[] args)
	{
		LibraryOHRM app=new LibraryOHRM();
String results=app.appLaunch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(results);
	}
public String appLaunch(String url)
	{
	  d=new FirefoxDriver();
		d.get(url);
		d.manage().window().maximize();
		if (d.findElement(By.id("logInPanelHeading")).isDisplayed())
		{
			res="Pass";
			
		}else
		{
			res="Fail";
		}
		
		return res;
	}
	

}

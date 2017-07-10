package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args)
	{
		String expTtile="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		String text=driver.findElement(By.linkText("Gmail")).getText();
		
System.out.println(text);

	}

}

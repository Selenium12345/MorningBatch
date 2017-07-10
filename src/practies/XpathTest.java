package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args)
	{
			
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='gb_P']")).click();
	}

}

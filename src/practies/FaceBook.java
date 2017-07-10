package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Facebook.com");
		driver.manage().window().maximize();
		List<WebElement> text=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(text.size());
		Thread.sleep(3000);
		String [] str={"One","two","three","four","five","six","seven","eight"};
		for (int i = 0; i <=text.size(); i++) 
		{
			text.get(i).sendKeys(str[i]);
		}

	}

}

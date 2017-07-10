package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
List<WebElement> frames=driver.findElements(By.tagName("iframe"));
System.out.println(frames.size());
driver.switchTo().frame(0);
WebElement rs=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
Actions resize=new Actions(driver);
resize.clickAndHold(rs).moveByOffset(70, 80).release().build().perform();
		

	}

}
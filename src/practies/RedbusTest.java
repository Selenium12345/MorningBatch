package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusTest {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
Thread.sleep(2000);
List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
System.out.println(list.size());
for (int i = 0; i < list.size(); i++)
{
	//System.out.println(list.get(i).getText());
	if (list.get(i).getText().equals("Hyderabad")) 
	{
		list.get(i).click();
		break;
	}
}

	}

}

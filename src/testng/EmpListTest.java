package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmpListTest extends OrangeHRM
{
@Test
public void empList() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
	
	List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
	System.out.println(rows.size());
	for (int i = 0; i < rows.size(); i++)
	{
		List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
				
			System.out.println(col.get(2).getText());
		
	}
}
}

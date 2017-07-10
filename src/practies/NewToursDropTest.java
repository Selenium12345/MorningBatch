package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursDropTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
	List<WebElement> countyList=country.findElements(By.tagName("option"));
	System.out.println(countyList.size());
	for (int i = 0; i < countyList.size(); i++) 
	{
		countyList.get(i).click();
		if (countyList.get(i).isSelected()) 
		{
			System.out.println(countyList.get(i).getText()+":is Selected");
		}else
		{
			System.out.println(countyList.get(i).getText()+":is Not Selected");
		}
	}

	}

}

package practies;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException 
	{
		
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		//String date="18/november/2018";
		String [] dateSplit=date.split("/");
		String day=dateSplit[0];
		String month=dateSplit[1];
		String year=dateSplit[2];
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		
		//Year Selection
		String calYear=driver.findElement
				(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//Month Selection
		String calMonth=driver.findElement
				(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//Day Selection
		List<WebElement> rows=driver.findElements
	(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> col=rows.get(i).findElements
					(By.tagName("td"));
			for (int j = 0; j < col.size(); j++)
			{
				String calDay=col.get(j).getText();
				if (calDay.equals(day)) 
				{
					col.get(i).click();
					break;
				}
			}
		}
		
	}

}

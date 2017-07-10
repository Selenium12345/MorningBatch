package practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='fromPlaceName']"))
.sendKeys("HYDERABAD");
driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());//alert text
		alt.accept();
		//alt.dismiss();//close alert

	}

}

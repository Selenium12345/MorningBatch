package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		driver.manage().window().maximize();
		WebElement ereg=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/a"));
WebElement asm=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/a"));
WebElement knw=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/ul/li[6]/a"));
	Actions chain=new Actions(driver);
	chain.moveToElement(ereg).moveToElement(asm).pause(3000).moveToElement(knw).click().build().perform();
	}

}

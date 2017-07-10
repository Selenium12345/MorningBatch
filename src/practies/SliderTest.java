package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

public static void main(String[] args) throws InterruptedException
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://jqueryui.com/slider/");
	driver.manage().window().maximize();
List<WebElement> frames=driver.findElements(By.tagName("iframe"));
System.out.println(frames.size());
driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
Actions sld=new Actions(driver);
sld.clickAndHold(slider).moveByOffset(70, 0).release().build().perform();
Thread.sleep(3000);
sld.clickAndHold(slider).moveByOffset(-70, 0).release().build().perform();
		

	}

}

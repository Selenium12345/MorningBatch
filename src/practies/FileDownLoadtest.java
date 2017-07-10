package practies;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownLoadtest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		//Runtime.getRuntime().exec("C:\\Users\\FP\\Desktop\\dnl.exe");
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}

}

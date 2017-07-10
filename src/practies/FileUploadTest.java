package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileUploadTest {
	public static void main(String[] args) throws Exception
	{
	FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("vasudeva");
		driver.findElement(By.id("lastName")).sendKeys("qedge");
	driver.findElement(By.id("photofile")).click();
	
	Runtime.getRuntime().exec("C:\\Users\\FP\\Desktop\\fileup.exe");
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
	
	
	
	
	

	
	}

}

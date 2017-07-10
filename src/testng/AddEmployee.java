package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployee extends OrangeHRM
{
@Test
public void addEmp() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("vasudeva");
	driver.findElement(By.id("lastName")).sendKeys("qedge");
	Thread.sleep(2000);
    driver.findElement(By.id("btnSave")).click();
}
}

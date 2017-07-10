package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNg
{
	@Test()
public static void startPage()
{
	System.out.println("Applaunch");
	//Assert.assertEquals(12, 13);
}
	@Test(dependsOnMethods="startPage")
	public static void appLogin()
	{
		System.out.println("appLogin");
	}
	@Test(dependsOnMethods="appLogin")
	public static void appLogout()
	{
		System.out.println("appLogout");
	}
	
	
}

package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgGroup1
{
	@Test(groups="Smoke")
	public void firstSmTest()
	{
		System.out.println("First Smoke TestCase");
	}
	@Test(groups="Smoke")
	public void secondSmTest()
	{
		System.out.println("Second Smoke TestCase");
	}
	@Test(groups="Regression")
	public void firstRgTest()
	{
		int a=13;
		System.out.println("First Regression TestCase");
	Assert.assertEquals(a, 13);
	}

}

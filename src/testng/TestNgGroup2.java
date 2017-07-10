package testng;

import org.testng.annotations.Test;

public class TestNgGroup2
{
	@Test(groups="Smoke")
	public void thirdSmTest()
	{
		System.out.println("third Smoke TestCase");
	}
	@Test(groups="Smoke")
	public void fourthSmTest()
	{
		System.out.println("fourth Smoke TestCase");
	}
	@Test(groups="Regression")
	public void secondRgTest()
	{
		System.out.println("Second Regression TestCase");
	}
}

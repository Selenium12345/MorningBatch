package testng;

import org.testng.annotations.Test;

public class MultipleTest
{
@Test(priority=1,description="Lauching Primusbank App")
public void appLaunch()
{
	System.out.println("appLaunch");
}
@Test(priority=2)
public void appLogin()
{
	System.out.println("appLogin");
}
@Test(priority=3)
public void appclose()
{
	System.out.println("appclose");
}

}

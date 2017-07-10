package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@DataProvider(name="admin")
	public Object [][] getData()
	{
		Object [][] obj=new Object [3][2];
		obj [0][0]="vasu1";
		obj [0][1]="vasu2";
		
		obj [1][0]="vasu3";
		obj [1][1]="vasu4";
		
		obj [2][0]="vasu5";
		obj [2][1]="vasu6";
		return obj;
	}
@Test(dataProvider="admin")
public void adminLogin(String uid,String pwd)
{
	System.out.println("UserName:"+uid);
	System.out.println("Password:"+pwd);
}
}

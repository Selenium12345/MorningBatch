package methods;

public class StaticMethods {

	public static void main(String[] args)
	{		//calling Static methods
		//appLaunch();
		
		/*String res=appLaunch1();
		System.out.println(res);*/
		System.out.println(appLaunch1());
	}
	//Satic Method without return value
	public static void appLaunch()
	{
		System.out.println("AppLaunch");
	}
	//Satic Method with return value
		public static String appLaunch1()
		{
			System.out.println("AppLaunch");
			return "Pass";
		}

}

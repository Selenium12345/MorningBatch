package methods;

public class NonStaticMethods {
	public static void main(String[] args)
	{
		//calling non static methods
		NonStaticMethods app=new NonStaticMethods();
		app.appLaunch();
		String res=app.appLaunch1();
		System.out.println(res);
	}
		//non static method without return value
	public void appLaunch()
	{
		System.out.println("without Return value");
	}
	//non static method with return value
		public String appLaunch1()
		{
			System.out.println("with Return value");
			return "pass";
		}

}

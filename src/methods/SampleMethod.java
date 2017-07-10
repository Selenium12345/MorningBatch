package methods;

public class SampleMethod {

	public static void main(String[] args)
	{
		
		
		String msg="Hi";
		SampleMethod cl=new SampleMethod();
		//call by value
		//cl.dispalyMessage("Hi");
		//call by refference
		cl.dispalyMessage(msg);
	}

	public void dispalyMessage(String msg
			)
	{
		System.out.println(msg);
	}
}

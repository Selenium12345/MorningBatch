package practies;

import java.util.ArrayList;
import java.util.List;



public class ArrayListTest {

	public static void main(String[] args)
	{
		List<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("Selenium1");
		l.add("Selenium2");
		l.add("Selenium2");
		l.add("anil");
		
		System.out.println(l.size());
		for (int i = 0; i <l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
	}

}

package practies;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) 
	{
		//syntax:
		/*if (condition)
		{
			Statements; //if Block
		}else
		{
			Statements;//else block
		}*/
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if (n%2==0) 
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}

	}

}

package practies;

public class ArraysTest {
	public static void main(String[] args) 
	{
	//dataType arrayName[]=new dataType[size];
		int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		a[5]=16;
		System.out.println("###########");
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
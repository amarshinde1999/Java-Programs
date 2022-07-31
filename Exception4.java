import java.lang.*;
import java.util.*;

class Exception4
{
	public static void main(String a[])
	{
		int Arr[]={10,20,0,40,50};
		Scanner sobj = new Scanner(System.in);
		System.out.println("enetr the index");
		
		int index=sobj.nextInt();
		
		try
		{
		System.out.println("element at the index is:"+Arr[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException obj)
		{ System.out.println(obj);
		System.out.println("inside catch");
		}
		
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		finally
		{
		System.out.println("inside finally");
		sobj.close();
		}
		System.out.println("end of application");
	}
}
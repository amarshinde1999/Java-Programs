import java.lang.*;
import java.util.*;

class Exception3
{
	public static void main(String a[])
	{
		int Arr[]={10,20,0,40,50};
		Scanner sobj = new Scanner(System.in);
		System.out.println("enetr the index");
		
		int index=sobj.nextInt();
		
		System.out.println("element at the index is:"+Arr[index]);
	}
}
import java.lang.*;
import java.util.*;


class asmt594
{
	public static void main(String arh[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the string");
		String iNo=sobj.nextLine();
		
		char Brr[]=iNo.toCharArray();
		MyArray mobj=new MyArray();
		mobj.ArrayCapital(Brr);
		
		
		
	}
}

class MyArray
{
	public void ArrayCapital(char Arr[])
	{
		
		
		int iCount=0;
		
		for(int i=0; i<Arr.length; i++)
		{
			if(Arr[i]>='A' && Arr[i]<='Z')
			
			iCount++;
			
		}
		System.out.println("the capital characters are :"+iCount);
		
	}
}
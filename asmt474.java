import java.lang.*;
import java.util.*;
import java.io.*;


class asmt474
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the string");
		String name =sobj.nextLine();
		
		StringDemo cobj= new StringDemo();
		cobj.CountDiff(name);
		
		
	}
}
			// INCOMPLETE  //

class StringDemo
{
	public void CountDiff(String str)
	{
		char arr[]=str.toCharArray();
		
		int iCnt=0;
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
			{
				System.out.println("TRUE");
			}
			else
			{
				System.out.println("FALSE");
			}
		}
		
	}
}


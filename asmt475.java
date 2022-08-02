import java.lang.*;
import java.util.*;
import java.io.*;


class asmt475
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the string");
		String name =sobj.nextLine();
		
		StringDemo cobj= new StringDemo();
		cobj.Reverse(name);
		
	}
}


class StringDemo
{
	public void Reverse(String str)
	{
		char arr[]=str.toCharArray();
		//String brr[]=str.reverse();

		
		for(int i=(arr.length-1); i!=-1; i--)
		{
			System.out.print(arr[i]);
		}
		
	}
}


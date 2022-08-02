import java.lang.*;
import java.util.*;
import java.io.*;


class asmt471
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the string");
		String name =sobj.nextLine();
		
		StringDemo cobj= new StringDemo();
		int ret=cobj.CountCapital(name);
		
		System.out.println("the number of capital characters are :"+ret);
	}
}


class StringDemo
{
	public int CountCapital(String str)
	{
		char arr[]=str.toCharArray();
		
		int iCnt=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				 iCnt++;
			}
		}
		return iCnt;
	}
}


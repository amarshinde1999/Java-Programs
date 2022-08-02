import java.lang.*;
import java.util.*;
import java.io.*;


class asmt473
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the string");
		String name =sobj.nextLine();
		
		StringDemo cobj= new StringDemo();
		int ret=cobj.CountDiff(name);
		
		System.out.println("the number of  characters difference are :"+ret);
	}
}


class StringDemo
{
	public int CountDiff(String str)
	{
		char arr[]=str.toCharArray();
		
		int iCnt=0;
		int iCnt1=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>='a' && arr[i]<='z')
			{
				 iCnt++;
			}
			else if(arr[i]>='A' && arr[i]<='Z')
			{
				iCnt1++;
			}
		}
		return iCnt-iCnt1;
	}
}


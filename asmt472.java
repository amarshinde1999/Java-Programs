import java.lang.*;
import java.util.*;
import java.io.*;


class asmt472
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the string");
		String name =sobj.nextLine();
		
		StringDemo cobj= new StringDemo();
		int ret=cobj.CountSmall(name);
		
		System.out.println("the number of small characters are :"+ret);
	}
}


class StringDemo
{
	public int CountSmall(String str)
	{
		char arr[]=str.toCharArray();
		
		int iCnt=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>='a' && arr[i]<='z')
			{
				 iCnt++;
			}
		}
		return iCnt;
	}
}


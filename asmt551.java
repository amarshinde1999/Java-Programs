import java.lang.*;
import java.util.*;


class asmt551
{
	public static void main(String arg[])
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("enter the string");
		String name=sobj.nextLine();
		
		Pattern obj= new Pattern();
		obj.Pattern(name);
		
	}
}


class Pattern
{
	public void Pattern(String str)
	{
		
		
		char arr[]=str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i>j || i==j)
				{
					System.out.print(arr[j] +" ");
				}
				else
				{
					System.out.print("*" +" ");
				}
			}
			System.out.println();
		}
	}
}
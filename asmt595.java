import java.lang.*;
import java.util.*;


class asmt595
{
	public static void main(String arh[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter number of student");
		int iNo=sobj.nextInt();
		
		float Brr[]=new float [iNo];
		MyArray mobj=new MyArray();
		mobj.Percentage(Brr);
		
		
		
	}
}

class MyArray
{
	public void Percentage(float Arr[])
	{
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the marks");
		for(int i=0; i<Arr.length; i++)
		{
			Arr[i]=sobj.nextFloat();
		}
		
		for(int i=0; i<Arr.length; i++)
		{
			if(Arr[i]<35)
			{
				System.out.println("FAIL");
			}
			else if(Arr[i]>=35 && Arr[i]<50)
			{
				System.out.println("PASS CLASS");
			}
			else if(Arr[i]>=50 && Arr[i]<60)
			{
				System.out.println("SECOND CLASS");
			}
			else if(Arr[i]>=60 &&Arr[i]<70)
			{
				System.out.println("FIRST CLASS");
			}
			else
			{
				System.out.println("FIRST CLASS WITH DISTINCTION");
			}
			
			
		}
		
	}
}
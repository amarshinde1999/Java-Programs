import java.lang.*;
import java.util.*;

class asmt573
{
	public static void main(String arh[])
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("enter the number of first array elements");
		int No1=sobj.nextInt();
		
		System.out.println("enter the number of second array elements");
		int No2=sobj.nextInt();
		
		int Arr1[]=new int[No1];
		int Arr2[]=new int[No2];
		
		
		MyArray obj= new MyArray();
		obj.Display(Arr1,Arr2);
		
		
	}
}

class MyArray
{
	public void Display(int Arr1[],int Arr2[])
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("the first array elements ");
		for(int i=0; i<Arr1.length; i++)
		{
			Arr1[i]=sobj.nextInt();
		}
		System.out.println("the second array elements ");
		for(int j=0; j<Arr2.length; j++)
		{
			Arr2[j]=sobj.nextInt();
		}
		
		System.out.println("the first odd array list : ");
		for(int i=0; i<Arr1.length; i++)
		{
			if(Arr1[i]%2!=0)
			{
			System.out.println(Arr1[i]+" ");
			}
		}
		
		System.out.println("the second odd array list : ");
		for(int j=0; j<Arr2.length; j++)
		{
			if(Arr2[j]%2!=0)
			{
		     System.out.println(Arr2[j]+" ");
			}
		}
		
		
	}
}
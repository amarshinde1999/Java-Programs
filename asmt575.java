import java.lang.*;
import java.util.*;

class asmt575
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
		obj.SumArray(Arr1,Arr2);
		
		
	}
}

class MyArray
{
	public void SumArray(int Arr1[],int Arr2[])
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
		
		
		int iSum=0;
		for(int i=0; i<Arr1.length; i++)
		{
			iSum=iSum+Arr1[i];
		}
		
		
		int iSum1=0;
		for(int j=0; j<Arr2.length; j++)
		{
		     iSum1=iSum1+Arr2[j];
		}
		System.out.println("the summation of first arrat is :"+iSum);
		System.out.println("the summation of second arrat is :"+iSum1);
		
	}
}
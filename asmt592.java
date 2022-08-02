import java.lang.*;
import java.util.*;


class asmt592
{
	public static void main(String arh[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter number of elements");
		int iNo=sobj.nextInt();
		
		int Brr[]=new int [iNo];
		MyArray mobj=new MyArray();
		mobj.ReverseArray(Brr);
		
		
		
	}
}

class MyArray
{
	public void ReverseArray(int Arr[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0; i<Arr.length; i++)
		{
			Arr[i]=sobj.nextInt();
		}
		int iSum=0;
		int iDigit=0;
		for(int i=0; i<Arr.length; i++)
		{
			iSum=0;
			while(Arr[i]>0)
			{
				iDigit=Arr[i]%10;
				iSum=iSum+iDigit;
				Arr[i]=Arr[i]/10;
			}
			
			System.out.print(iSum+" ");
		}
		
	}
}
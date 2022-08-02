import java.lang.*;
import java.util.*;


class asmt591
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
		int iRev=0;
		int iDigit=0;
		for(int i=0; i<Arr.length; i++)
		{
			iRev=0;
			while(Arr[i]>0)
			{
				iDigit=Arr[i]%10;
				iRev=(iRev*10)+iDigit;
				Arr[i]=Arr[i]/10;
			}
			
			System.out.print(iRev+" ");
		}
		
	}
}
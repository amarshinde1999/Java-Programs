import java.lang.*;
import java.util.*;

class asmt463
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int iRow = sobj.nextInt();
		System.out.println("enter the number of columns");
		int iCol = sobj.nextInt();
		
		int arr[][]=new int[iRow][iCol];
		
		System.out.println("enter the values");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				 arr[i][j]=sobj.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("After modification ");
		for(int i=arr.length-1; i>=0; i--)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
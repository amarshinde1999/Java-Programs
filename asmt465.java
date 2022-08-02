import java.lang.*;
import java.util.*;

class asmt465
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int iRow = sobj.nextInt();
		System.out.println("enter the number of columns");
		int iCol = sobj.nextInt();
		
		int arr[][]=new int[iRow][iCol];
		
		int iSum1=0; 
		int iSum2=0;
		
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
				if(arr[i][j]==0) 
				{
					iSum1++;			
				}
				
				if(arr[i][j]!=0)
				{
					iSum2++;
					
				}
			}
			System.out.println();
			
			
		
			
		}
		
		
		
		
		if(iSum1>iSum2)
			{
				System.out.println(" this is sparse matrix ");
			}
			else
			{
				System.out.println("this is not a sparse matrix");
			}
		
	}
}
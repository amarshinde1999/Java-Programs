import java.lang.*;
import java.util.*;

class asmt454
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int iRow=sobj.nextInt();
		System.out.println("enter the number of rows");
		int iCol=sobj.nextInt();
		int arr[][]=new int[iRow][iCol];
		System.out.println("enter the values ");
		int i=0; int j=0;
		int iSum=0;
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr[i].length; j++)
			{
				iSum=iSum+arr[j][i];
			}
			System.out.println("the addition is : "+iSum);
			iSum=0;
		}
		
	}
}
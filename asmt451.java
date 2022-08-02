import java.lang. *;
import java.util.*;


class asmt451
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("enter number of rows ");
		int iRow =sobj.nextInt();
		System.out.println("enter number of columns ");
		int iCol=sobj.nextInt();
		
		
		int arr[][]=new int[iRow][iCol];
		System.out.println("enetr the elements ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		int iSum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(i==j)
				{
					iSum=iSum+arr[i][j];
				}
			}
		}
		
		System.out.println("the addition is : "+iSum);
		
	}
}
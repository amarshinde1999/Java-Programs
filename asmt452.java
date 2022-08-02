import java.lang. *;
import java.util.*;


class asmt452
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("enter number of rows ");
		int iRow =sobj.nextInt();
		System.out.println("enter number of columns ");
		int iCol=sobj.nextInt();
		
		System.out.println("enter the number to check that number frequency ");
		int iValue=sobj.nextInt();
		
		int arr[][]=new int[iRow][iCol];
		System.out.println("enetr the elements ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		int iFrequency=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(iValue==arr[i][j])
				{
					iFrequency++;
				}
			}
		}
		
		System.out.println("the frequency of that number is : "+iFrequency);
		
	}
}
import java.lang.*;
import java.util.*;


class asmt523
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the number of row : ");
            int iRow=sobj.nextInt();
			
            System.out.println("Enter the number of column : ");
            int iCol=sobj.nextInt();

			Pattern obj=new Pattern();
			obj.Pattern(iRow,iCol);
			
		
	
		
	}
}



class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		Scanner sobj = new Scanner(System.in);
		int arr[][]=new int[iRow][iCol];
		int i=0;
		int j=0;
		
			
			char ch1='\0';
			for( i=0,ch1='A'; i<arr.length; i++,ch1++)
			{
				for( j=0; j<arr[i].length; j++)
				{
					
					System.out.print(ch1 +" ");
					
				}
				System.out.println();
			}
			
	}
}
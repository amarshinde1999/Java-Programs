import java.lang.*;
import java.util.*;


class asmt522
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
			char ch2='\0';
			for( i=0; i<arr.length; i++)
			{
				for( j=1,ch1='A',ch2='a'; j<=arr[i].length; j++,ch1++,ch2++)
				{
					if(i%2==0)
					{
						System.out.print(ch1 +" ");
					}
					else
					{
					    System.out.print(ch2 +" ");
					}	
				}
				System.out.println();
			}
			
	}
}
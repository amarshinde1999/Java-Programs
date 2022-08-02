import java.lang.*;
import java.util.*;


class asmt524
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
		
		int i=0;
		int j=0;
		
		
			
			
			for( i=iRow; i>0; i--)
			{
				for( j=0; j<iCol; j++)
				{
					System.out.print( i+" ");
				}
				System.out.println();
			}
			
	}
}
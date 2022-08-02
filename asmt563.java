import java.lang.*;
import java.util.*;


class asmt563
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner (System.in);
		System.out.println("enter number of rows");
		int iRow=sobj.nextInt();
		
		System.out.println("enter number of columns");
		int iCol=sobj.nextInt();
		
		Pattern pobj=new Pattern();
		pobj.Pattern(iRow,iCol);
		
	}
}

class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		
		
		for(int i=iRow-1; i>=0; i--)
		{
			for(int j=0; j<iCol; j++)
			{
				if((i==j)||(j==0)||(j==iCol-1)||(i==0)||(i==iRow-1))
				{
					System.out.print("*"+" ");
				}
				
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
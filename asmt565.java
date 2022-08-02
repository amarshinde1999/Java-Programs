import java.lang.*;
import java.util.*;


class asmt565
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
		
		
		for(int i=1; i<=iRow; i++)
		{
			for(int j=1; j<=iCol; j++)
			{
				if((i==j)||(j==1)||(j==iCol)||(i==1)||(i==iRow))
				{
					System.out.print(j+" ");
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
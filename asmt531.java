import java.lang.*;
import java.util.*;

class asmt531
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter number of rows");
		int iRow= sobj.nextInt();
		System.out.println("enter number of columns");
		int iCol= sobj.nextInt();
	
		Pattern obj = new Pattern();
		obj.Pattern(iRow,iCol);
		
	}
}

class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		
		for(int i=0; i<iRow; i++)
		{
			for(int j=0; j<iCol; j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
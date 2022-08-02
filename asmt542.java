import java.lang.*;
import java.util.*;

class asmt542
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the string : ");
            String name = sobj.nextLine();
			
            Pattern obj = new Pattern();
			obj.Pattern(name);

         
		
	
		
	}
}

class Pattern
{
	public void Pattern(String str)
	{
		char arr[]=str.toCharArray();

			for(int i=arr.length-1; i>=0;  i--)
			{
				for(int j=0; j<=i; j++)
				{
					
				      	System.out.print(arr[j] +" ");
					
				}
				System.out.println();
			}
	}
}
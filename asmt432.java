import java.lang.*;
import java.util.*;
import java.io.*;


class asmt432
{
	public static void main(String arg[])
	{
		
			
			Scanner sobj= new Scanner(System.in);
			
			System.out.println("enter the file name ");
			
			String name = sobj.nextLine();
			
			File file = new File(name);
			
			
			if(file.exists())
			{
				System.out.println("file is exist and regular type ");
		
			}
			else
			{
				System.out.println("file not exist not regular type ");
			}
			
		
		

	}   
}


	
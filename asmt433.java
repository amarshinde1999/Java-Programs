import java.lang.*;
import java.util.*;
import java.io.*;


class asmt433
{
	public static void main(String arg[])
	{
		
			
			Scanner sobj= new Scanner(System.in);
			
			System.out.println("enter the directory name ");
			
			String name = sobj.nextLine();
			
			File file = new File(name);
			
			
			
			if(file.mkdir())
			{
				System.out.println("directory is created at current path ");
		
			}
			else
			{
				System.out.println("directory is not created ");
			}
			
		
		

	}   
}


	
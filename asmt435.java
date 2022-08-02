import java.lang.*;
import java.util.*;
import java.io.*;
  
 

class asmt435
{
	public static void main(String arg[])  
	{
		
			
			Scanner sobj= new Scanner(System.in);
			
			System.out.println("enter the directory name ");
			
			String name = sobj.nextLine();
			
			File file = new File(name);
			File files []= file.listFiles(); 
			
			for(int i=0; i<files.length; i++)
			{
				
				long size = files[i].length();
				System.out.println(files[i].getName());
				System.out.println( "size is" +size);
				
			}
			
			
			
			
		
		

	}   
}


	
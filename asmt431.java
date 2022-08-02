import java.lang.*;
import java.util.*;
import java.io.*;


class asmt431
{
	public static void main(String arg[])
	{
		try
		{
			
			Scanner sobj= new Scanner(System.in);
			
			System.out.println("enter the file name which allready exist");
			
			String name = sobj.nextLine();
			
			File file = new File(name);
			
			System.out.println("enter the file name in which data write");
			
			String name1 = sobj.nextLine();
			
			File file1 = new File(name1);
			file1.createNewFile();
			
			if(file.exists())
			{
				
				FileInputStream fiobj = new FileInputStream(file);
				FileOutputStream foobj = new FileOutputStream(file1);
				
				 byte buffer[] = new byte[100];
                  int ret = 0;

                    while((ret = fiobj.read(buffer)) != -1)
                    {
                            foobj.write(buffer,0,ret);
                    }
			}
			else
			{
				System.out.println("file not exist ");
			}
			
		}
		catch(Exception obj)
		{
			System.out.println("exception found ");
		}
			

	}   
}


	
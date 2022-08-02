import java.lang.*;
import java.util.*;
import java.io.*;

class asmt443
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println(" Please enter directory  name");
            String name= sobj.nextLine();

            File dobj = new File(name);

            File allfiles[] = dobj.listFiles();
           
            File fobj=new File("Marvellous.txt");
            fobj.createNewFile();
			
            FileOutputStream foobj = new FileOutputStream(fobj);

            FileInputStream fiobj = null;
            
            byte buffer[] = new byte[100];
			int iNO = 0;

            for(int i = 0; i < allfiles.length; i++)
            {			
						 String name1;
				
                        name1 = allfiles[i].getName();
                    
                        fiobj = new FileInputStream(allfiles[i]);
 
                        while((iNO = fiobj.read(buffer)) != -1)
                        {
                                foobj.write(buffer,0,iNO);
                        }
						
						
                        fiobj.close();
                    
            }
        }
        catch(Exception obj)
        {
			System.out.println(" Exception found ");

        }

    }
}
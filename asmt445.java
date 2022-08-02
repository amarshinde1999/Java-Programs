import java.lang.*;
import java.util.*;
import java.io.*;

class asmt445
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Please enter direcory  name");
            String fname= sobj.nextLine();

            File dobj = new File(fname);

            File allfiles[] = dobj.listFiles();
            String name;

            File fobj=new File("Marvellous.txt");
            boolean bobj = fobj.createNewFile();
            FileOutputStream foobj = new FileOutputStream(fobj);

            FileInputStream fiobj = null;
            int ret = 0;
            byte arr[] = new byte[100];

            for(int i = 0; i < allfiles.length; i++)
            {
               name = allfiles[i].getName();

               name = name +" " +(allfiles[i].length());
              
               byte namearray[] = name.getBytes();
               foobj.write(namearray,0,namearray.length);

               fiobj = new FileInputStream(allfiles[i]);

               while((ret = fiobj.read(arr)) != -1)
               {
                   foobj.write(arr,0,ret);
               }
               fiobj.close();
                    
            }
			 System.out.println("Data is written in given file");
        }
		
        catch(Exception obj)
        {
            System.out.println("Exception found");
        }

    }
}
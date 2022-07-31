import java.io.*;

class Input3
{
	public static void main(String a[])
	{
		InputstreamReader iobj=new InputstreamReader(system.in);
		Bufferedreader bobj=new Bufferedreader(iobj);
		
		
		System.out.println("enter string");
		String str=bobj.readLine();
		
		System.out.println("enter integer");
		int no=Integer.parseInt(bobj.readLine());
		
		System.out.println("enter float");
		float f=Float.parseFloat(bobj.readLine());
		
		System.out.println("enter double");
		double d=Double.parseDouble(bobj.readLine());
		
		System.out.println("enter string is:"+str);
		System.out.println("enter integer:"+no);
		System.out.println("enter float:"+f);
		System.out.println("enter doube:"+d);
		
	}
	
}
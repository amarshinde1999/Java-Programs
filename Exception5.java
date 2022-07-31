import java.lang.*;
import java.util.*;


class Demo
{
	public void Divsion(int no1,int no2)throws ArithmeticException
	{
		return no1/no2;
	}
}
class Exception5
{
	public static void main(String a[])
	{
		Scanner sobj=new scanner(System.in);
		int no1=sobj.nextInt();
		
		Demo dobj=new Demo();
		int ret=dobj.Division (no1,no2);
		System.out.println("Division is:"+ret);
	}
	
	catch(ArithmeticException obj)
	{
		System.out.println("inside catch");
	}
}
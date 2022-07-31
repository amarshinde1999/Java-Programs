import java.lang.*;


class Base
{
	public void fun()
	{
	System.out.println("Base fun");
	}
	
	public final void gun()
	{
	System.out.println("base gun");
	}
}

class Derived extends Base
	{
		public void fun()   // overriding
	{
	System.out.println("Derived fun");
	}
	
	//public void gun()   //NA
	{
	System.out.println("Derived gun");
	}
	}
class final2
{
	public static void main(String a[])
	{
	Derived dobj=new Derived();
	dobj.fun();  //derived fub
	dobj.gun();   //Base gun
	}
}
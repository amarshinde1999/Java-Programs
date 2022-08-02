import java.lang.*;
import java.util.*;

class asmt494
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number");
		int Number=sobj.nextInt();
		
		Digit dobj = new Digit();
		int Counter=dobj.IntMultiply(Number);
		
		System.out.println("the number of  multiplication :" +Counter);
	}
}
	


class Digit
{
	public int IntMultiply(int iNo)
	{
		
		
		int iCnt=1;
		int iDigit=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			
			iCnt=iCnt*iDigit;
			
			iNo=iNo/10;
		}
		return iCnt;
	}
}
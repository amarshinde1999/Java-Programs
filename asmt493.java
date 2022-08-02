import java.lang.*;
import java.util.*;

class asmt493
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number");
		int Number=sobj.nextInt();
		
		Digit dobj = new Digit();
		int Counter=dobj.CountRange(Number);
		
		System.out.println("the number between 3 to 7 is :" +Counter);
	}
}
	


class Digit
{
	public int CountRange(int iNo)
	{
		
		
		int iCnt=0;
		int iDigit=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit>3 && iDigit<7)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}
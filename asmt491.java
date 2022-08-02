import java.lang.*;
import java.util.*;

class asmt491
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number");
		int Number=sobj.nextInt();
		
		Digit dobj = new Digit();
		int Counter=dobj.CountEven(Number);
		
		System.out.println("the number of even number is :" +Counter);
	}
}
	


class Digit
{
	public int CountEven(int iNo)
	{
		
		
		int iCnt=0;
		int iDigit=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}
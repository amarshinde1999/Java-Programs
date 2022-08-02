import java.lang.*;
import java.util.*;

class asmt495
{
	public static void main(String arf[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number");
		int Number=sobj.nextInt();
		
		Digit dobj = new Digit();
		int Counter=dobj.CountDiff(Number);
		
		System.out.println("the difference is  :" +Counter);
	}
}
	


class Digit
{
	public int CountDiff(int iNo)
	{
		
		
		//int iCnt=1;
		int iDigit=0;
		int iSum1=0;
		int iSum2=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			if(iDigit%2==0)
			{
				iSum1=iSum1+iDigit;
			}
			
			else
			{
				iSum2=iSum2+iDigit;
			}
			
			iNo=iNo/10;
		}
		return iSum1-iSum2;
	}
}
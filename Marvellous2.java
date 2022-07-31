import java.lang.*;

interface Circle
{
	float PI=3.14f;
	
	float CalculateArea(float radius);
	float CalculateCircumfarance(float radius);
}



class  Area implements Circle
{
	public float CalculateArea(float radius)
	{
		return (PI*radius*radius);
	}

     public float CalculateCircumfarance(float radius)
{
	return (2*PI*radius);
}

}

class Marvellous1
{
	public static void main(String arg[])
	{
		Area obj = new Area();
		float fRet=0.0f;
		
		fRet=obj.CalculateArea(10.5f);
		System.out.println("Area is :"+fRet);
		
		fRet=obj.CalculateCircumfarance(10.5f);
		System.out.println("Area is :"+fRet);
	}
}
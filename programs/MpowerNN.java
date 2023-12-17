package programs;

public class MpowerNN 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int m =5, power=2,start=1,result=1;
		while(start<=power) 
		{
			result = result*m;
			start++;
		}
		System.out.println(result);
	}

}

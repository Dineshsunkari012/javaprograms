package programs;

public class PrimeNumbers
{

	public static void main(String[] args)
	{
		int num=1000,num2 =5000,sum=0;
		while(num<=num2) {
			if(num%9==0) {
				sum = sum+num;
			}
			num++;
		}
		
		System.out.println(sum);

	}

}

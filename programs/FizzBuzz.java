package programs;

public class FizzBuzz {

	public static void main(String[] args)
	{
		
		int num=1, num2=100;
		while(num<=num2) 
		{
			if((num%3==0)&&(num%5==0)) 
			{
				System.out.println("FiZZBuzz"+num);
			}
			else if(num%3==0) 
			{
				System.out.println("Fizz"+num);	
			}
			else if(num%5==0) 
			{
				System.out.println("Buzz"+num);	
				}
			num++;
			}
	}

}

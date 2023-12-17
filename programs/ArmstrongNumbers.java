package programs;

public class ArmstrongNumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 153,count=0,temp=num;
		while(num>0) 
		{
			count++;
			num = num/10;
			
		}
		//System.out.println(count);
		int sum=0,power=0;
		num=temp;
	    while(num>0) 
	    {
		int rem = num%10;
		power = (int)Math.pow(rem, count);
		sum = sum+power;
		num/=10;
		System.out.println(sum);
			
	    }
	    if(sum==temp) {
	    	System.out.println("Armstrong");
	    }
	    else {
	    	System.out.println("Not an Armstrong Number");
	    }
	}

}

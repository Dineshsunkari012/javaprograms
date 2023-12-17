package programs;

public class TwinPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5,num2=9,count=0,count2=0;
		if(num1-num2==2||num2-num1==2) 
		{
			for(int start=1;start<=num1;start++) 
			{
				//System.out.println(num1);
				if(num1%start==0) {
					count++;
				}
				
			}
			for(int start=1;start<=num2;start++) 
			{
				//System.out.println(num1);
				if(num2%start==0) {
					count2++;
				}
				
			}
			if(count==count2)
			System.out.println("TwinPrime");
			
		}
		else {
			System.out.println("Not TwinPrime");
		}
	}

}

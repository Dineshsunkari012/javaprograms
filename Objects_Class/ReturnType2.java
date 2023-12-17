package Objects_Class;

import java.util.Scanner;

public class ReturnType2 
{

	public static void main(String[] args)
	{
		ReturnType2 s = new ReturnType2();
		Scanner z = new Scanner(System.in);
		System.out.println("enter value");
		s.num = z.nextInt();
		
//		
//		s.ispal();
//		//System.out.println(s.prime());
//		System.out.println(s.naturals());
		System.out.println(s.fizbuz());
	}
	int num;
	
	int pal() 
	{
		
		int prime =prime();
		System.out.println(prime);
		int rev=0;
		while(prime>0) {
			int rem = prime%10;
			rev = rev*10+rem;
			prime/=10;
			
		}
		return rev;
	}
	void ispal() 
	{
		
		int rev2 = pal();
		int prime=prime();
		if(rev2==prime) {
			System.out.println( "count of " + num +" is " + prime + " and it is palindrome");
			
		}
		else {
			System.out.println("count of " + num +" is " + prime + " and it is not a palindrome");
		}
	}
	
	int prime() 
	{
		
		int count=0;
		for(int start=1;start<=num;start++) {
			if(num%start==0) {
				start=start+count;
			}
		}
		return count;
		
	}
	int naturals() {
		int sum=0;
		for(int start=1;start<=num;start++) {
			sum = start+sum;
		}
		return sum;
	}
	String fizbuz() {
		if(num%3==0&&num%5==0) {
			return "FizzBuzz";
		}
		else if(num%3==0) {
			return "Buzz";
		}
		else if(num%5==0){
			return "Fizz";
		}
		else
			return "No fizzBuzz";
	}
	
	
	
	
}





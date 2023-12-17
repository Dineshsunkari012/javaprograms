package Objects_Class;

public class Parameters 
{
 int num;
 
	public static void main(String[] args) 
	{ 
	
//		Parameters obj=new Parameters();
//		obj.num=25;
//		obj.para();
		int x=100;
		Parameters obj2=new Parameters();
		obj2.num=1;
		obj2.primeornot(x);
		System.out.println(obj2.para());
		
		//obj2.palindrome(1,500);
		
		
	}
	public int para() 
	{
	 double sqr = Math.sqrt(num);
	 if(sqr==(int)sqr) {
		 System.out.println("Perfect square ");
	 }
	 else {
		 System.out.println("Not A perfect Square");
	 }
	 return 5;
		
	}
	void factors()
	{
	for(int start=1;start<=num;start++) {
		if(num%start==0) {
			System.out.println("Factors of " + num + " is " + start);
		}
		
	}
	
	}
	void palindrome(int start,int num) 
	{
		
		for(;start <=num;start++) {
			int rev = 0;
			int temp=start;
			while(temp>0) {
				int rem = temp%10;
				rev = rev*10+rem;
				temp/=10;
			}
			if(rev==start) {
				System.out.println(start);
			}
			else {
				System.out.println("hh0");
			}
		}
	}
	
	void primeornot(int p) 
	{
		int count=0;
		for(int x=1;x<=p;x++) 
		{
			if(p%x==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(p+"is a Prime number");
		}
		else {
			System.out.println(p + "is not a prime number");
		}
		
	}	
}

class Prime{
	void primeornot(int p) 
	{
		int count=0;
		for(int x=1;x<=p;x++) 
		{
			if(p%x==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(p+" is a Prime number");
		}
		else {
			System.out.println(p + " is not a prime number");
		}
		
	}	
	
}











































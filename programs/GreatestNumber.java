package programs;

public class GreatestNumber {

	public static void main(String[] args) {
		GreatestNumber p=new GreatestNumber();
		p.great();
		
	}
	void great() {
		int num=145,max=0;//for smallest 9 and <
		
		for(;num>0;num/=10) 
		{
			int rem = num%10;
			if(rem>max) {
				max=rem;
			}
		}
		System.out.println(max);
		
		
	}

}

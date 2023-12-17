package programs;

public class PrimeorNotEx {

	public static void main(String[] args) {
		// TODO Ato-generated method stub
		int num =1357;
		while(num>0) 
		{
			int count=0;
			int rem = num%10;
			for(int start=1;start<=rem;start++) 
			{
				if(rem%start==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(rem);
			}
			else {
				
			}
			num/=10;
		}

	}

}

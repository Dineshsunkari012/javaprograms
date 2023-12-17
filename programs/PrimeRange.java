package programs;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 150,n=500;
			for(;x<=n;x++) 
			{
				int temp=x;
				int count=0;
				for(int start=1;start<=temp;start++) 
				{
					if(temp%start==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(temp);
				}
			}
	}

}

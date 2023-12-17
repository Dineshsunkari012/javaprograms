package programs;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2,start=1,sum=0;
		while(num>=start) {
			if(num%start==0) {
				//System.out.println(start);
				sum = sum+start;
				
			}
			start++;
		}
		System.out.println(sum);
		
		

	}

}

package programs;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3,start=1,count=0;
		while(start<=num) {
			if(num%start==0) {
				count++;
			}
			start++;
		}
		if(count==2) {
			System.out.println(num+" is a prime Number");
		}
	}

}

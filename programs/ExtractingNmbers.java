package programs;

public class ExtractingNmbers {

	public static void main(String[] args) {
		int num = 2342,count=0,sum=0;
		for(;num>0;num/=10) {
			int last_digit = num%10;
			count++;
			sum = sum+last_digit;	
		}
		System.out.println(count);
		System.out.println(sum);
	}

}

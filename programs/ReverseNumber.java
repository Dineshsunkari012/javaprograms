package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 556,rev=0;
		for(;num>0;num/=10) {
			int rem = num%10;
			rev = rev*10+rem;
		}
		System.out.println(rev);

	}

}

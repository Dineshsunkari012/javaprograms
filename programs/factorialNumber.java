package programs;

public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =2;
		for(int start=1;start<=num;start++) 
		{
			int fact=1;
			for(int x=1;x<=start;x++) 
			{
				fact= fact*x;
			}
			System.out.println("Factorial of "+start+" is " + fact);
		}
		}
		

}

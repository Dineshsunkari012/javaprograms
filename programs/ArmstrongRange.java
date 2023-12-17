package programs;

public class ArmstrongRange 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub sqaure of it number(
		int num=1000000000,y=1;
		 for(;y<=num;y++) 
		 {
			 //System.out.println(i);
			 int sum=0;
			 int temp = y;
			 int count=0;
			 while(temp>0) 
			 {
				 
				 temp = temp/10;
				 count++;
			 }
			 int temp2=y;
			 while(temp2>0) {
				 int rem = temp2%10;
				 int arm = (int)Math.pow(rem,count);
				 sum =sum+arm;
				 temp2/=10;
				 //System.out.println(sum); 
			 }
			 if(sum==y) {
				 //System.out.println("arm");
				 System.out.println(y);
			 }
		 } 

	}

}

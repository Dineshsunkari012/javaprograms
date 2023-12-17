package programs;


public class Pratice 
{
	public static void main(String[] args) 
	{
	 int num=155,y=1;
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
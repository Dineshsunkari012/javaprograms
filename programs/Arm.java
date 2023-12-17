package programs;

public class Arm 
{
	int num=153;
	public static void main(String[] args) 
	{;
		Arm obj = new Arm();
		obj.armstrong();
	}
	void armstrong() 
	{
		int temp=num,count=0 ;
		 while(temp>0)
		{
		 count++;
		 temp=temp/10;	 
		}
		 int sum=0,res=0;
		 while(num>0) 
		 {
			num=num%10;
			res = (int)Math.pow(num,count);
			sum=sum+res;
			num=num/10;
			System.out.println(sum);
		 }
		 
	}
}

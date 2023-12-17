package programs;
import java.util.Scanner;
public class ClassObject 
{

	public static void main(String[] args) 
	{
		
		ClassObject s=new ClassObject();
		ClassObject n = new ClassObject();
		//s.add();
		n.add();
		s.primerange();
		

	}
	void add() 
	{
		int a=10,b=20;
		System.out.println(a+b);
	}
	void primerange()
	{
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end = s.nextInt();
		
		for(;start<=end;start++) 
		{
			int temp=start,count=0;
			for(int x=1;x<=temp;x++) 
			{
				if(temp%x==0)
				{
					count++;
					
				}
			}
			if(count==2) {
				System.out.println(temp);
			}
			
		
		}
	}
	void Armstrong() 
	{
		
	}
	
	
}

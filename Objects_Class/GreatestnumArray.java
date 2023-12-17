package Objects_Class;

public class GreatestnumArray 
{

	public static void main(String[] args) 
	{
		
		int a[] =new int[] {20,13,1,3,45,4,88,100,9,101};
		int num = 0;
		for(int x=0;x<=a.length-1;x++) 
		{
			if(a[x]>num) 
			{
				num=a[x];
				
			}
			
		}
		System.out.println(num);
		
	}

}

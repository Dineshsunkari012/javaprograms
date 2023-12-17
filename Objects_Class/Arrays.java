package Objects_Class;

public class Arrays 
{

	public static void main(String[] args) 
	{
		
		int a[]=new int[] {50,60,8055,3,5};
		System.out.println(a.length);
		for(int x=0;x<=a.length-1;x++) 
		{
			
			if(a[x]%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
			
		}
		String s[]=new String[] {"d","f","g"};	
		
		System.out.println(s[2]);
	}
	

}

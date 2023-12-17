package Objects_Class;

public class Ob 
{

	public static void main(String[] args) 
	{
        Ob obj=new Ob();
        for(int x=1;x<=5;x++) 
        {
        	System.out.println(obj.facttriol(x));
        }
        
	}
	
	int facttriol(int x) 
	{
		int fact = 1;
		for(int j=1;j<=x;j++) 
		{
			fact = fact*j;
		}
			
		
		return fact;
		
	}

}

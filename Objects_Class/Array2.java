package Objects_Class;

public class Array2 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {1,2,3,4,5,6};//40,50,60,10,20,30
		int b[] =new int[a.length];
		for(int x=a.length/2,y=0;x<=a.length-1;x++,y++) 
		{
			b[x]=a[x];
			 
			System.out.println(b[x]);
		}

   }
}

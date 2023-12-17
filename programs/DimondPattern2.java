package programs;

public class DimondPattern2 {

	public static void main(String[] args) {
		int r=5,f=5;
		for(int x=2;x<=r;x++) 
		{
			for(int y=r;y>x;y--) 
			{
				System.out.print(" ");
			}
			for(int d=1;d<x;d++) 
			{
				System.out.print("* ");
			} 
		System.out.println();	
		}
		
		for(int c=1;c<=r;c++) 
		{
			for(int v=1;v<=c;v++) 
			{
				System.out.print("-");
			}
			 
			
		System.out.println();
	}

}
}
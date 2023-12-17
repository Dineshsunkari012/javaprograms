package programs;

public class RevM {

	public static void main(String[] args) {
		int r=5;
		
		for(int y=1;y<=r;y++) 
		{
			
			for(int x=1;x<=y;x++) 
			{
				System.out.print("* ");
			}		
			System.out.println();
		}
		
		for(int s=1;s<=r;s++) {
			
			for(int d=r;d>s;d--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

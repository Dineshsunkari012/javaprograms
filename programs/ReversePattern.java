package programs;

public class ReversePattern {

	public static void main(String[] args) {
		int r = 5;
		for(int x =1;x<=r;x++) {
			for(int c=r;c>=x;c--) {
				System.out.print("* ");
			}
			for(int s=1;s<x;s++) {
				System.out.print("  ");
			}
			
			for(int c=1;c<x;c++) {
				System.out.print("  ");
			}
			for(int c=r;c>=x;c--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	
	}

}

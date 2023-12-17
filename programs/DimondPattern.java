package programs;

public class DimondPattern {

	public static void main(String[] args) {
		int r = 7,val=65;
		for(int x=1;x<=r;x++) {
			for(int y=1;y<x;y++) {
				System.out.print("  ");
			}
			for(int s=r;s>x;s--) {
				System.out.print("* ");
			}
     		for(int s=r;s>=x;s--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

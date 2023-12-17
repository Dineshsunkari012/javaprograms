package programs;
import java.util.Scanner;
public class Dim {

	public static void main(String[] args) {
		//Scanner l = new Scanner(System.in);
		//System.out.println("Enter Number");
		//int r= l.nextInt();
		int r=5;
		for(int x=1;x<=r;x++) {
			for(int y=r;y>x;y--) {
				System.out.print("  ");
			}
			for(int s=1;s<=x;s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int x=2;x<=r;x++) {
			
			for(int s=1;s<x;s++) {
				System.out.print("  ");
			}
			for(int y=r;y>=x;y--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

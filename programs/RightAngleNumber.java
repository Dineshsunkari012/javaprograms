package programs;

public class RightAngleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}

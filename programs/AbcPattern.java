package programs;

public class AbcPattern {

	public static void main(String[] args) {
		int rows=5,val=65;
		for(int x=1;x<=rows;x++) {
			 //val++;
			for(int y=rows;y>= x;y--) {
				System.out.print((char)val+" ");
				val++;	
			}
			System.out.println();
		}
		
	}

}

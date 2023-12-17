package programs;

public class Fibnocci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int x=1;x<=20;x++) {
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
		}
		//System.out.println(n3);
	}

}

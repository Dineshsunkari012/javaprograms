package Objects_Class;

public class vowlesofArray {

	public static void main(String[] args) {
//		Scanner s =new Scanner(System.in);
//		int size = s.nextInt();
		char a[]=new char[] {'a','c','t','f','o','r','e'};
		int count=0,count2=0,count3=0;
		for(int x=0;x<=a.length-1;x++) 
		{
			if(a[x]=='a'||a[x]=='e'||a[x]=='i'||a[x]=='u') {
				count++;
			}
			else {
				count2++;
			}
			
		}
		System.out.println("vowles "+count);
		System.out.println("con " +count2);

		
		char b ='a';
		for(int x=0;x<=a.length-1;x++) 
		{
			if(a[x]== b) {
				count3++;
			}
			
		}
		System.out.println();
	}

}

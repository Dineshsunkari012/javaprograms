package Objects_Class;

import java.util.Scanner;

public class ArrayReverse 
{

	public static void main(String[] args)
	
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = s.nextInt();
		
		int a[] = new int[size];
		for(int x=0;x<=a.length-1;x++) {
			a[x]=s.nextInt();		}

		for(int x=a.length-1;x>=0;x--) {
			System.out.println(a[x]);
		}
		
		
	}
}



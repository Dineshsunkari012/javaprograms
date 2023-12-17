package programs;

import java.util.Scanner;

public class Arrry 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter Size of an array");
		int size = s.nextInt();
		int a[] = new int[size];
	    System.out.println("Enter arry numbers");
		for(int x=0;x<=a.length-1;x++) 
		{
			a[x]=s.nextInt();
		}
		
		
		
		
		
	}

	

}

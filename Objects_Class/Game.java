package Objects_Class;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) 
	{
		int snum = 0;
		int x=snum;
		Game obj =new Game();
		int res=obj.num(x);  
		System.out.println(res);
		System.out.println(obj.num(snum));
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number Between 20-100");
	  int a = sc.nextInt(),temp=a;
	  int num1=0;
//	  System.out.println(num1);
	  int num2=0;
	  //System.out.println(num2);
//	  

		while(a>0) {
			 int rem = a%10;
			num1 = num1+rem;
			a/=10;
			num2= num2 + a;
			break;
		}
		System.out.print("2"+num2);
		int f= num1;
		System.out.println(f-2);
		
		
	  int fnum=0;

	    a=temp;
		while(temp>0) {
			int rem2 = temp%10;
			temp/=10;
			fnum=fnum+temp;
			
			break;
		}
		
		
		switch(fnum) {
	    case 0:
	    	System.out.print(9);
	    	
	    	break;
	    case 1:
	    	System.out.print(8);
	    	break;
	    case 2:
	    	System.out.print(7);
	    	break;
	    case 3:
	    	System.out.print(6);
	    	break;
	    case 4:
	    	System.out.print(5);
	    	break;
	    case 6:
	    	System.out.print(3);
	    	break;
	    case 7:
	    	System.out.print(2);
	    	break;
	    case 8:
	    	System.out.print(1);
	    	break;
	    case 9:
	    	System.out.print(0);
	    	break;
	    case 5:
	    	System.out.print(4);
	}
			
		 snum=0;
		while(a>0) {
			int rem2 = a%10;
			a/=10;
			snum= snum+rem2;		
			break;
		}
//		switch(snum) {
//		case 9:
//	    	
//	    	break;
//		case 8:
//	    	System.out.print(1);
//	    	break;
//		case 7:
//	    	System.out.print(2);
//	    	break;
//		case 3:
//	    	System.out.print(6);
//	    	
//	    	break;
//		case 4:
//	    	System.out.print(5);
//	    	break;
//		case 5:
//			System.out.print(4);
//			break;
//		case 6:
//			System.out.print(3);
//			break;
//		case 2:
//			System.out.print(7);
//			break;
//		case 1:
//			System.out.print(8);
//			break;
//		case 0:
//			System.out.print(9);	
//		}
	}	

 public int num(int x) {
	 
	switch(x) 
	 {
		case 9:
			return 8;
	case 8:
			return 1;
	case 7:
			return 2;
	case 3:
			return 6;
	    	
	case 4:
			return 5;
	case 5:
			return 4;
	case 6:
			return 3;
	case 2:
			return 7;
	case 1:
			return 8;
	case 0:
			
			return 9 ;	
		}
	
	return x;

 }
	
}




package programs;
import java.util.Scanner;
public class BankApp 
{
	public static void main(String args[]) 
	{
		
		
		
		 //System.out.println("            BANK OF D              ");
		 //System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
		 
		 String Name="Dinesh";
		 int p3=1234;
		 
		Scanner z = new Scanner(System.in);
		
		 int total=5000;
		 int t_amount=0;
		 int pin =0;
		
//		 boolean j;
		 long num=9398538091l;
		 System.out.println("Enter your UserName");
		 
		 String name = z.nextLine();
		 
		 while(true) 
		 {
			 System.out.println("Enter you pin");
			 int p = z.nextInt();
			 
			 if(p>=1001&&p<=9999) 
			 {
				
				 System.out.println("1.Deposit");
				 System.out.println("2.Total Balance");
				 System.out.println("3.Withdraw");
				 System.out.println("4.Name Change");
				 System.out.println("5.Change Mobile Number");
				 System.out.println("6.Pin Change");
				 System.out.println("7.Total Details");
				
				 while(true) 
				 {
						boolean j=false;
						int option = z.nextInt();
						 
						 switch(option) 
						 {
						 
							 case 1:
								 System.out.println("--------------Deposit------------");
								 t_amount = z.nextInt();
								 System.out.println("Deposited Amount "+t_amount);
								  total=total+t_amount;
								  System.out.println("For Options 8");
								  System.out.println("Exit 9");
								 //System.out.println(total);
								 //System.out.println("");
								 break;
							 case 2:
								 System.out.println("-------------Total Balance--------------");
								 System.out.println("Total Balance:"+total);
								 System.out.println("For Options 8");
								 System.out.println("Exit 9");
								 
								 break; 
							 case 3:
								 System.out.println("----------------WithDraw-----------");
								 
								 while(true) 
								 {
								 System.out.println("Enter Your Pin");
								 int p1 = z.nextInt();
								 if(pin==p1||p==p1) 
								 {
								 
							      while(true) 
								  {
								   System.out.println("Enter Withdraw Amount");
								   int withdraw = z.nextInt();
								 if(withdraw<total) 
								 {
								 total= total-withdraw;
								 System.out.println("WithDraw Amount:"+withdraw);
								 System.out.println("Total Amount:"+total);
								 System.out.println("For Options 8");
								 System.out.println("Exit 9");
								 
			                     break;
								 }
								 else 
								 System.out.println("Insufficient Balance"); 
								 
								 }
							 break;
								}
								 else 
									 System.out.println("Incorrect Pin");
								 }
							 break;
								 
							 case 4:
								 System.out.println("----------------Change Your Name Here-------------");
								 name = z.nextLine();
								 System.out.println("Enter you Name");
								 name = z.nextLine();
								 System.out.println("your Name was Updated Sucessfully");
								 System.out.println("For Options 8");
								 System.out.println("Exit 9");
								 break;
							 case 5:
								 System.out.println("-----------------Change Your Mobile Number----------------");
								 System.out.println("Enter Your Phone Number");
								 num = z.nextLong(); 
								 System.out.println("Mobile Number Updated Sucessfully");
								 System.out.println("For Options 8");
								 System.out.println("Exit 9");
								 break;
								 	 
							 case 6:
								 System.out.println("------------------Change Your Pin-----------------");
								 while(true) 
							     {
								 System.out.println("Enter Your Pin");
								  pin = z.nextInt();
								 
								 if(pin>=1000&&pin<=9999) 
								 {
									 System.out.println("Your Updated Pin "+pin);
									 
									 break;
								 }
								 else 
								 {
									 System.out.println("Please Enter Four Digits");
								}
								
								 }
								 System.out.println("For Options 8");
								 System.out.println("Exit 9");
								 break;
							 case 7:
								 System.out.println("_-_-_-_-_-_-_-_-Bank of D _-_-_-_-_-_-_-_-");
								 System.out.println("---------------Your Details--------------");
								 System.out.println("Name           :" +name);
								 System.out.println("TotaL Amount   :"+total);
								 System.out.println("Mobile Number  :"+num);
								 System.out.println("Account Number :456789451245");
								 System.out.println("For Options 8");
								 System.out.println("Exit 9");
								 
								 
								 break;
								 
							 case 8:
								 System.out.println("1.Deposit");
								 System.out.println("2.Total Balance");
								 System.out.println("3.Withdraw");
								 System.out.println("4.Name Change");
								 System.out.println("5.Mobile Number");
								 System.out.println("6.Pin Change");
								 System.out.println("7.Total Details");
								 System.out.println("Exit 9");
								break;
							 case 9:
								 j = true;
								 break;
							default:
								System.out.println("Please Enter Valid InPut");

						 }
						 
						 if(j==true) 
						 break;
				 }
				break;
			}
			
			else 
				System.out.println("Enter Only Four Digits");
			
		 }
		 System.out.println("********Thanks For Banking With Us*******");
	}

}




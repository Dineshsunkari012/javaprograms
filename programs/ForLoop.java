package programs;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1,count=0,sum=0,product=1;
		String odd_numbers = "";
		while(num<=10){
			if(num%2==0){
				
				count = count+1;
				sum = sum+num;
				product = product*num;
			}
			else{
//				 odd_numbers = (String)odd_numbers+num;
				 System.out.println(num);
			}
			num++;
		}
		System.out.println("total even numbers "+ count);
		System.out.println("product of even numbers"+ product);
		System.out.println("sum of even numbers"+ sum);
		System.out.println("odd Numbers "+odd_numbers);
		

	}

}

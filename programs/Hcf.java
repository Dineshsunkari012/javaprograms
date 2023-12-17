package programs;

public class Hcf 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1 = 17,num2 = 21,x=1,hcf=0;
		while(x<=num1&&x<=num2) {
			if(num1%x==0&&num2%x==0) {
				hcf=x;
				
			}
			x++;
			
		}
		System.out.println(hcf);

	}

}

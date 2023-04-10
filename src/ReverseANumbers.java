import java.util.Scanner;

public class ReverseANumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number=0;
		int reverse=0;
		
		
		System.out.println("enter the number  : ");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		
		while(number!=0)
		{
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
			
			
			}
		System.out.println(reverse);
		}

}

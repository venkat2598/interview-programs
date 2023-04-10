import java.util.Scanner;

public class SwapTwoNumbers {
	
	public void variable() {
		
		int venkat=500;
		int nanthini=300;
		System.out.println("before swap "+" venkat: "+venkat+" nanthini: "+nanthini);
		int temp;
		
		temp=venkat;
		venkat=nanthini;
		nanthini=temp;
		System.out.println("After swap "+" venkat: "+venkat+" nanthini: "+nanthini);
	}
	
	
	public void withoutvariable() {
		
		int my=400;
		int you=600;
		
		System.out.println("enter the number 1 : ");
		Scanner scan=new Scanner(System.in);
		my=scan.nextInt();
		System.out.println("enter the number 2 : ");
		you=scan.nextInt();
		 
		System.out.println("before swap "+" my: "+my+" you: "+you);
		my=my-you;
		you=my+you;
		my=you-my;
		System.out.println("After swap "+" my: "+my+" you: "+you);
	}

	public static void main(String[] args) {
	
	SwapTwoNumbers swap=new SwapTwoNumbers();
	swap.variable();
	swap.withoutvariable();
	}

}

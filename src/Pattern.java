package programs;
import java.util.Scanner;

public class Pattern {
	
	//triangle pattern
	/*  *
	 *  * *
	 *  * * *
	 *  * * * *
	 *  * * * * *
	 * */
	 
	public void triangle() {
		//triangle pattern

				Scanner scan=new Scanner(System.in);
				System.out.println("enter the number : ");
				int num=scan.nextInt();

				int row,column;

				for(row=0;row<num;row++)
				{
					for(column=0;column<=row;column++) 
					{
						System.out.print("*");
					}
					System.out.println();
				}
	}
	
	
	
	
	//number pattern 
	/*1
	 *2 3
	 *4 5 6
	 *7 8 9 10
	 *11 12 13 14 15
	*/
	
	public void numbersPattern() {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the limit: ");
		int limit=scan.nextInt();
		int start=1;

		int row,column;
		for(row=0;row<limit;row++) 
		{
			for(column=0;column<=row;column++) 
			{
				System.out.print(start+" ");
				start++;
				
			}
			System.out.println();
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-

Pattern pattern=new Pattern();
pattern.triangle();
pattern.numbersPattern();
		
	
	}

}

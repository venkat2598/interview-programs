package programs;

import java.util.Scanner;

public class FindThePositionOfAlphaBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ASCII VALUE
		/*
		 * 97  -> a     122  ->z
		 * 
		 * 65  -> A     90  -> Z
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the characters : ");
		char given=scan.next().charAt(0);
		given=Character.toUpperCase(given);
		
		int asciivalue=(int)given;
		System.out.println(asciivalue);
		
		int position=asciivalue-64;
		System.out.println(position);
	}

}

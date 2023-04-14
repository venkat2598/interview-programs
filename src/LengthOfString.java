package programs;

import java.util.Scanner;

public class LengthOfString {
	
	static String name;
	
	public void usinglength() {
	System.out.println("enter the value : ");
	System.out.println(name.length());
	}
	
	public void findlength() {
		
		char[] array=name.toCharArray();
		int length = 0;
		for(char c:array) {
			length++;
		}
		System.out.println(length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the vaiue : ");
		name=scan.nextLine();
		
		LengthOfString lenstring=new LengthOfString();
		
		lenstring.usinglength();
		lenstring.findlength();
	}

}

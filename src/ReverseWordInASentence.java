package programs;

import java.util.Scanner;

public class ReverseWordInASentence {
	
	//input=venkat-is-a-bike-racer;
	//output=racerbikeaisvenkat;
	
	
	
	 static String name;
	
	
	public void reverseword() {
		
		String[] word=name.split("-");
		
		System.out.println(word.length);
		
		
		String reverse="";
		
		
		for (int i=word.length-1;i>=0;i--) {
			reverse=reverse+word[i];
			
		}
		System.out.println(reverse);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the sentence : ");
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		
		ReverseWordInASentence reversewordof=new ReverseWordInASentence();
		reversewordof.reverseword();
		
	}

}

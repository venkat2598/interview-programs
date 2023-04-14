package programs;

import java.util.concurrent.CountDownLatch;

public class FindTheNumberOfVowelsInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*notes
		 * ------
		 * 
		 * 1.vowels={a,e,i,o,u};
		 * vowelscount=0;
		 * 
		 * find the length of string
		 *  iterate the string of length
		 * compare the input in charat method to vowels  if any matching then vowelcount to be 1 is increase
		 * untill no characters 
		
		 */
		
		String name="Venkat Bike Racer";
		
		int countvowels=0;
		
		int length=name.length();
		
		for(int i=0; i<length; i++) {
			
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' ||  name.charAt(i)=='o' || name.charAt(i)=='u') {
				countvowels++;
				
			}
		}
		System.out.println("total vowels in the name : "+countvowels);
		
		
		
	}

}

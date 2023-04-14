package programs;

import java.awt.AlphaComposite;
import java.util.Arrays;
import java.util.HashSet;

public class FindTheMisssingAlphabetInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*notes the point
		 * --------------
		 * 
		 * 1.convert string in the uniform format
		 * 2.remove spaces is there any
		 * 3.store the input in the string array
		 * 4.create a arrray with english alphabet
		 * 5.create two hashset, one is input and another is english alphabey
		 * 6.finally twp set compare and get missing alphabet
		 */		

		String name="venkat";

		name=name.toLowerCase();

		name=name.replace(" ", "");

		String [] input=name.split("");
		System.out.println(name);

		String[] Alphabet="abcdefghijklmnopqrstuvwxyz".split("");
		System.out.println(Alphabet);

		HashSet<String> set1=new HashSet<String>(Arrays.asList(input));
		
		HashSet<String> set2=new HashSet<String>(Arrays.asList(Alphabet));

		set2.removeAll(set1);
		
		System.out.println(set2);
		


	}

}

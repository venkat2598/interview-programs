package programs;

public class RemovingLeadingAndTrailingSpaces {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		/*remove the white space in a given string for ex:  " venkat ";
		 * first and  last is add a space its white space 
		 * will remove the spaces in different ways
		 * 
		 * there are 
		 * 
		 * 		1.trip()
		 * 		2.Strip()
		 * 		3.Regex -> replaceall to be used
		 * 
		 */
		String name=" Hello Venkat ";
		
		System.out.println(name.trim());
		System.out.println(name.strip());
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", ""));
		System.out.println(name.replaceAll("^[ \t]",  ""));
		System.out.println(name.replaceAll("[ \t]+$",  ""));
		
			
	}
	

}

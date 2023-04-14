package programs;

public class RemoveAllVowelsWithASpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="I Love India";

		/*
		 * name=name.toLowerCase();
		 * 
		 * char[] chararray=name.toCharArray();
		 * 
		 * for(int i=0;i<name.length(); i++) { if(name.charAt(i)=='a' ||
		 * name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' ||
		 * name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' ||
		 * name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U' ) {
		 * 
		 * chararray[i]='@'; } }
		 * 
		 * System.out.println(chararray);
		 */
		
		String replace=name.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(replace);
	}

}

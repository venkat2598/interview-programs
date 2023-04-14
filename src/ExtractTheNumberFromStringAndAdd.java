package programs;

public class ExtractTheNumberFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ex:
		 * 
		 * inpupt="venkat123";
		 * output=6;   add the numbers (1+2+3)
		 * 
		 */
	
		String name="Venkat25Racer98";
		
		int length=name.length();
		
		int digit=0;
		
		for(int i=0;i<length; i++) {
			
		char character=	name.charAt(i);
			
			if(Character.isDigit(character))
			{
				digit=digit+Character.getNumericValue(character);
			}
		}
		System.out.println(digit);
		
		

		
		
	}

}

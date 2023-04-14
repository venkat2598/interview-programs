package programs;

public class FindTheOccurenseOfString {
	
	String name="Bikeracer";
	
	public void usingIterator() {
		
		
		char findletter='e';
		
		int occurance=0;
		
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==findletter) {
				
				occurance++;
				
			}
		}
		System.out.println(occurance);
	}
	
	
	public void withOutIterator()
	{
		char tofind='r';
		
		name=name.toUpperCase();
		
		String tochar=Character.toString(tofind).toUpperCase();
		
		int actualLength=name.length();
		System.out.println("actualLength : " + actualLength);
		
		name=name.replace(tochar, "");
		int afterReplace=name.length();
		System.out.println(afterReplace);
		
		int occurance=actualLength-afterReplace;
		System.out.println("r is " + occurance + " time " );
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheOccurenseOfString findoccurance=new FindTheOccurenseOfString();
		findoccurance.usingIterator();
		findoccurance.withOutIterator();
	}

}

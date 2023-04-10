import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {
	
	
	public void usingbuffer() {
		
		String s="venkat";
		
		StringBuffer buffer=new StringBuffer();
		buffer.append(s);
		System.out.println(buffer.reverse());
		
	}
	
	public void logic() {
		
		String s="Bikeracer";
		char[]  array= s.toCharArray();
		String empty="";
		
		for(int i=array.length-1; i>=0; i--)
		{
			empty=empty+array[i];
			
		}
		System.out.println(empty);
	}
	
	
	public void usingCollection() {
		
		String name="selenium";
		char[] array=name.toCharArray();
	
		List<Character> list=new ArrayList<Character>();
		
		for (Character character : array) {
			list.add(character);						
		}
		
		Collections.reverse(list);

		  ListIterator iterator=list.listIterator();
		  while(iterator.hasNext()) 
		  { System.out.println(iterator.next());
		 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseAString string=new ReverseAString();
		string.usingbuffer();
		string.logic();
		string.usingCollection();
		
		
	}

}

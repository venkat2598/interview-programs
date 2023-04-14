package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallNumber {
	
	
	//small number in given array=1;
	
	Integer[] array= {3,5,8,4,1,9};
	
	public void smallnumber() {
		
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(	array[i]<smallest)
				{
					smallest=array[i];
				}
		}
		System.out.println(smallest);
	}
	
	
	public   void usingArrays() {
		
		Arrays.sort(array);
		System.out.println(array[0]);
		
	}
	
	public void usingCollection() {
		
		 List<Integer> listarray=Arrays.asList(array);
		 
		 Collections.sort(listarray);
		 
		Integer list= listarray.get(0);
		System.out.println(list); 
		 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSmallNumber small=new FindSmallNumber();
		small.smallnumber();
		small.usingArrays();
		small.usingCollection();
		
	}

}

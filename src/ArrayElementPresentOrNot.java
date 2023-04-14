package programs;

public class ArrayElementPresentOrNot {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array= {5,9,2,4,2,8};
		
		int findnumber=1;
		
		Boolean identify=false;
		
		for (int numbers : array) {
			
			if(numbers==findnumber) {
				identify=true;
				System.out.println("number is present");
				break;
			}
		}
		
		/*
		 * if(identify) { System.out.println("number is present"); } else
		 * System.out.println("number is not present");
		 */
	}

}

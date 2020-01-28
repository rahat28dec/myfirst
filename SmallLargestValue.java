package ArrayBasic;

import java.util.Arrays;
import java.util.Collections;

public class SmallLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {7, 5,-45, 11, 2, 16,100, 4, 18, 14, 12, 30};
		Integer[] intArray = new Integer[] {7, 5,-45, 11, 2, 16,100, 4, 18, 14, 12, 30};

		Arrays.sort(b);
		Arrays.sort(intArray, Collections.reverseOrder());
		 System.out.println(Arrays.toString(intArray));
		
		System.out.println(b[0]);
		System.out.println(b[b.length-1]);
		int largest= b[0];
		
		int smallest= b[0];
		
		for(int i=0;i<b.length;i++) {
			
			if(b[i]>largest) {
				
				largest=b[i];
			}
			
			else if(b[i]<smallest) {
				
				smallest=b[i];
			}
		}
		
		System.out.println("The given array is : "+ Arrays.toString(b));
		System.out.println("the largest number is " + largest);
		System.out.println("the smallest number is " + smallest);
	}

}

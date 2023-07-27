package week1.day2;

import java.util.Arrays;  

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] a = {3,2,11,4,6,7};  // input data
        Arrays.sort(a); // sorted the data
		
        System.out.println("The Second Largest Number in the given data is" + " " + a[a.length-2]); //Print the value
        
		
	}

}

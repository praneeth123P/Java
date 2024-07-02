package Array;
import java.util.Arrays;
public class largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {10, 324, 45, 90, 9808}; 
         
         // Java Stream and max to find the max element
         // in array
         int max = Arrays.stream(arr).max().getAsInt(); 
      
         // Printing the result
       System.out.println("Largest in given array is " +max); 
   } 


	}



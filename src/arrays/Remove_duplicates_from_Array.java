package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_from_Array {
 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int arr[] = { 0,1, 5, 2, 1, 2, 2, 5, 1, 7, 2, 4, 2,0,0 };
	        
	        Set<Integer> set
            = new HashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
 
        // Print the elements of LinkedHashSet
        System.out.print(set);	    }
}

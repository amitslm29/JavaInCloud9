package com.org.array;

public class CheckIfArrayElementsInConsecutive {
	
	public static void main(String[] args) {
		int[] arr = {6,3,5,1,4,2};
		System.out.println("Is array elements are in "
				+ "consecutive : " + isElementsInConsecutive(arr));
	}
	
	public static boolean isElementsInConsecutive(int[] arr) {
		
		// Number of Elements in Array
		int numberOfElements = arr.length;
		
		if(numberOfElements < 1)
			return false;
		
		// Maximum Element in Array
		int max = getMaximum(arr);
		
		// Minimum Element in Array
		int min = getMinimum(arr);
		
		// If numberOfElements == max-min+1, then only we 
		// will check further, else return false
		if(max-min+1 == numberOfElements) {
			
			// Now need to check whether any duplicates available, 
			// if not return true. Create a temporary array to hold 
			// visited flag of all elements.
			boolean[] visited = new boolean[numberOfElements]; 
			
			for(int i=0 ; i <numberOfElements ; i++) {
				// If we see an element again, then return false
				if(visited[arr[i] - min] == true)
					return false;
				
				// If visited first time, then mark the element as visited.
				visited[arr[i] - min] = true;
			}
			return true;
		}
		return false;
	}

	public static int getMinimum(int[] arr) {
		int minimum = arr[0], size = arr.length;
		for(int i=1 ; i< size ; i++) {
			if(arr[i] < minimum)
				minimum = arr[i];
		}
		return minimum;
	}
	
	public static int getMaximum(int[] arr) {
		int maximum = arr[0], size = arr.length;
		for(int i=1 ; i< size ; i++) {
			if(arr[i] > maximum)
				maximum = arr[i];
		}
		return maximum;
	}
}

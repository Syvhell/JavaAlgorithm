package arrays.sortingArray;

public class QuickSortPractice {


	    // The main method is the entry point of the application
	    public static void main(String args[]) {
	        // Initialize an array of integers to be sorted
	        int[] sortArray = {16, 9, 55, 20, 80, 15};
	        
	        // Call the quickSort method with the array, starting index (0), and ending index (array length - 1)
	        quickSort(sortArray, 0, sortArray.length - 1);
	        
	        // Print the sorted array
	        for (int resultNum : sortArray) {
	            System.out.println(resultNum);
	        }
	    }
	    
	    // Recursive quickSort method
	    public static void quickSort(int[] sortArray, int lowestValue, int highestValue) {
	        // Base condition: if the lowest index is less than the highest index
	        if (lowestValue < highestValue) {
	        	
	        	//System.out.println("firstHighValue "+highestValue);
	        	//System.out.println("firstLowValue "+lowestValue);
	            // Partition the array and get the pivot index
	            int pivotIndex = partition(sortArray, lowestValue, highestValue);
	            System.out.println("pivotIndexValue "+pivotIndex);
	            
	            System.out.println("firstValueT "+ pivotIndex);
	            // Recursively sort the left part of the array
	            quickSort(sortArray, lowestValue, pivotIndex - 1);
	            System.out.println("firstValueO "+lowestValue+" - " + pivotIndex);
	            // Recursively sort the right part of the array
	            quickSort(sortArray, pivotIndex + 1, highestValue);
	            System.out.println("firstValue "+pivotIndex +" - "+ highestValue);
	        }
	    }
	    
	    // Partition method to arrange elements around the pivot
	    public static int partition(int[] sortArray, int lowestValue, int highestValue) {
	        // Choose the last element as the pivot
	        int pivot = sortArray[highestValue];
	        
	        // Initialize the index of the smaller element
	        int i = lowestValue - 1;
	        
	        System.out.println("secondHighValue "+highestValue);
        	System.out.println("secondLowValue "+lowestValue);
	        
	        // Traverse the array from the lowest value to the highest value - 1
	        for (int j = lowestValue; j < highestValue; j++) {
	            // If the current element is smaller than the pivot
	            if (sortArray[j] < pivot) {
	                // Increment the index of the smaller element
	                i++;
	                
	                // Swap the current element with the element at index i
	                swap(sortArray, i, j);
	            }
	        }
	        
	        // Swap the pivot element with the element at index i+1
	        swap(sortArray, i + 1, highestValue);
	        
	        // Return the pivot index
	        return i + 1;
	    }
	    
	    // Swap method to exchange elements at two indices in the array
	    public static void swap(int[] sortArray, int i, int j) {
	    	
	        // Temporarily store the value at index i
	        int temporary = sortArray[i];
	        
	        System.out.println("-highValue "+j);
        	System.out.println("-lowValue "+i);
	        System.out.println("-highValueArray "+sortArray[j]);
        	System.out.println("-lowValueArray "+sortArray[i]);
        	System.out.println("-temporary "+temporary);
	        
	        // Assign the value at index j to index i
	        sortArray[i] = sortArray[j];
	        
	        // Assign the temporarily stored value to index j
	        sortArray[j] = temporary;
	        System.out.println("-temporaryARRAY "+temporary);
	    }
	}


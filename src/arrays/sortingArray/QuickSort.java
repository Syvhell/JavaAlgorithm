package arrays.sortingArray;

/*
 * Declare set array
 * Sort 1
 * partition 2
 * swap 3
 * return value
 */

public class QuickSort {
    public static void main(String[] args) {
    	// Instantiate arrayLIst of integer
        int[] arr = {26, 2, 23, 12, 20};
        // Call method whatsoever called
        quickSort(arr, 0, arr.length - 1);
        // Iterate on array list
        for (int num : arr) {
        	// print output value
            System.out.print(num + " ");
        }
    }
    
    // function for sorting
    public static void quickSort(int[] arr, int low, int high) {
    	//validate low is less than high
        if (low < high) {
        	// Instantiate int varaible and call partion method
            int pivotIndex = partition(arr, low, high);
            // call method pass arguments decrement high
            quickSort(arr, low, pivotIndex - 1);
            // call method pass arguments decrement low
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    // partitioning 
    public static int partition(int[] arr, int low, int high) {
    	// get the last Value in the list 
        int pivot = arr[high]; // Choosing the last element as pivot
        // set low value and decrement to 1
        int i = low - 1;
        //iterate 
        for (int j = low; j < high; j++) {
        	// Validate array j value is less than pivot value
            if (arr[j] < pivot) {
            	// increment i
                i++;
                // call method swap and pass arguments
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }
    //swapping
    public static void swap(int[] arr, int i, int j) {
    	// Instantiate a variable that will contain the value of i
        int temp = arr[i];
        // put the value of array j to array i
        arr[i] = arr[j];
        // put value of temp to array j 
        arr[j] = temp;
    }
}

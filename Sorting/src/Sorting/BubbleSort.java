package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int n = unsortedArray.length;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (unsortedArray[i-1] > unsortedArray[i]) {
					int temp = unsortedArray[i-1];
					unsortedArray[i-1] = unsortedArray[i];
					unsortedArray[i] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		return unsortedArray;
	}
}

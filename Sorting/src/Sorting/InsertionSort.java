package Sorting;

public class InsertionSort {

	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

	public static int[] swap (int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}

	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		
		for (int i = 1; i < unsortedArray.length; i++){
			int j = i;
			while (j > 0 && unsortedArray[j-1] > unsortedArray[j]){
				unsortedArray = swap(unsortedArray, j, j-1);
				j--;
			}
		}
		return unsortedArray;
	}

	// public static void main(String[] args){
	// 	int[] toSort = new int[] { 5,24, 25,2,1,5,8,3,45,2};
	// 	int[] sorted = insertionSort(toSort);

	// 	printArray(toSort);
	// }
}

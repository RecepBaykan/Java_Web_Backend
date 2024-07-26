package SortingAlgorithm;

public class QuickSort {

	public static void main(String[] args) {

		QuickSort q = new QuickSort();

	
	}

	public int[] quickSort(int[] dizi) {

		int[] arr = dizi;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		return arr;

	}

}

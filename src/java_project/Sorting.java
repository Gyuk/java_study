package java_project;
// 20123431 È«±ÔÇõ
public class Sorting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {40,30,90,60,10,20,50,80,70,100};
		int left = 0;
		int right = arr.length-1;
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		quickSort(arr, left, right);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
		
}



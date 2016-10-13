package java_project;
import java.util.Scanner;

public class BinarySearch {
	static int[]arr= {40,30,90,60,10,20,50,80,70,100};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input: ");
		Scanner scan = new Scanner(System.in);
		int key;
		key = scan.nextInt();
		Binarysearch(arr , key);
		
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
	public static void Binarysearch(int[] arr, int target){
		int first =0;
		int last = arr.length-1;
		int mid , result=0;
		quickSort(arr, first, last);
		while(first <= last){
			mid = (first + last)/2;
			if(target == arr[mid]){
				result =1;
				break;
			}
			else{
				if(target < arr[mid])
					last = mid -1;
				else
					first = mid +1;
			}
		}
		if(result == 1)
			System.out.println(target+" FOUND");
		else
			System.out.println(target+" NOT FOUND");

	}
	

}

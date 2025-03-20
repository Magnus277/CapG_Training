package arrays_Day6;
import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args) {
//		int[]arr= {1,4,45,67,78};
//		int[]arr2= {1,4,45,67,77};
//		int target=45;
//		System.out.println(Arrays.binarySearch(arr,target));
//		int[]array=Arrays.copyOf(arr, 7);
//		for(int i:array) {
//			System.out.println(i);
//		}
//		for(int i: Arrays.copyOfRange(arr,0,3)) {
//			System.out.println(i);
//		}
//		System.out.println(Arrays.equals(arr, arr2));
		int[]arr3= {1,4,45,67,77,56,43};
		Arrays.sort(arr3);
		for(int i: arr3) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr3));
	}
}


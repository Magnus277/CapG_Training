package arrays_Day6;

import java.util.Scanner;

public class PalindromicArray {
	public static int[] createArray() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public static void isPalindrome(int[] arr) {
		for (int num : arr) {
			int temp = num;
			int reversed = 0;

			while (temp > 0) {
				int d = temp % 10; 
				reversed = reversed * 10 + d; 
				temp /= 10; 
			}

			System.out.println(num + " is palindrome? " + (num == reversed));
		}
	}

	public static void main(String[] args) {
		int[] arr = createArray();
		isPalindrome(arr);
	}
}

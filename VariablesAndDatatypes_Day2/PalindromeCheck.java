package VariablesAndDatatypes_Day2;
import java.util.*;


public class PalindromeCheck {
	public static boolean allPalindromes(int[] arr) {
		for(int num: arr) {
			if(!palindromeCheck(num)) {
				return false;
			}
		}
		return true;
	}
	public static boolean palindromeCheck(int num){
		int original=num, reversed=0;
		while(num>0) {
			int d=num%10;
			reversed=reversed*10+d;
			num/=10;
		}
		return original==reversed;
	}
	public static void main(String[] args) {
		int [] arr1= {121,313,444,777};
		int [] arr2= {142,341,434,707};
		System.out.println(allPalindromes(arr1));
		System.out.println(allPalindromes(arr2));
	}
}

package string_class_Day16;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		// String s1="hello";
		// String s2=new String("hello");
		// char[] arr= {'j','a','v','a'};
		// String s3=new String(arr);
		// System.out.println(s1+" "+s2+" "+s3);

		String s1 = "hello";
		// String s2="hello";
		// String s2=new String("hello");
		// System.out.println(s1==s2); //both ref variables are pointing to the
		// same object
		// System.out.println(s1.equals(s2)); //comparing values as equals() is
		// already overridden
		// s1=s1+"world"; //heap area, previous object gets deleted and new
		// object in heap points to this

		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(2));
		s1 = s1.concat("world");
		System.out.println(s1);

		String message = "What, a ,wonderful world";
		System.out.println(message.contains("a")); // "a" means a as a string
		System.out.println(message.contains("world"));
		System.out.println(message.contains("zebra"));

		char[] arr = {'d', 'e', 'm', 'o'};
		String s2 = String.copyValueOf(arr);
		System.out.println(s2);

		String s3 = String.copyValueOf(arr, 0, 2);
		System.out.println(s3);

		System.out.println(message.endsWith("world"));
		
		String s4="hello";
		String s5="Hello";
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println(message.indexOf('w'));
		System.out.println(message.lastIndexOf('w'));
		System.out.println(message.lastIndexOf("world"));
		
		System.out.println(String.join("?","world","jik"));
		
//		System.out.println(message.replace("world, "earth"));
		
		String[] arr1=message.split(" ");
		System.out.println(Arrays.toString(arr1));
		String[] arr2=message.split(",");
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3=s1.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		String s6="   jeijfioewj    njnefef    ";
		System.out.println(s6);
		System.out.println(s6.trim());
		
		String s7="Hello world";
		System.out.println(s7.substring(6));
		System.out.println(s7.substring(0, 4));
				
	}
}

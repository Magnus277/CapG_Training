package stringBuffer_Day17;

public class Debayan {
	public static void main(String[] args) {
//		StringBuffer sb1=new StringBuffer();
//		sb1.append(false); //append--->add from the end
//		sb1.append("Hello");
//		System.out.println(sb1);
		
		
//		StringBuffer sb2=new StringBuffer("Hello World");
//		System.out.println(sb2);
//		
//		sb2.delete(0, 4);
//		System.out.println(sb2);
//		System.out.println("----------------");
		
		
		char[] arr= {'j','a','v','a'};
		StringBuffer sb3=new StringBuffer(150);
		sb3.append(arr);
//		sb3.append(arr);
//		System.out.println(sb3);
//		System.out.println(sb3.capacity());
//		sb3.ensureCapacity(189);
//		System.out.println(sb3.capacity());
		
//		System.out.println(sb3.insert(2, false));
//		System.out.println(sb3);
		System.out.println(sb3.insert(2, arr,1,2));
//		sb3.reverse();
//		System.out.println(sb3);
		sb3.setCharAt(2, 'c');
		System.out.println(sb3);
		
		String s=new String(sb3);
		System.out.println(s);
	}
}

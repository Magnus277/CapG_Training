package Operators_Day3;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 4;
//		int c = a+b;
//		System.out.println(c);
//		int result = 10*20+(20+3)+50-(2+1); //270
//		System.out.println(result);
		
		//---------------------------------------
		
		
//		System.out.println("Hello"+true+10); // left to right associativity
//		System.out.println(true+10+"Hello"); // error as boolean+literal concatenate cant happen
//		System.out.println(10+10.75+'A'+true+"hi"+"demo"+15); //error 
//		byte x = 10+50; // stores bcuz its in the range of byte(128)
		
//		
		//---------------------------
		
		
//		float f = 10.56f;
//		double d = 10.44d;
//		System.out.println(f+d);
		
		
//		int _ = 21;
//		System.out.println(_); //error as only $ is allowed as special character
		
		
		// Rules of string concatenation:
		// string+boolean=concatenated string
//		System.out.println("AB"+true);
//		System.out.println("AB"+true+11);
//		System.out.println(true+11+"AB"); //as its left to right,firstly true+11 will execute but it will give error as there is no concatenation bw boolean and literals

		// concatenation bw String and integer literals
//		System.out.println("Hello" + 5);      // Hello5
//		System.out.println(5 + "Hello");      // 5Hello

		// left to right associativity
//		System.out.println(10 + 20 + "Hello");  // 30Hello
//		System.out.println("Hello" + 10 + 20);  // Hello1020

		// parenthesis change the order of execution
//		System.out.println("Sum: " + (10 + 20));  // Sum: 30

		// null is treated as a string "null"
//		System.out.println(null + "Hello");  // nullHello
//		System.out.println("Hello" + null);  // Hellonull

//		Concatenation with char results in numeric addition, unless a String is involved.

//		System.out.println('A' + 'B');      // 131 (because 'A' = 65, 'B' = 66, so 65 + 66 = 131)
//		System.out.println("A" + 'B');      // AB  (String + char → String)

	}

}

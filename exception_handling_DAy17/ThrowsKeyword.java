package exception_handling_DAy17;

public class ThrowsKeyword {
	public static void main(String[] args) {
		try {
		div(10,0);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public static void div(int x,int y) throws RuntimeException,ClassNotFoundException {
		System.out.println(x/y);
		Class.forName("demo");
	}
}

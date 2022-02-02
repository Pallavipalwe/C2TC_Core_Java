
public class Test14 {
	static int i = demo();
	static {
		System.out.print(i);
	}
	public Test14() {
		System.out.print("Hello1");
		
	}
	static int demo() {
		System.out.println("InsideDemo");
		return 10;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

	}

}

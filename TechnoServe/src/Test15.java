
public class Test15 {
	static {
		int a = 5;
		System.out.println("static");
		
	}
	//@SuppressWarnings("static-access")
	{
		System.out.println("block");
	}
	public Test15() {
		System.out.println("Test");
	}
	@SuppressWarnings("unused")
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Test15().call();
		Test15 t = new Test15();
		
		

	}
	static void call() {
		
	}

}

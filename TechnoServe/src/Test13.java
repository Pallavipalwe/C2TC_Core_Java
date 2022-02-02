class Base {
	public Base() {
		System.out.print("Base");
	}
//	private Base() {
//		System.out.print("Base");
	}

public class Test13 extends Base {
	public Test13() {
		System.out.println("Derived");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(1);
		add(1,2);
		new Test13();

	}
	static void add(int...args) {
		
	}

}

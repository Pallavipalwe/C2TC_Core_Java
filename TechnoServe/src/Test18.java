
class A9 {
	public void printValue() {
		System.out.println("A");
	}
}
class B extends A9 {
	public void printValue() {
		System.out.println("B");
	}
}
public class Test18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9 b = new B();
		newValue(b);
	}
	public static void newValue(A9 a) {
		if (a instanceof B)
			((B) a).printValue();
	}

}

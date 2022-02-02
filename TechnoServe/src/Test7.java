class Num {
	Num(double x) {
		System.out.println(x);
	}
}
public class Test7 extends Num {
	test7(double x) {
		super(x);
	}
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num t = new Num(2);

	}

}

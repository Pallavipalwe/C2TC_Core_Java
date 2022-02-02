class A {
	public static void method(int i) {
		System.out.println("Method 1");
	}
	public static void method(String str) {
		System.out.println("Method 2");
	}
}
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.method(5);
		Test8 t=new Test8();
		System.out.println(t.display(4,5));

	}
	public int display(int x,int y) {
		System.out.print("The sum of x and y is ");
		return(x+y);
	}

}

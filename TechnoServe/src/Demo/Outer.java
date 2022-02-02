package Demo;
import java.lang.*;
public class Outer {
	int x=10;
	static int y=100;
	static class inner
	{
		public void method_Demo()
		{
			System.out.println("I am inner class");
			System.out.println(y);
		}
		
	}

	public static void main(String[] args) {
		Outer.inner obj = new Outer.inner();
		obj.method_Demo();
		inner n = new inner();
		n.method_Demo();
		
		
		
		
		// TODO Auto-generated method stub

	}

}

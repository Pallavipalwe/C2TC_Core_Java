
public class Test17 {
	@SuppressWarnings("unused")
	private int queNo = 100;
	char String = 'a';
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10;
		x = myMethod(x--);
		System.out.println(x);
	}
	static int myMethod(final int x) {
		//return x--; x can not change
		return x;

		
	}

}

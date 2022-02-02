
public class Test19 {
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hellow");
		System.out.println(s1 = s2);
		
		String s3 = new String("OKAY");
		String s4 = new String(s3);
		System.out.println(s3 == s4);
		
		String s5 = "java"; 
		String s6 = "java";
		System.out.println(s1.equals(s2));
		System.out.println(s5 == s6);

	}

}

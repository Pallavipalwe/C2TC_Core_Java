
public class Test22 {
	@SuppressWarnings({"null","unused"})

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "what";
		String s1 = "s1="+"123"+"456";
		String s2 ="s2="+(123+456);
		
		StringBuffer sb = new StringBuffer("what");
		System.out.println(sb.equals(s)+","+s.equals(sb));
			System.out.println(s1+","+s2);
			
			Object myObj = new String[] {"one","two","three"};
			for(String s3:(String[])myObj) {
				System.out.print(s+".");
				
				System.out.println(s.length());
			}
		}

	}



package Demo;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer S=new StringBuffer("Pallavi");
		//S.append("Palwe");
		String S=new String("Pallavi");
		System.out.println(S.length());
		System.out.println(S.toLowerCase());
		String upper = S.toUpperCase();
		System.out.println(upper);
		String S1 ="MUMBAI";
		System.out.println(S1.equals("mumbai"));
		System.out.println(S1.equalsIgnoreCase("mumbai"));
		System.out.println(S1.replace('M','T'));
		System.out.println(S.trim());
		System.out.println(S.substring(6));
		System.out.println(S.substring(2,7));




	}

}

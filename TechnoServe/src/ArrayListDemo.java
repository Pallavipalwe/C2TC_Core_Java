import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ArrayList l=new ArrayList();
		l.add("A");
		System.out.println(l);
		l.add(10);
		l.add("B");
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.add(2,"N");
		System.out.println(l);
		


	}

}

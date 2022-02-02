class Animal6{
	Animal6(){
		System.out.println("Animal");
	}
}
class Wild extends Animal6 {
	Wild() {
		super();
		System.out.println("Wild");
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wild wild = new Wild();

	}

}

class Animal3 
{
	public void eat() {
		System.out.println("I can eat");
		
	}

	//public void eat() {
		// TODO Auto-generated method stub
		
	}

class Dog4 extends Animal3{
	// overriding the eat() method
 	//@Override
	public void eat()  {
		super.eat();
		System.out.println("I eat dog food");
		
	}
	public void bark() {
		System.out.println("I can bark");
	}
}
public class Main3 {
	public static void main(String[] args) {
		Dog4 labrador = new Dog4();
		labrador.eat();
		labrador.bark();
		// TODO Auto-generated method stub

	}

}

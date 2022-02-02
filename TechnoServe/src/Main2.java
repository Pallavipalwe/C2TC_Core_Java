class Animal1 {
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog1 extends Animal1 {
	@Override
	public void eat()
	{
		System.out.println("I eat dog food");
		
	}
	public void bark() {
		System.out.println("I can bark");
		
	}
	
	
	
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 labrador = new Dog1();
		labrador.eat();
		labrador.bark();
		

	}

}

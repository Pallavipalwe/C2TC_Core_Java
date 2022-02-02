class Animal4 {
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
	
}
class Dog5 extends Animal4 {
	public void display() {
		System.out.println("My name is"+   name);
	}
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog5 labrador = new Dog5();
		labrador.name = "Rohu";
		labrador.display();
		labrador.eat();

	}

}

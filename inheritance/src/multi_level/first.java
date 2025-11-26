package multi_level;

public class first {

	public static void main(String[] args) {
		Dog d =new Dog();
		
		d.eat(); // from animal
		d.walk(); //from mammal
		d.bark();  //from dog
	}

}

class Animal {
 void eat() {
     System.out.println("Animal eats food");
 }
}

class Mammal extends Animal {
 void walk() {
     System.out.println("Mammal walks");
 }
}

class Dog extends Mammal {
 void bark() {
     System.out.println("Dog barks");
 }
}

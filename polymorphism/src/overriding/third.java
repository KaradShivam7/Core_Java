package overriding;

public class third {

	public static void main(String[] args) {
		
		// Parent reference, Parent object
	     Animal a1 = new Animal();
	     a1.getAnimal();  // returns Animal

	     // Parent reference, Child object
	     Animal a2 = new Dog();
	     a2.getAnimal();  // returns Dog (covariant return type)

	     // Child reference, Child object
	     Dog d1 = new Dog();
	     d1.getAnimal();  // returns Dog
	}

}
//Parent class
class Animal {
 Animal getAnimal() {
     System.out.println("Animal: Returning an Animal object");
     return null;
 }
}

//Child class
class Dog extends Animal {
 // Overriding with covariant return type (Dog is a subclass of Animal)
 @Override
 Dog getAnimal() {
     System.out.println("Dog: Returning a Dog object");
     return null;
 }
}


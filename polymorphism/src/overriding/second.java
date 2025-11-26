package overriding;

public class second {

	public static void main(String[] args) {
		 Parent obj = new Child();     //polymorphic object
	        obj.show();     // Calls Child's show()
	        obj.display();  // Calls Child's display()
	        obj.message();  // Calls Child's message()

	}

}
//Parent class
class Parent {
 // Public method
 public void show() {
     System.out.println("Parent: public show()");
 }

 // Protected method
 protected void display() {
     System.out.println("Parent: protected display()");
 }

 // Default (package-private) method
 void message() {
     System.out.println("Parent: default message()");
 }
}

//Child class
class Child extends Parent {
 // Overriding public method → must remain public
 @Override
 public void show() {
     System.out.println("Child: public show()");
 }

 // Overriding protected method → can be protected or public
 @Override
 public void display() {
     System.out.println("Child: protected display()");
 }

 // Overriding default method → can be default, protected, or public
 @Override
 public void message() {
     System.out.println("Child: default message()");
 }
}


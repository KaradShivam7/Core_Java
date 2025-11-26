package interface_examples;

public class Third {

	public static void main(String[] args) {
	     Vehicle v = new Car();
	     v.start();
	     v.fuelType();

	     // Calling static method of interface
	     Vehicle.serviceInfo();
	}

}
//Interface with default and static methods
interface Vehicle {
 void start(); // abstract method

 default void fuelType() {
     System.out.println("Default fuel type: Petrol");
 }                                                       //default method

 static void serviceInfo() {                             //static method
     System.out.println("Vehicles need servicing every 6 months.");
 }
}

//Implementing class
class Car implements Vehicle {
 public void start() {
     System.out.println("Car starts with a key");
 }

 @Override
 public void fuelType() {
     System.out.println("Car fuel type: Diesel");
 }
}

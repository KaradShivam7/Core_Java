package custom_exception;

public class third {

	public static void main(String[] args) {
		 Student s = new Student();
	     try {
	         s.register(10); // invalid ID
	     } catch (InvalidStudentIdException e) {
	         System.out.println("Handled: " + e.getMessage());
	     }
	}

}
//Custom checked exception
class InvalidStudentIdException extends Exception {
 InvalidStudentIdException(String message) {
     super(message);
 }
}

class Student {
 public void register(int id) throws InvalidStudentIdException {
     if (id <= 0) {
         throw new InvalidStudentIdException("Student ID must be positive!");
     }
     System.out.println("Student registered with ID: " + id);
 }
}

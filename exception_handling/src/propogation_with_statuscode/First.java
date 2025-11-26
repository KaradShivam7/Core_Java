package propogation_with_statuscode;

public class First {

	public static void main(String[] args) {
		   StudentService s = new StudentService();
		     try {
		         s.validateId(-10); // invalid ID
		     } catch (StudentException e) {
		         System.out.println("Handled in main: " + e.getMessage() +
		                            " | Status Code: " + e.getStatusCode());
		     }
	}

}
//Custom checked exception with status code
class StudentException extends Exception {
 private int statusCode;

 StudentException(String message, int statusCode) {
     super(message);
     this.statusCode = statusCode;
 }

 public int getStatusCode() {
     return statusCode;
 }
}

class StudentService {
 public void validateId(int id) throws StudentException {
     if (id <= 0) {
         throw new StudentException("Invalid Student ID!", 400); // 400 = Bad Request
     }
 }
}



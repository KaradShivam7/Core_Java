package custom_exception;

public class second {

	public static void main(String[] args) {
		  Quiz quiz = new Quiz();
		     try {
		         quiz.addQuestion(""); // throws custom unchecked exception
		     } catch (InvalidQuestionException e) {
		         System.out.println("Handled: " + e.getMessage());
		     }
	}

}
//Custom unchecked exception
class InvalidQuestionException extends RuntimeException {
 InvalidQuestionException(String message) {
     super(message);
 }
}

class Quiz {
 public void addQuestion(String question) {
     if (question == null || question.isEmpty()) {
         throw new InvalidQuestionException("Question cannot be empty!");
     }
     System.out.println("Question added: " + question);
 }
}


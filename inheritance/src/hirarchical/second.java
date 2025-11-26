package hirarchical;

public class second {

	public static void main(String[] args) {
		department d=new department("pktc","cse");
		d.print();
		
		student s=new student("pktc","shivam");
		s.display();
	}
	
}
class college{
	  String College_name;
			
	  public college(String College_name) {
	  this.College_name=College_name;
			}
			
	  public void show() {
	  System.out.println("college_name = "+College_name);
			}
		}

class department extends college{
	  String department_name;
			
	  public department(String College_name , String department_name) {
	  super(College_name);
	  this.department_name=department_name;
			}
			
	   public void print() {
	   super.show();
	   System.out.println("department_name = "+department_name);
			}
		}

class student extends college{
	 String Student_name;
		    
     public student(String College_name, String Student_name) {
	 super(College_name);
	 this.Student_name=Student_name;
			}
			
	 public void display() {
	 super.show();
	 System.out.println("Student_name = "+ Student_name);
			}	
	}

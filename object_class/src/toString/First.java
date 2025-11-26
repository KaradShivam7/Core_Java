package toString;

public class First {

	public static void main(String[] args) {
		Employee emp=new Employee("shiv",1);
		System.out.println(emp);
	}

}
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + "]";
    }
}

package Setter_Getter;

public class Getter_en {
	public static void main(String[] args) {
		demo d=new demo();
		
		d.setName("karad");
		d.setId(10);
		
		System.out.println(d.getName());
		System.out.println(d.getId());
	}
}

class demo{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
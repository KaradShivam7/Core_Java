package uss.in;

public class overriding {

	public static void main(String[] args) {
		honda h=new honda();
		h.company_name="honda";
		h.model_number="1234567uijhgf";
		h.bike_name="shine";
		h.price="123456";
		
		h.show();

	}

}
class bike{
	String company_name;
	String model_number;
	
	public void show() {
		System.out.println("company name= "+company_name);
		System.out.println("model number= "+model_number);
	}
}
class honda extends bike{
	String bike_name;
	String price;
	
	public void show() {
		super.show();
		System.out.println("bike name= "+bike_name);
		System.out.println("price= "+price);
	}
	
}
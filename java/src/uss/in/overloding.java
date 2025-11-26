package uss.in;
class over{
	public void sum(int a ,int b) {
		int result=a+b;
		System.out.println("sum of two integer= " +result);
	}
	
	public void sum(int a,int b,int c) {
		int result=a+b+c;
		System.out.println("sum of three integer= "+result);
	}
	
	public void sub(int a,int b) {
		int result=a-b;
		System.out.println("substraction of two variable= "+result);
	}
	
	public void sub(int a, float b) {
		float result=a-b;
     	System.out.println("substraction pf two variable= "+result);
	}
	
	public void mul(int a,float b) {
		float result=a*b;
		System.out.println("multiplication of two variable= "+result);
	} 
	
	public void mul(float b,int a ) {
		float result=b*a;
		System.out.println("multiplication of two variable= "+result);
		
	}
}
public class overloding {

	public static void main(String[] args) {
		over o=new over();
		
		o.sum(10, 20);
        o.sum(10,20,30);
        
        o.sub(10, 4.5f);
        o.sub(10, 4);
        
        o.mul(10,2.3f);
        o.mul(2.3f, 05);
	}

}

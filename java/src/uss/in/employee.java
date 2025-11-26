package uss.in;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter name:");
	   String name=sc.nextLine();
	   System.out.println("enter eid:");
	   int eid=sc.nextInt();
	   System.out.println("enter salary:");
	   float salary=sc.nextFloat();
	   
	   System.out.println("name: "+ name);
	   System.out.println("eid: "+ eid);
	   System.out.println("salary: "+ salary);
	   
	   sc.close();
	}

}

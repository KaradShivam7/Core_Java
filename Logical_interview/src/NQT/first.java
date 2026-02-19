package NQT;

import java.util.Scanner;

public class first {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no_of_days=sc.nextInt();
		
		int[] arr=new int[no_of_days];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int total_points=0;
		for(int i=0;i<arr.length;i+=2) {
			total_points+=arr[i];
		}
		
		System.out.println(total_points);
	}

}

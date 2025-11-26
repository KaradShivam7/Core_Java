package uss.in;

import java.util.Arrays;
import java.util.Scanner;

public class arrayusingscanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter elements of array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("array elements are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();

	}

}

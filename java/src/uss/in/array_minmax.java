package uss.in;

import java.util.Scanner;

public class array_minmax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter array elements");
		
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	int min=arr[0];
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
		if(max<arr[i]) {
			max=arr[i];
		}
		
		
	}
	System.out.println("minimum value of array= "+min);
	System.out.println("maximum value of array= "+max);
	}

}

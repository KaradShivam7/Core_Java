package uss.in;

import java.util.Arrays;
import java.util.Scanner;

public class array_multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int mul=1;
		for(int i=0;i<arr.length;i++) {
			mul=mul*arr[i];
		}
		
		sc.close();
		System.out.println("array elements are="+Arrays.toString(arr));
		System.out.println("multiplication of all array elements="+mul);
	}
	

}

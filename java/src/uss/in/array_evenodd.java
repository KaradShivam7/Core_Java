package uss.in;

import java.util.Scanner;

public class array_evenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter elements of an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		
		System.out.print("even numbers of array= ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println();
		System.out.print("odd numbers of array= ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}

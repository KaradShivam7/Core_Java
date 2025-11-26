package uss.in;

import java.util.Arrays;
import java.util.Scanner;

public class array_acsending {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	System.out.println("enter elements of array");
	for(int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
        }
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//System.out.println(arr[i]);
	}
	
     System.out.println(Arrays.toString(arr));
	}
}

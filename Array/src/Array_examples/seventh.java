
//////array average

package Array_examples;

import java.util.Scanner;

public class seventh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			 sum=arr[i]+sum;
		}
        System.out.println("sum of array elements= "+sum);
        float avg=sum/arr.length;
        System.out.println("average of array elements= "+avg);
	}

}


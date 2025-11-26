package uss.in;

import java.util.Arrays;
import java.util.Scanner;

public class mdusingscanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		
		System.out.println("enter no of columns");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		System.out.println("enter elements of array");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print(Arrays.deepToString(arr));
	    sc.close();
	}

}

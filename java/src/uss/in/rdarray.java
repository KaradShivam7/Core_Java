package uss.in;

import java.util.Arrays;

public class rdarray {

	public static void main(String[] args) {
	  int arr[][]=new int[3][];
	  
	  arr[0]= new int[]{2,3,4};
	  arr[1]= new int[]{2,3};
	  arr[2]= new int[]{2,3,4,3};
	  
	  System.out.println("elements of ragged array ");
	  
//	  for(int row=0;row<arr.length;row++) {
//		  for(int col=0;col<arr[row].length;col++) {
//			  System.out.print(arr[row][col]+" ");
//		  }
//		  System.out.println();
//	  }
//	  
	  System.out.println(Arrays.deepToString(arr));
	}

}

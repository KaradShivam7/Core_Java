package mock_questions;

import java.util.Arrays;

public class move_zeroto_first {

	public static void main(String[] args) {
		int arr[]= {1,0,4,0,5,0,2,0,0};
		int arr1[]=new int[arr.length];
		
		int counter=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr1[counter]=arr[i];
				counter--;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}

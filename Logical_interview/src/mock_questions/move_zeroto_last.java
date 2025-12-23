package mock_questions;

import java.util.Arrays;

public class move_zeroto_last {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,3,0,4,0,0,8,0,9};
		int arr1[]= new int[arr.length];
		
			int counter=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]!=0) {
					arr1[counter]=arr[j];
					counter++;
				}
			}
		
		System.out.println(Arrays.toString(arr1));
	}

}

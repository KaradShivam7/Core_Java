
//Repeated values of array

package Array_examples;

public class Eighth {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,10,30,10,40,10};
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				count++;
			}
		}
		System.out.println("count of 10 in array= "+count);
	}

}
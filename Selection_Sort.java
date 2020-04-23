package test;

import java.util.Arrays;

// selection sort java
//Chetan Kalia

public class test_1 {
	
	public static String selection_sort(int[] arr) {
		
		for(int i = 1; i < arr.length; i ++) {
			
			int k = i;
			
			while(  (k >  0) && ( arr[k] < arr[k - 1] ) ) {
				int temp = arr[k];
				arr[k] = arr[k - 1];
				arr[k - 1] = temp;
				k --;
				
			}
			
		}
		
		return Arrays.toString(arr);
	}
	
	
	public static void main(String[] args) {
	int[] arr = {7,3,1,6,4,7,4,7,8};
	System.out.println(selection_sort(arr));
	}
}

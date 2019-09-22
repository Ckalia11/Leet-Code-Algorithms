package Javac;

	
	public class Binary_Search {
		
		static boolean does_contain = false;
		
		public static boolean binary_search(int[] arr, int target, int start, int end) {
		
			
			int middle = (start + end) / 2;
			System.out.println("The middle is : " + middle);
			System.out.println("The value at the middle is : " + arr[middle]);
			System.out.println("----------");
			
			if( target == arr[middle] ) {
				does_contain = true;
			}
			
			else if(target > arr[middle]) {
				start = middle + 1;
				System.out.println("The start is : " + start);
				System.out.println("----------");
				binary_search(arr, target, start, end);
				
			}
			
			else if( target < arr[middle]) {
				end = middle - 1;
				System.out.println("The end is : " + end);
				System.out.println("----------");
				binary_search(arr, target, start, end);
				
			}
			
			
			return does_contain;
		}
		
		public static void main(String[] args) {
			int[] arr = {3,4,5,6,7,8,9,10,11,12};
			int target = 10;
			System.out.println(binary_search( arr, target, 0, arr.length));
		}

	}




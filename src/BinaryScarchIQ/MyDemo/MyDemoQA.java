package BinaryScarchIQ.MyDemo;

public class MyDemoQA {
    public static void main(String[] ar) {
        int[] arr = {9,12,14,17,18,19,21};
        int traget =20;
        int n = ceiling(arr,traget);
//        int n = BinarySearch(arr,traget);
        //int n = BinarySearch1(arr,traget);
        
        System.out.println(arr[n]);

//        int n = ceiling(arr,traget);

    }
    
    static int BinarySearch1(int[] arr, int traget) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(traget < arr[mid]) {
				end = mid-1;
//				System.out.println(mid);

			}else if(traget > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
//			System.out.println(mid);

		}
		return -1;
	}
    
    

    static int BinarySearch(int[] arr, int traget) {
		int start = 0;
		int end = arr.length-1;
		
		boolean isAnse = (arr[start]<arr[end]);
//		if(arr[start]<arr[end]) {
//			isAnse = true;
//		}else {
//			isAnse = false;
//		}
		
		
		
		while(start <= end) {
			int mid = start + (end - start)/2;


			if(arr[mid] == traget) {
				return mid;
			}
			
			
			if(isAnse) {
				if(traget < arr[mid]) {
					end = mid-1;
				}else{
					start = mid+1;
				}
			}else {
				if(traget > arr[mid]) {
					end = mid-1;
				}else{
					start = mid+1;
				}			
		   }
//			System.out.println(mid);

		}
		return -1;
	}

    
    
    
	static int ceiling(int[] arr, int traget) {
		int start = 0;
		int end = arr.length-1;
		boolean isAns = arr[start]<arr[end];
		int mid = 0;
		while(start<=end) {
//			System.out.println(arr[start]+"   start");
//			System.out.println(arr[mid]+"   mid");

//			System.out.println(arr[end]+"   end");
			 mid = start+(end-start)/2;
				if(traget == arr[mid]) {
					return mid;
				}
			if(isAns) {
				if(traget<arr[mid]) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}else {
				if(traget>arr[mid]) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}
//			System.out.println(arr[start]+"   start1");
//
//			System.out.println(arr[end]+"   end1");

		}
		return -1;

	}
}

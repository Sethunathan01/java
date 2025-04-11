
public class OrderAgnosticBS {

	public static void main(String[] args) {
//        int[] arr = {-5,-4,-1,0,1,2,3,4,5,6,7,8,9,10};
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0,-1-2,-3,-4,-5};
        int traget = 10;
	    int n = BinarySearch(arr,traget);
	    System.out.println(n);
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

}

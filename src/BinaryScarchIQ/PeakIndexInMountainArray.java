package BinaryScarchIQ;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,3,2,1};
 		System.out.println(binarySearch(arr));
	}

	static int binarySearch(int[] arr) {
		int start = 0; 
		int end = arr.length-1;
		while(start<end) {
			int mid = start +(end - start)/2;
            // your in dic part of array
			// this may be the ans, but look at left
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else{
				//you are in asc part of array
 				start = mid+1;//because we know mid +1 element > mid element 
			}
		}
		//in the end,sart == end and pointing to the largrst number because of the 2 checks above  
		//start and end are always trying tofind  max element in the above 2checks
		//hence,when they are pointing to just one element that is the max one because what is that the chexks say
		//more Elaboration: at every point of time for start and end , they have the best possible answer til that time;
		//and if we are saying that only one item is remainaing, hence cuz of abow line tha is the possibile ans
		return arr[start];
	}

}

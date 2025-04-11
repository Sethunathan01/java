package BinaryScarchIQ;

public class SplitAray {

	public static void main(String[] args) {
		int[] nums = {7,2,5,8,10};
		int min = 2;
		System.out.println("  d"+splitArray(nums,min));

	}

	static int splitArray(int[] nums, int min) {
//		SplitAray aSplitAray = new SplitAray();

		int start = 0;
		int end = 0;
		for(int i = 0;i<nums.length;i++) {
			start = Math.max(start, nums[i]);//in the end of the loop this will contain the max item for the array 
			end += nums[i];
		}
		while(start<end) {
			//try for the middle potential answer 
			int mid = start + (end-start)/2;//287
			//colculate how meny pieces you can divied this in with this max sum
			int sum = 0;
			int pieces = 1;
			for(int num : nums) {
				if(sum + num > mid) {
					//you cannot add this in this subarray, new one 
					// say one add this num in new sub array, then num = num
					sum = num;
					pieces ++;
					System.out.print("  "+pieces);
				}else {
					sum += num;
				}
			}
			if(pieces > min) {
				start = mid + 1;
			}else {
				end = mid;
			}
		}
    return start;// here start == end
    }
}





//package BinaryScarchIQ;
//
//public class SplitAray {
//
//    public static void main(String[] args) {
//        int[] nums = {7, 2, 5, 8, 10};
//        int min = 2;
//        System.out.println(splitArray(nums, min)); // Expected Output: 18
//    }
//
//    static int splitArray(int[] nums, int min) {
//        int start = 0;
//        int end = 0;
//
//        // Calculate initial start and end values
//        for (int num : nums) {
//            start = Math.max(start, num); // Max item in the array
//            end += num;                  // Total sum of the array
//        }
//
//        // Binary search for the minimum largest sum
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//            // Count the number of subarrays needed for this mid value
//            int sum = 0;
//            int pieces = 1; // Start with one subarray
//
//            for (int num : nums) {
//                if (sum + num > mid) {
//                    // Start a new subarray
//                    sum = num;
//                    pieces++;
//                } else {
//                    sum += num;
//                }
//            }
//
//            if (pieces > min) {
//                // Too many subarrays, increase allowed sum
//                start = mid + 1;
//            } else {
//                // Fewer or equal subarrays, try for a smaller sum
//                end = mid;
//            }
//        }
//
//        return start; // Here, start == end
//    }
//}


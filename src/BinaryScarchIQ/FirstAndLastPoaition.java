package BinaryScarchIQ;

import java.util.Arrays;

class FirstAndLastPoaition {

	public static void main(String[] args) {
		int[] nums = {1,2,2,2,2,3,4,4}; 
		int target = 2;
		int[] anss = serchRange(nums,target);
		System.out.println(Arrays.toString(anss));
	}
	
    public static int[] serchRange(int[] nums, int target) {
    	
    	int[] ans = {-1,-1}; 
    	
//    	int start = search(nums,target,true);
    	ans[0] = search(nums,target,true);
    	System.out.println("Sethu");
//    	int end = search(nums,target,false);
    	ans[1] = search(nums,target,false);
//    	ans[0]= start;
//    	ans[1]=end;
    	return ans;
    	
    }
    //this functinon just returns the index of value of target
    static int search(int[] nums,int target,boolean findStartIndex) {
    	int ans = -1;
    	int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println(mid+"First");

			if(target < nums[mid]) {
				end = mid-1;
				System.out.println(end+"    end");

			}else if(target > nums[mid]) {
				start = mid+1;
			}else {
				// potential ans found 
				ans = mid;
				System.out.println(mid);

				if(findStartIndex) {
					end = mid-1;
				}else {
					start = mid+1;
					System.out.println(end+"    end");

				}
			}
		}
		return ans;  
    }
}

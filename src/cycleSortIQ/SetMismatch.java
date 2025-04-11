package cycleSortIQ;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		int[] nums = {1,2};
		int[] n =setMismatch(nums);
		System.out.println(Arrays.toString(n));
				
				
	}

	private static int[] setMismatch(int[] nums) {
		int start = 0;
		while(start<nums.length) {
			int cIndex = nums[start]-1;
			if(nums[start] != cIndex && nums[start] != nums[cIndex]) {
				swap(nums,start,cIndex);
			}else {
				start++;
			}
		}
//		List<Integer> duplicate = new ArrayList<>();
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] != i+1) {
				
//				duplicate.add(nums[i]);
//				duplicate.add(i+1);
				return new int[] {nums[i],i+1};
			}
		}
		return new int[] {-1,-1};
	}
	static void swap(int[] nums,int start,int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
}

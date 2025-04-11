package cycleSortIQ;

import java.util.Arrays;

public class MissingNubers{

	public static void main(String[] args) {
		int[] nums = {4,3,3,8,2,7,0,1,2};
		int n = missingNuber(nums);
		System.out.println(n);
	}

	private static int missingNuber(int[] nums) {
		int start = 0;
  		while(start<nums.length) {
  			System.out.println(Arrays.toString(nums));

			if(nums[start] < nums.length && nums[start] != start) {
				swap(nums,start,nums[start]);
			}else {
				start++;
			}
		}
  		for(int index = 0; index <nums.length;index++) {
  			if(nums[index] !=index) {
  				 System.out.print(index+", ");
  			}
  		}
  		return nums.length;
	} 

	private static void swap(int[] nums, int start, int end) {
		int temp = nums[start];//4
		nums[start] = nums[end];//4
		nums[end] = temp;//4
	}

}

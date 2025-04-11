package cycleSortIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MissingNumber {
	public static void main(String[] args) {
		int nums[] = {5,9,4,3,3,1};
		List<Integer> n= findDisappearedNumbers(nums);
		System.out.println(n);
	}
	 
	 static  List<Integer>findDisappearedNumbers(int[] nums) {
		int start = 0;
		while(start < nums.length) {
			int cIndex = nums[start] - 1;

//			System.out.println(Arrays.toString(nums));
			if(nums[start] <= nums.length && 0 <= nums[start] && nums[cIndex] != nums[start]) {
				swap(nums,start,cIndex);	
			}else {
				start++;
			}
		}	
		List<Integer> ans = new ArrayList<>();
		for(int index = 0;index < nums.length;index++) {
			if(nums[index] != index+1) {
				ans.add(index+1);
			}
		}
		return ans;
	}
	   
	private static void swap(int[] arr, int cIndex, int swapIndex) {
		int temp = arr[cIndex];
		arr[cIndex] = arr[swapIndex];
		arr[swapIndex] = temp;
	}

}

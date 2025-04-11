package linear_search;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] ar) {
    	int[] nums = {2,7,11,15};
        int a = nums[0];
        
    	int[] f = v(nums,a);
    	System.out.println(Arrays.toString(f));
    }

	static int[] v(int[] nums, int a) {
		int[] a1 = null;
		for(int i = 1;i<nums.length;i++){
    		if(a == i) {
    	       a1 = new int[] {a,i};
    		}
    	}
		return a1;
	}
}   
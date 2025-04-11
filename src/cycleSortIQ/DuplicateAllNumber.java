package cycleSortIQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateAllNumber{

	public static void main(String[] args) {
		int[] nums = {2,1,1,0,0};
		List<Integer> n =missingAllNuber(nums);
		System.out.println(n);
	}
 
	
	static List<Integer> missingAllNuber(int[] nums) {
		int start = 0;
		while(start<nums.length) {
//  			System.out.println(Arrays.toString(nums));

  			int cIndex = nums[start];
  		
			if(nums[start] !=start&&nums[start] !=nums[cIndex]) {
				swap(nums,start,cIndex);
			}else {
				start++;
			}
		}
		List<Integer> ans = new ArrayList<>();
		for(int i =0;i< nums.length;i++) {
			if(nums[i] != i) {
				ans.add(nums[i]);
			}
		}
		return missingNuberSort(ans);
	} 
	
	
	static void swap(int[] nums, int start, int end) {
	int temp = nums[start];
	nums[start] = nums[end];
	nums[end] = temp;
    }
	
	
	static List<Integer> missingNuberSort(List<Integer> n) {
		  if(n.size() == 0) {
		    	return null;
		    }
	    for(int  i = 0;i<n.size();i++) {
	    	for(int j =1;j<n.size();j++) {
	    		if(n.get(j) < n.get(j-1)) {
//					swap(n,start,n.get(start+1));
					Collections.swap(n, j, j-1);
//		  			System.out.println(n);
				}
	    	}
	    }	
	    if(n.size()>0) {
	    	return n;
	    }
	    return null;	
	}
}

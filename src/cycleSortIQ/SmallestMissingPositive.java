package cycleSortIQ;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class SmallestMissingPositive{

	public static void main(String[] args) {
		int[] nums = {-1,5,5,5,9,9,-2,-4,6,6,5};
		
//		
//		List<Integer> missingNumber1 = new ArrayList<>();
//		missingNumber1.add(3);
//		missingNumber1.add(5);
//		missingNumber1.add(7);
//		missingNumber1.add(8);
//		missingNumber1.add(9);
//		missingNumber1.add(2);
//		missingNumber1.add(1);
//		missingNumber1.add(-1);
//	    List<Integer> n= missingNumber1;
//	   
//	    
//		System.out.println(n);
//		System.out.println(Arrays.toString(small((n))));
	
		int[] n = smallestMissingPositive(nums); 
		System.out.println(Arrays.toString(n));
	}
	static int[] smallestMissingPositive(int[] nums) {
		int start =0;
		while(start < nums.length) {
			System.out.println(Arrays.toString(nums));
			int cIndex = nums[start]-1;
			if(nums[start] > 0 && nums[start] != cIndex && nums[start] != nums[cIndex] ) {
				swap(nums,start,cIndex);
			}else {
				start++;
			}
		}
		List<Integer> missingNumber = new ArrayList<>();
		for(int i =0;i<nums.length;i++) {
			if(nums[i] != i+1) {
				System.out.println(i+1);
				missingNumber.add(i+1);
				
			}
		}
		System.out.println(missingNumber);
		if(0<missingNumber.size()) {
			return small(missingNumber);
		}
		return null;
	}
	
	
	static int[] small(List<Integer> missingNumbers) {
		int small = missingNumbers.get(0); 
		for(int i =1;i<missingNumbers.size();i++) {
			if(missingNumbers.get(i) < small) {
				small = missingNumbers.get(i);
			}
		}
		return new int[] {small};
		
	}
	
	static void swap(int[] nums,int start,int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}

}

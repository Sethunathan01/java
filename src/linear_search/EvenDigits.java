package linear_search;

public class EvenDigits {

	public static void main(String[] args) {
		int[] number = {23,76576,554,2343,25,52,45,4,54,5,54,2,4,54,5,2,-32};
		System.out.println(even(number));
//		System.out.println(even(64));
//		System.out.println(digits());
//		System.out.println(-1*-1);
	}

	 static int even(int[] number) {
		 int count = 0;
		 for(int nums : number) {
			 if(even(nums)) {	
				 count++;
			 }
		 }
		 return count;
	}

    static boolean even(int nums) {
        int numberOfDegets = digits(nums);
//        if(numberOfDegets % 2 == 0) {
//        	return true;
//        }
    	return numberOfDegets % 2 == 0;
	}
    
    
    static int digits2(int nums) {
    //    	if(nums <0) {
//    		nums = nums * -1;
////    	System.out.println(nums = nums * -2);
//    	}
    	return (int)(Math.log10(nums)+1 );
    }
    
    
    static int digits(int nums) {	
    	if(nums <0) {
		nums = nums * -1;
//	System.out.println(nums = nums * -2);
	}
    int count = 0;
    while(nums > 0) {
    	count++;
    	nums = nums/10;
    }
	return count;
    }
}

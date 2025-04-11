package linear_search;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,0};
        int target = 7;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
//        int a = linearSearch(arr, target);
//        System.out.println(a);
        
//        boolean a = linearSearch1(arr, target);
//        System.out.println(a);
        
        int a = linearSearch2(arr, target);
        System.out.println(a);
	}

    static int linearSearch(int[] arr, int target) {
    	if(arr.length == 0){
    		return -1;
    	}
    	for(int index = 0;index < arr.length;index++) {
    		int element = arr[index];
    		if(target == element) {
//    			System.out.println(index);
    			return index;
    		}
    	}
    	return -1;
	}
    
    static boolean linearSearch1(int[] arr, int target) {
    	if(arr.length == 0){
    		return false;
    	}
    	for(int index = 0;index < arr.length;index++) {
    		int element = arr[index];
    		if(target == element) {
//    			System.out.println(index);
    			return true;
    		}
    	}
    	return false;
	}
    static int linearSearch2(int[] arr, int target) {
    	if(arr.length == 0){
    		return -1;
    	}
    	for(int index = 0;index < arr.length;index++) {
    		int element = arr[index];
    		if(target == element) {
//    			System.out.println(index);
    			return element;
    		}
    	}
    	return -1;
	}
}

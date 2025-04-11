package linear_search;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
 		String name = "SethuNathan";
 		char target = 'n' ;
 		System.out.println();
 		System.out.println(name.toCharArray());
 		System.out.println(Arrays.toString(name.toCharArray()));
 		
 		boolean ans= linearSearchString(name , target);
 		System.out.println(ans);
 		
// 		int ans= linearSearchString1(name , target);
// 		System.out.println(ans);
	}
	static boolean linearSearchString(String name, char target) {
		if(name.length() == 0) {
			return false;
		}
		for(int i = 0;i<name.length();i++) {
//		   char a = name.charAt(i);	
			if(name.charAt(i) == target) {
				return true;
			}
		}
//		 for(int i : name.toCharArray()) {
//	 			if(i == target) {
//	 				return true;
//	 			}
//	 		}
		 return false;
	}
	
	static int linearSearchString1(String name, char target) {
		
		if(name.length() == 0) {
			return -1;
		}
		 for(int i = 0;i<name.length();i++) {
	 			if(name.charAt(i) == target) {
	 				return i+1;
	 			}
	 		}
		 return -1;
	}


}

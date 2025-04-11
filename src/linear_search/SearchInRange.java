package linear_search;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = {2,39,64,0,1,73,84,93};
		int target = 0;
		
		boolean n =linearSearch(arr,target,1, 5);
		System.out.println(n);
	}
	 static boolean linearSearch(int[] arr, int target, int start, int end) {	
		 if(arr.length==0) {
			 System.out.println("sethu");
			 return false;
		 }
		 for(int i = start;i<end;i++) {
			 if(arr[i] == target) {
				 return true;
			 }
		 }
		 return false;
	}
}

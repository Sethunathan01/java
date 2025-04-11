package linear_search;

public class FindMin {

	public static void main(String[] args) {
		int[] ar = {6,9,4,-2,-5,8,44,2};
		System.out.println(min(ar));
//		min(ar);
	}
 
	static int min(int[] ar) {
		int min = ar[0];
		for(int i = 1;i<ar.length;i++) {
			if(min>ar[i])   {
			min = ar[i];
			}
		}
		return min;
	}

}

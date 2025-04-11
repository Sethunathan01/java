package linear_search;

public class MaxWealth {

	private static final int Max = 0;

	public static void main(String[] args) {
		int[][] arr = {
				{1,3},
				{3,2,1}
		};
		int n = maximumeWealth(arr);
		System.out.println(n);
		}

	static int maximumeWealth(int[][] arr) {
		int ans = Integer.MIN_VALUE;
		for(int row = 0;row < arr.length;row++) {
			int roesam = 0;
			for(int col = 0;col < arr[row].length;col++) {
				roesam += arr[row][col];
				}
			 if(roesam > ans) {
				 ans =roesam;
		     }
		}	
		 return ans;
	}
}



import java.util.ArrayList;
import java.util.Arrays;

public class LinerSerch2Darr {

	public static void main(String[] args) {
		
		
//		Integer i = 0;
//		i =9;
//		System.out.println(i);
//		
//		int[][] arr = {
//				{2,6,3,1,9,6,0,2,5},
//				{7,4,9,7},
//				{4,9,5,8,9,6},
//				{7,3,1,2,5,7,4,8}
//		};
//		int target = 50;
//		ArrayList<ArrayList<Integer>> n =  serch(arr,target);
//		
//		ArrayList<Integer> n1 = print(n);
//		
//		
//		System.out.println(n1);
		for(char i = 'a'; i <= 'z' ;i++) {
			System.out.println(i);
		}
	}
	
	

	private static ArrayList<Integer> print(ArrayList<ArrayList<Integer>> n) {
//		if(n.size() == 0) {
//			return null;
//		}
	
		for (int i = 0; i < n.size(); i++) {
			
			return n.get(i);
		}
		
		
		return null;
	}



	static ArrayList<ArrayList<Integer>> serch(int[][] arr, int target) {
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
//		ArrayList n = new ArrayList();
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++){
				if(target == arr[i][j]) {
//					n.add(new int[] {i,j});
					ArrayList position = new ArrayList<>();
                    position.add(i);
                    position.add(j);
                    n.add(position);
				}
			}
		}
		return n;
		
	}	
	
}
//commit cce84be353a797f1713d4795c62280c58eba3654 
//https://github.com/Sethunathan01/sethu-project.git


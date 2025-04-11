package BinaryScarchIQ;

public class FloorOFLeter {

	public static void main(String[] args) {

		char[] arr = {'c','f','j','l','m','p'};
		char traget = 'c';		
		System.out.println(floorOfnu(arr ,traget));
	}
	static char floorOfnu(char[] arr, char traget) {
		int start = 0 , end = arr.length-1;
//		boolean inAns = arr[start]<arr[end];
//		boolean inAns = 'a'<'b';
//		System.out.println(inAns);
		while(start<end) {
			int mid = start+(end-start)/2;
			if(traget < arr[mid]) end = mid-1;
			else start = mid+1;
		}
		System.out.println(start);
		System.out.println(arr[start]);
		System.out.println(arr.length);

		System.out.println(start % arr.length);
		System.out.println(arr[start % arr.length]);
		return arr[start % arr.length];
	}
}
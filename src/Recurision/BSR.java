package Recurision;

public class BSR {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int target = 89;
		 int index = search(arr,target,0,arr.length-1);
		 System.out.println(index);
	}

	static int search(int[] arr, int target, int s, int e) {
		if(s>e) return -1;
		int mid = s +(e-s)/2;
		if(arr[mid]== target) {
			return mid;
		}
		if(target <arr[mid]) {
			return search(arr,target,s,mid-1);
		}
		return search(arr,target,mid+ 1,e);
	}

}
//static Integer fiboformula(Integer n) {
//	return (Integer) (Math.pow(((1+ Math.sqrt(5)/2) ),n));
//}
package solveEnyPatternQuestion;


public class Fibonnacci {

	public static void main(String[] args) {
		fibonacci(300);
	}
	
	private static void fibonacci(int n) {
		int n1 = 0,n2 = 1;
		for(int i =0;i<n;i++) {
			System.out.print(n1+" ");
			System.out.println(prime(n1));
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
	
	private static String prime(int n1) {
		int count = count(n1);
		if(count == 2) {
			return " -> This is prim";
		}
		return " ";
	}

	private static int count(int n1) {
		int count =0;
		for(int i =1;i<=n1;i++) {
			if(n1%i == 0) {
				count++;
			}
		}	
		return count;
	}
}

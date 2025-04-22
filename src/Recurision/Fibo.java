package Recurision;

public class Fibo {
	static int count =0;

	public static void main(String[] args) {
		
		
		float anss  = fiboformula_(5);
		System.out.println(anss);
		
	}
	static float fiboformula_(float n) {
		return (float) (((Math.pow((1 + Math.sqrt(5))/2,n))-(Math.pow((1 - Math.sqrt(5))/2, n))) / Math.sqrt(5));

	}

	static int fiboformula(int n) {
		return (int) (Math.pow((1 + Math.sqrt(5)) / 2,n) / Math.sqrt(5));
    }	
	
	
	static int fiboformulac(int n) {
//	    double phi = (1 + Math.sqrt(5)) / 2;
	    return (int) Math.round(Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5));
	}

	
	static int fibo(int n) {
		
		System.out.println(++count);
		if(n < 2) {
		
			return n;
		}
		
//		this is not  tail recursion
		return fibo(n-1) + fibo(n-2);
	}


}

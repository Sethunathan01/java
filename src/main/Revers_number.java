package main;

public class Revers_number {

	public static void main(String[] args) {
        long n = 9288726588458836L;
        while(n>0) {
        	int rem =(int) (n%10);
        	long e = rem;
        	n = n/10;
        	System.out.print(e);
        }
        System.out.println(n);
	}

}

package main;

public class Revers_number2_0 {
	  public static void main(String[] ar) {
		  long n = 983626986873l;
	      long ans = 0;
		     while(n>0) {
		    	 
		     	int rem =(int) (n%10);
		     	ans = ans * 10 + rem;
//			     System.out.println(ans);
               n = n/10;
		     }
		     System.out.println(ans);
		     
		     
		     while(n>0) {
		    	 
			     	int rem =(int) (n%10);
			     	ans = ans * 10 + rem;
//				     System.out.println(ans);
	               n = n/10;
			     }
		     
	  }
	 
}

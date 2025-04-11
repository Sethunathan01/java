package main;

import java.util.Scanner;

public class CountSameNumber {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your rendem number :");
        String n = in.nextLine();
        System.out.print("Wher are your numpre :");
        char n1 = in.next().charAt(0);
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;
		int cont7 = 0;
		int cont8 = 0;
		int cont9 = 0;
		int cont0 = 0;
        boolean ss = false;

        for(int i = 0;i<=n.length()-1;i++) {
        	if(n.charAt(i) == '1') {
        		cont1++;
        	}if(n.charAt(i) == '2') {
        		cont2++;
        	}if(n.charAt(i) == '3') {
        		cont3++;
        	}if(n.charAt(i) == '4') {
        		cont4++;
        	}if(n.charAt(i) == '5') {
        		cont5++;
        	}if(n.charAt(i) == '6') {
        		cont6++;
        	}if(n.charAt(i) == '7') {
        		cont7++;
        	}if(n.charAt(i) == '8') {
        		cont8++;
        	}if(n.charAt(i) == '9') {
        		cont9++;
        	}if(n.charAt(i) == '0') {
        		cont0++;
        	}
//        	ss = '1' == n.charAt(i) ||'2' == n.charAt(i)||'3' == n.charAt(i) 
//        	   ||'4' == n.charAt(i) ||'5' == n.charAt(i)||'6' == n.charAt(i)
//        	   ||'7' == n.charAt(i) ||'8' == n.charAt(i)||'9' == n.charAt(i)
//        	   ||'0' == n.charAt(i);
        	switch(n.charAt(i)) {
    	    case '1':ss = true; break;
    	    case '2':ss = true; break;
    	    case '3':ss = true; break;
    	    case '4':ss = true; break;
    	    case '5':ss = true; break;
    	    case '6':ss = true; break;
    	    case '7':ss = true; break;
    	    case '8':ss = true; break;
    	    case '9':ss = true; break;
    	    case '0':ss = true; break;
        	}
        	System.out.println(n.charAt(i));
        }
          boolean s =  ss && n1 == '1'||n1 == '2'|| n1 == '3'||n1 == '4'||
        		  n1 == '5'||n1 == '6'||n1 == '7'||n1 == '8'||n1 == '9'||n1 == '0' ;
        if(s) {
        	System.out.println("sethu");
        if('1' == n1) {
            if(cont1 != 0) {System.out.println("1 is "+cont1+" times");}
        }if('2' == n1) {
            if(cont2 != 0) {System.out.println("2 is "+cont2+" times");}
        }if('3' == n1) {
            if(cont3 != 0) {System.out.println("3 is "+cont3+" times");}
        }if('4' == n1) {
            if(cont4 != 0) {System.out.println("4 is "+cont4+" times");}
        }if('5' == n1) {
            if(cont5 != 0) {System.out.println("5 is "+cont5+" times");}
        }if('6' == n1) {
            if(cont6 != 0) {System.out.println("6 is "+cont6+" times");}
        }if('7' == n1) {
            if(cont7 != 0) {System.out.println("7 is "+cont7+" times");}
        }if('8' == n1) {
            if(cont8 != 0) {System.out.println("8 is "+cont8+" times");}
        }if('9' == n1) {
            if(cont9 != 0) {System.out.println("9 is "+cont9+" times");}
        }if('0' == n1) {
            if(cont0 != 0) {System.out.println("0 is "+cont0+" times");}
        }
        }
        else {
        	System.out.println("Not avelabul");
        }
        
        
 

        

	}

}

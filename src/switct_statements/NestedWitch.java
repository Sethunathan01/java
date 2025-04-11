package switct_statements;

import java.util.Scanner;

public class NestedWitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter id");
//		int id = in.nextInt();
		
//		System.out.println("Enter dep");
//		 in.next();

//		String dep = in.nextLine();

			

//        switch(id){
//        	case 1:
//        		System.out.println("Sethu");
//        	    break;
//        	case 2:
//        		System.out.println("Resh");
//        	    break;
//        	case 3:
//        		System.out.println("Yemblay id -> 3");
////        		String dep = in.nextLine();
//
//        		switch(dep) {
//        		case "C":
//        			System.out.println("C");break;
//        		case "C++":
//        			System.out.println("C++");break;
//        		case "Java":
//        			System.out.println("Java");break;
//        		default:
//        			System.out.println("please enter valed depatment name");
//        		}break;
//        	default:
//        		System.out.println("please enter valed id number");
//        }
		System.out.println("Enter id");
        int id1 = in.nextInt(); 
		System.out.println("Enter dep");
		 in.next();
        String dept = in.nextLine();
        switch(id1) {
            case 1 -> System.out.println("Sethu");
            case 2 -> System.out.println("Resh");
            case 3 ->{
            	System.out.println("Id ->");
            	switch(dept) {
            	   case "C" ->System.out.println("C");
            	   case "C++" ->System.out.println("C++");
            	   case "Java" ->System.out.println("Java");
            	   default-> System.out.println("Please enter valed depatment");
            	}break;
            }
            default -> System.out.println("Please enter valed Id"); 
        }
	}

}

package switct_statements;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String fruit = in.nextLine();
        switch(fruit) {
        case "Apple":
        	System.out.println("a sweet read fruit");
        	break;
        case "Banana":
        	System.out.println("king of fruit");
        	break;
        case "Orange":
        	System.out.println("Round fruit");
        	break;
        case "Grapes":
        	System.out.println("Small fruit");
        	break;
        default:
        	System.out.println("pleas enter valed fruit");
        }
		
		
		
        switch(fruit) {
        case "Apple"->System.out.println("a sweet read fruit");
        case "Banana"->System.out.println("king of fruit");
        case "Orange"->System.out.println("Round fruit");
        case "Grapes"->System.out.println("Small fruit");
        default->System.out.println("please enter valed fruit");
        }
		
		
		
		int day = in.nextInt();
		switch(day) {
		case 1->{
			System.out.println("Sunday");
			System.out.println("Have a nise day");
			}
		case 2->System.out.println("Munday");
		case 3->System.out.println("Tuesday");
		case 4->System.out.println("Wednesday");
		case 5->System.out.println("Thursday");
		case 6->System.out.println("Friday");
		case 7->System.out.println("Saturday");
		}
		
		
		
		
		switch(day) {
		    case 1:
		    	System.out.println("Sunday");
				System.out.println("Have a nise day");
		    break;
		    case 2:
		    	System.out.println("Munday");
		    break;
		    case 3:
		    	System.out.println("Tuensday");
		    break;
		    case 4:
		    	System.out.println("Wednesday");
		    break;
		    case 5:
		    	System.out.println("Thusday");
		    break;
		    case 6:
		    	System.out.println("Friday");
		    break;
		    case 7:
		    	System.out.println("Saturday");
		    break;
		}
		
		   
		
		
		switch(day) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Weekday");
			break;
		case 1:
		case 7:
			System.out.println("Weekend");
			break;
		}
		
		
		
		
		switch(day) {
		case 2,3,4,5,6->System.out.println("Weekday");
		case 1,7->System.out.println("Weekend");
		}
        
		
		
		
        
        
        
        
	}

}

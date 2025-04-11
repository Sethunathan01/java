package main;

public class Main1 {

	public static void main(String[] args) {
        int salary = 25400;
        if(salary>20000) {
            salary = salary +3000  ;     
        }else if(salary > 1000) {
        	salary +=2000;
        }
        else {
            salary = salary +1000  ;     
        }
        System.out.println(salary);
	}

}

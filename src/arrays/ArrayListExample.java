package arrays;

import java.util.ArrayList;    
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		//syntax 
        ArrayList<Integer> list = new ArrayList<>(10);
        
        
        Scanner in = new Scanner(System.in);
//        list.add(24);
//        list.add(876);
//        list.add(987);
//        list.add(245);
//        System.out.println(list.contains(240));
//        System.out.println(list);
//        list.set(0, 984);
//        list.remove(2);
//        System.out.println(list);
        
        
        for(int i =0;i<7;i++) {
        	list.add(in.nextInt());
        }
        //get item at any index  
        for(int r=0;r<7;r++) {
        	list.get(r);
//        	System.out.println(list.get(r)); //pass index here, list [index] syntex well not work here
        }
        System.out.println(list);
	}

}

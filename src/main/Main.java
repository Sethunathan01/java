package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main{
	public static void main(String [] sr) {
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> o = new ArrayList<Integer>();
		
		
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(40);
		
//		System.out.println("Before Sorting " + l);
//		Collections.sort(l);
//		System.out.println("After Sorting : " + l);
		
		
		for(int i =0;i<l.size()-1;i++) {
			if(l.get(i)<l.get(i+1)) {
				o.add(l.get(i));
				
//				System.out.println(l.get(i));
			}else if(l.get(i)>l.get(i+1)) {
//				System.out.println(l.get(i));
			}
//			if(l.size() == l.size()) {
//			    if(l.get(i)>l.get(i+1)) {
//					System.out.println(l.get(i));
//				}  
//			    if(l.get(i)<l.get(i+1)) {
//					System.out.println(l.get(i));
//				} 
//			}
//			if(l.get(0) > get(l.size()-1) ) {
//				System.out.println(l.get(l.size()-1));
//
//			}    
			
			
				
		}
		for(int i = 0;i< o.size();i++) {
//			System.out.println(o.get(i));
		}
		
		
		
		
		
//		Set<Integer> s= new HashSet<>();
//		
//		int min = 0;
//		
////		for(int k = 0 ; k < l.size() ; k++)
//		int k= 0 ;
//		while(k<l.size())
//		{
//			for(int i = 0 ; i< l.size() ; i++) {
//				 min = l.get(0);
//				for(int j = i+1 ; j< l.size() ; j++) {
//					if(min<l.get(j)) {
//						min = l.get(j);
//					}
//					
//					
//					
//				}
//			}
//		
//		
////		System.out.println(min);
//		s.add(min);
//		
//		l.remove(min);
//		
//		
//		k++;
//		}
		
		
		
//	byte a = 40;
//	byte b = 50;
//	byte c = 100;
//	int d = a*b/100;
//	System.out.println(d);
//	byte a = 50;
//	a= a * 2;
//	System.out.println(a);
		
	    byte a = 'A';
//	    System.out.println("வணக்கம்");
	    
	    int d = 7;
	    for(int i = 0; i<= d;i++) 
	    	for(int c = 0; c< i;c++) {
	    		
	    		System.out.print("*  ");
		        for( int g = 4; g > 0;g--) {
		    		System.out.print("*  ");
		        }
		    	
		    	System.out.println(" ");

		    }

	    }
	    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

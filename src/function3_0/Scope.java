package function3_0;

public class Scope {
	
    private static Object naam;
	private static String raam;

	public static void main(String[] ar) {
    	int a  = 10;
    	 a = 10;
    	
    	{
    		System.out.println(a);
//    		int a = 75;
    		 a = 20;  
    		 int c = 30;
    		 
    	}
//	     System.out.println(a);
//
    	int c= 200;
//
//	    for(int i = 0;i <1;i++) {
//	    	a=2000;
//
//	    }
//    	System.out.println(a);
    	 
    	 
    	 
    	String name = "Sethu";
		System.out.println(name);

		String f = change(name);
		System.out.println(f);
		System.out.println(name);
		
    }

	 static String change(String naam) {
        naam = "Resh";
//      System.out.println(naam1);
      return naam;
		
	}
    
}

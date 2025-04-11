package function3_0;

public class Shadowing {
    static int x =80;//tnhis will be shadowed at line 9
    

	public static void main(String[] args) {
		 x = 20;
		System.out.println(x);
		int x1 = 10;                                    //the class variable at line 4 is shadowed by this
                          //		System.out.println(x); //scope will begin when value is initialis
		System.out.println(x);//80();
		fun();
		System.out.println(x);


	}

	static void fun() {
		x = 100;
	}
	
	
	
	
	
}

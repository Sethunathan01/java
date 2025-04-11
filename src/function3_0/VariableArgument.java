package function3_0;

import java.util.Arrays;

public class VariableArgument {
	public static void main(String[] args) {
        fun("Sethu","Senamtham");
        multipule(0,0,"djhv","uwiur","iwriu","wirfiw");
	}
	static void fun(String...sethu) {
		System.out.println(Arrays.toString(sethu));
	}
	
	static void multipule(int a,int b,String...sethu) {
		
	}
}

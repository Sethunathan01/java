package string_1;

import java.util.ArrayList;

public class Operatitors {

	public static void main(String[] args) {
	      System.out.println((int)('a'));
	      System.out.println("a"+ "b");
	      System.out.println((char)('a'+ 3));
	      System.out.println("a"+ 1);
	      //this is some as after a few steps :"a"+"1"
	      //tnteger will be convart to Integer that will call toString()
	      System.out.println("Sethu" + new ArrayList<>());
	      System.out.println("Sethu" + new Integer(7787));
	      System.out.println( new ArrayList<>() +" "+ new Integer(8787));
	}

}

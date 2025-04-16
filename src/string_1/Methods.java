package string_1;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		String s = "Sethu Nathan";
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.indexOf('t'));
		System.out.println("      Sethu      ".strip());
		System.out.println(Arrays.toString(s.split(" ")));
	}

}

package string_1;

public class Test {

	public static void main(String[] args) {

		String name1 = "Sethu";
		String name2 = "Sethu";
		System.out.println(name1 == name2);
		
		String name3 = new String ("Sethu");
		String name4 = new String ("Sethu");
		System.out.println(name3 == name4);
		
		System.out.println(name2.charAt(1));
	}

}

package string_1;

public class Performance {

	public static void main(String[] args) {
		String a = "";
		for(int i = 0;i<26;i++) {
			char ch = (char)('a'+i);
			a+=ch +" ";
//			System.out.println(ch);
		}
		System.out.println(a);
	}

}

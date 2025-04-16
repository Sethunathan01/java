package string_1;

public class Palinrome {

	public static void main(String[] args) {
		String str = "setejetes";
		System.out.println(isPalinrome(str));
	}
	public static boolean isPalinrome(String str){
		str.toLowerCase();
		for(int i = 0;i<str.length()/2;i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			if(start != end) {
				return false;
			}
		}
		return true;
	}
}

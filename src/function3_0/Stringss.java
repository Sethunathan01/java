package function3_0;

public class Stringss {
    public static void main(String[] ar) {
    	String name = "Sethunathan";
    	String[] s=name.split("");
    	s[0]="R";
    	String join="";
    	for(int i=0;i<s.length;i++) {
    		join=join+s[i];
    	}
    	System.out.println(name);
    	System.out.println(join);
    }
}

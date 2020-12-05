package stringOperations;

public class String_replace {

	public static void main(String[] args) {
		/*
		 * Replace - normal
		 * replaceAll - RegEx
		 */
		String st1="my name 345s sreeja rao jog345n345pally";
		String st2="345";
		String ch="i";
		System.out.println(st1.replace(st2, ch));
		
		String st4="i23am st34udy5'/ing45 JA],[VA.;' ";
		String patt="[^A-Za-z\\s]";
		System.out.println(st4.replaceAll(patt,""));
	}

}

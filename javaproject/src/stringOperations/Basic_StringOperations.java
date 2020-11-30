package stringOperations;

public class Basic_StringOperations {
	/*
	 * basic string operations
	 * concatenate
	 * length
	 * trim
	 * uppercase
	 * lowercase
	 * empty
	 */
	public static void main(String[] args) {
		String st1="  Sreeja Rao  ";
		String st2="JOGINIPALLY";
		
		//concatenation
		
		String st3=st1+st2;
		System.out.println(st3);
		System.out.println(st1+st2);
		int n=100;
		System.out.println(st1+n);
		
		//length
		
		int len=st1.length();
		System.out.println(len);
		
		//trim
		
		//String st4="   shjdk  jdkuv jfkh   ";
		int trimlen=st1.trim().length();
		System.out.println(trimlen);
		
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println(st2.toLowerCase());
		String st5="";
		System.out.println(st5.isEmpty());
				

	}

}

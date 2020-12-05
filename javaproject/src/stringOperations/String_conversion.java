package stringOperations;

public class String_conversion {

	public static void main(String[] args) {
		/*
		 * toString
		 * toBinaryString
		 * toHexString
		 * toOctString
		 * parseInt
		 */
		int num1=100;
		System.out.println(Integer.toString(num1));
		System.out.println(Integer.toString(num1, 2));
		System.out.println(Integer.toString(num1, 16));
		System.out.println(Integer.toOctalString(num1));
		System.out.println("\n");
		
		String st1="100";
		String st2="11001010";
		String st3="80";
		String st4="64";
		System.out.println(Integer.parseInt(st1));
		System.out.println(Integer.parseInt(st2, 2));
		System.out.println(Integer.parseInt(st3, 16));
		System.out.println(Integer.parseInt(st4, 8));
	}

}

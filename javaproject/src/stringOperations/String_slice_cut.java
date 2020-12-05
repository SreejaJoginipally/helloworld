package stringOperations;

public class String_slice_cut {

	public static void main(String[] args) {
		/*
		 * Char At
		 * Substring
		 * Split
		 */
		String st1="ABCDEFG";
		System.out.println(st1.charAt(3));
		//System.out.println(st1.charAt(7));//StringIndexOutOfBoundsException
		
		System.out.println(st1.substring(3));
		System.out.println(st1.substring(2,5));
		
		String st2="SxRxExExJxA";
		String st3="x"; //delimiter
		String arr[]=st2.split(st3);
		for(String n :arr) {
			System.out.print(n);
		}
	}

}

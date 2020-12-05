package stringOperations;

public class String_comparision {

	public static void main(String[] args) {
		/*
		 * Equals
		 * Compare to
		 * Matches
		 * 
		 */
		String st1="Sreeja";
		String st2="Joginipally";
		String st3="Sreeja";
		String st4="sreeja";
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st1.equalsIgnoreCase(st4));
		
		System.out.println(st1.compareTo(st2));
		System.out.println(st2.compareTo(st1));
		System.out.println(st3.compareTo(st1));
		System.out.println(st3.compareToIgnoreCase(st4));
		
		String patt="[a-z]{1,}";
		System.out.println(st4.matches(patt));
		
		
	}

}

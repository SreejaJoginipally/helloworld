package stringOperations;

public class String_search {

	public static void main(String[] args) {
		/*
		 * Contains
		 * Starts with
		 * Ends with
		 * Index of
		 * Last index of
		 * 
		 */
		String st1="my name is Sreeja is Joginipally";
		String st2="Sreeja";
		String st3="Rao";
		String st4="sreeja";
		
		System.out.println(st1.contains(st2));
		System.out.println(st1.contains(st3));
		System.out.println(st1.contains(st4));//contains() is case sensitive
		
		System.out.println(st1.startsWith("my"));
		System.out.println(st1.endsWith("Joginipally"));
		System.out.println(st2.startsWith("S"));
		System.out.println(st2.endsWith("a"));
		
		System.out.println(st1.indexOf("is"));//first occurance of substring
		System.out.println(st1.indexOf("is",10));//starts from 10th index
		System.out.println(st1.lastIndexOf("is"));//last occurance of substring
		System.out.println(st1.lastIndexOf("is",17));
		
		
		
		
	}

}

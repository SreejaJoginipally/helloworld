package stringOperations;

public class ReverseString {

	public static void main(String[] args) {
		String st1="Sreeja";
		int len=st1.length();
		for(int a=len-1;a>=0;a--)
		{
			System.out.print(st1.charAt(a));
		}
	}
}

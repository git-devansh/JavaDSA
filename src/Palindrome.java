
public class Palindrome {

	public static void main(String[] args) {

		String s = "race car";
		s = s.replace(" ", "");
//		String reverse = "";
//		
//		for(int i = s.length() - 1; i >= 0; --i) {
//			reverse += s.charAt(i);
//		}
//		
//		boolean isPalindrome = true;
//		for(int i = 0; i < reverse.length(); ++i) {
//			if(s.charAt(i) != reverse.charAt(i)) {
//				isPalindrome = false;
//			}
//		}
//		System.out.println(isPalindrome);
		
		// Another method---
		
		boolean isPali = true;
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				isPali = false;
			}
		}
		System.out.println(isPali);
	}

}


public class PerfectNumber {

	public static void main(String[] args) {
		// 6 -> 1 + 2 + 3 = 6
		// 28 -> 1 + 2 + 4 + 7 + 14 = 28
		
		int n = 7;
		if(isPerfect(n)) {
			System.out.println("it is perfect number");
		} else {
			System.out.println("it is not perfect number");
		}
	}
	
	
	public static boolean isPerfect(int n) {
		int sum = 0;
		
		for(int i = 1; i < n; ++i) {
			if(n%i == 0)
				sum += i;
		}
		
		if(sum == n)
			return true;
		
		
		return false;
		
	}

}

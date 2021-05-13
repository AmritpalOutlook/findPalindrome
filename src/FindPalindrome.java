
public class FindPalindrome {
	static long result = 0, difference = Long.MAX_VALUE, num = 0;

	private static void update(String val) {
		try {
			long tmp = Long.parseLong(val);
			if (tmp == num)
				return;
			if (Math.abs(tmp - num) < difference || (Math.abs(tmp - num) == difference && tmp < result)) {
				result = tmp; // This defines the result if it's palindrome
				difference = Math.abs(tmp - num);
			}
		} catch (Exception e) {
		}
	}

	// This is used for concatenation of different input combinations
	private static void concatLeftRightSubstring(long leftHalf) {
		String s = "" + leftHalf, rs = new StringBuilder(s).reverse().toString();
		update(s + rs);
		update(s + rs.substring(1));
	}

	public static String findNearestPalindromic(String n) {
		try {
			num = Long.parseLong(n);
			difference = Long.MAX_VALUE;
			long leftHalf = Long.parseLong(n.substring(0, (n.length() + 1) / 2));
			concatLeftRightSubstring(leftHalf - 1);
			concatLeftRightSubstring((leftHalf - 1) * 10 + 9);
			concatLeftRightSubstring(leftHalf);
			concatLeftRightSubstring(leftHalf + 1);
			concatLeftRightSubstring((leftHalf + 1) / 10);
			return "" + result;
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		String pl = findNearestPalindromic("117");
		System.out.println(pl);

	}
}

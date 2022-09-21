package leetcode;

public class StringMultiply_43 {

	public static void main(String[] args) {
		String s1 = "123456789";
		String s2 = "987654321";
		int n1 = formNumber(s1);
		int n2 = formNumber(s2);
		System.out.println(n1 * n2);
		int r = 123456789 * 987654321;
		System.out.println(r);
	}

	public static int formNumber(String s) {
		int num = 0, mul = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			num = num + (Integer.parseInt("" + s.charAt(i)) * mul);
			mul = mul * 10;
		}
		return num;
	}

}

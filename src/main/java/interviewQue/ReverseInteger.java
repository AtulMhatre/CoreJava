package interviewQue;

public class ReverseInteger {

	public static void main(String[] args) {
		int i = 987654321;
		int rev = 0;
		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}
		System.out.println("reverse number is " + rev);
	}
}
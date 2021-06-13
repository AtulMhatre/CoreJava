package interviewQue;

public class FinallyConcepts {

	public static void main(String[] args) {
		test02();

	}

//Finally: 1:whatever you have written in finally block it will executed
	// 2: Finally keyword always use with try and catch block
	public static void test01() {

		try {
			System.out.println("inside test method");
		} finally {
			System.out.println("inside finally");
		}

	}

	public static  void test02() {
		int i = 10;
		try {
			i = i / 0;
			System.out.println(i);

		} catch (ArithmeticException e) {
			System.out.println("inside catch block	");
		}
		finally {
System.out.println("inside finally blcok");
		}
}}
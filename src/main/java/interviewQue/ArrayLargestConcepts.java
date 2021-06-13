package interviewQue;

public class ArrayLargestConcepts {

	public static void main(String[] args) {
		int numbers[] = { 10, 45, 56, 8, 100, };
		int largest = numbers[0];
		int smallest = numbers[1];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}

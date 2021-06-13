package interviewQue;

public class ArrayConcepts {

	public static void main(String[] args) {
//size limit
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 13;
		i[2] = 45;
		i[3] = 68;
		System.out.println(i.length);// size of array
		System.out.println(i[0]);//value of zero index

		/*
		 * for (int j : i) { System.out.println(j);
		 */
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);

		}

	}

}

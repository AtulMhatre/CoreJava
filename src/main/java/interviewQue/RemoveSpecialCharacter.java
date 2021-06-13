package interviewQue;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s = "?@#$ Atul $% Mhatre";
		s = s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
	}

}

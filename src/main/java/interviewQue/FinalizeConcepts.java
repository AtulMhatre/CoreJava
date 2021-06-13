package interviewQue;

public class FinalizeConcepts {

	public void finalize() {
		System.out.println("inside finalize");
	}

//finalize method is used to clean up the process before garbage clean up
	// remove the blank object refernce
	public static void main(String[] args) {

		FinalizeConcepts fz = new FinalizeConcepts();
		FinalizeConcepts fz1 = new FinalizeConcepts();
		fz1 = null;
		fz = null;
		System.gc();

	}

}

package yichang;

public class ExceptionTest2 {
	void go() throws Exception {

		throw new Exception("≥ˆœ÷“Ï≥£");
	}

	public static void main(String[] args) {

		try {
			ExceptionTest2 test2 = new ExceptionTest2();
			test2.go();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
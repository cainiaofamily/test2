package ketang;

public class TestTeacher {
	public static void main(String[] args) {

		JavaTeacher JavaTeacher1 = new JavaTeacher("Alvin", "Supinfo");
		JavaTeacher1.Introduction();
		JavaTeacher1.Givelesson();

		PhpTeacher PhpTeacher1 = new PhpTeacher("Mily", "JUST");
		PhpTeacher1.Introduction();
		PhpTeacher1.Givelesson();
	}
}

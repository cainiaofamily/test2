package ketang;

public class PhpTeacher extends Teacher {

	public PhpTeacher(String myName, String mySchool) {
		super(myName, mySchool);
	}
	public void Givelesson() {
		System.out.println("����PHP��ʦ�һ�����Notepad++���");
		super.Givelesson();
		//super.Introduction();
	}
}

package ketang;

public class JavaTeacher extends Teacher {
//extends Teacher ʹ��extends�ؼ��ּ�������Teacher
	public JavaTeacher(String myName, String mySchool) {
		super(myName, mySchool);
	}
	public void Givelesson() {
		System.out.println("����Java��ʦ�һ�����Exclipse���");
		super.Givelesson();
		//super.Introduction();
	}
}
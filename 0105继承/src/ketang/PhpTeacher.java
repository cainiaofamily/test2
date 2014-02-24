package ketang;

public class PhpTeacher extends Teacher {

	public PhpTeacher(String myName, String mySchool) {
		super(myName, mySchool);
	}
	public void Givelesson() {
		System.out.println("我是PHP老师我会启用Notepad++软件");
		super.Givelesson();
		//super.Introduction();
	}
}

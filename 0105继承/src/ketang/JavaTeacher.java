package ketang;

public class JavaTeacher extends Teacher {
//extends Teacher 使用extends关键字继续父类Teacher
	public JavaTeacher(String myName, String mySchool) {
		super(myName, mySchool);
	}
	public void Givelesson() {
		System.out.println("我是Java老师我会启用Exclipse软件");
		super.Givelesson();
		//super.Introduction();
	}
}
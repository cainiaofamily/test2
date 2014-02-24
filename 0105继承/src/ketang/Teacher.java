package ketang;

public class Teacher {
	private String name;
	private String school;
	
	// 所有的老师都可以自我介绍
	protected void Introduction() {
		System.out.println("我是" + school + "的" + name);
	}
	// 所有的老师假设都有名字属性,都有学校属性
	public Teacher(String myName, String mySchool) {
		name = myName;
		school = mySchool;
	}
	protected void Givelesson() {
		// 所有的老师假设都有如下教学方法
		System.out.println("使用PPT教学");
		System.out.println("课堂知识点讲解");
	}
}

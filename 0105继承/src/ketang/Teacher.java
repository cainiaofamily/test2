package ketang;

public class Teacher {
	private String name;
	private String school;
	
	// ���е���ʦ���������ҽ���
	protected void Introduction() {
		System.out.println("����" + school + "��" + name);
	}
	// ���е���ʦ���趼����������,����ѧУ����
	public Teacher(String myName, String mySchool) {
		name = myName;
		school = mySchool;
	}
	protected void Givelesson() {
		// ���е���ʦ���趼�����½�ѧ����
		System.out.println("ʹ��PPT��ѧ");
		System.out.println("����֪ʶ�㽲��");
	}
}

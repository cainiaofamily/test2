public class Calculator {
	int a,b,c;
	String add;
	String delate;
	String multiply;
	String division;

	public void add() {
		c = a + b;
		System.out.println("��ʹ�������ӷ������㣬����ǣ�" + c);
	}

	public void delate() {
		c = a - b;
		System.out.println("��ʹ���������������㣬����ǣ�" + c);
	}

	public void multiply() {
		c = a * b;
		System.out.println("��ʹ�������˷������㣬����ǣ�" + c);
	}

	public void division() {
		c = a / b;
		System.out.println("��ʹ���������������㣬����ǣ�" + c);
	}
}

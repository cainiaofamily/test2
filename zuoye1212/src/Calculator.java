public class Calculator {
	int a,b,c;
	String add;
	String delate;
	String multiply;
	String division;

	public void add() {
		c = a + b;
		System.out.println("您使用了做加法的运算，结果是：" + c);
	}

	public void delate() {
		c = a - b;
		System.out.println("您使用了做减法的运算，结果是：" + c);
	}

	public void multiply() {
		c = a * b;
		System.out.println("您使用了做乘法的运算，结果是：" + c);
	}

	public void division() {
		c = a / b;
		System.out.println("您使用了做除法的运算，结果是：" + c);
	}
}

package homework;

public class CarTest {
	// ��дһ�����������ķ���TestStart
	void testStart(Car c) {
		c.Start();
	}

	public static void main(String[] args) {

		Sedan car1 = new Sedan();
		car1.Start();
		car1.Stop();

		Bus bus1 = new Bus();
		bus1.Start();
		bus1.Stop();
		
		// �����Ƿ��������򵥵ķ���������ʵ�ʲ��ԣ������Ը÷�������ȷ�ԣ�
		CarTest c = new CarTest();
		Car Sedan = new Sedan();
		Car Bus = new Bus();
		c.testStart(Sedan);
		c.testStart(Bus);

	}
}

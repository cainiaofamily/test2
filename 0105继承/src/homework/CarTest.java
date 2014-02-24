package homework;

public class CarTest {
	// 编写一个测试启动的方法TestStart
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
		
		// 测试是否启动（简单的方法，不可实际测试，仅测试该方法的正确性）
		CarTest c = new CarTest();
		Car Sedan = new Sedan();
		Car Bus = new Bus();
		c.testStart(Sedan);
		c.testStart(Bus);

	}
}

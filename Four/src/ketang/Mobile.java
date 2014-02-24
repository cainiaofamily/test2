package ketang;

public class Mobile {
	int a, b, c;
	int price;// 价格属性
	String version;// 系统版本
	String colour;// 手机颜色
	String brand;// 手机品牌

	public void call() {
		System.out.println(brand);
	}

	// call方法调用后，执行的是输出品牌
	public void SendMessage() {
		System.out.println("Send message");
	}

	// SendMessage方法调用后，执行的是发送信息，这个信息内容我们可以在上面定义的
	public void PlayGames() {
		System.out.println("PlayGames");
	}// 同上

	public void add() {
		c = a + b;
		System.out.println("您使用了做加法的运算，结果是：" + c);
	}
	// 添加一个做加法的方法
}

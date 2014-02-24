package ketang;

public class TestMobile {
	public static void main(String[] args) {
		Mobile wp = new Mobile();// wp表示WindowsPhone系统的手机
		// 要调用，首先我们需要新建一个手机，方法是上一行代码
		// 如果我要输出这个新手机的系统版本，让它进行发信息操作怎么做？

		wp.version = "ab_22.1";// 定义系统版本是ab_22.1，下面调用的时候输出的都会是该版本
		// 如果此处不定义，可以在Mobile.java方法中封装，此处就可以直接使用wp.version();也会输出版本号，可以自己试试
		System.out.println("系统版本号：" + wp.version);
		wp.SendMessage();

		// 同样，假设我定义一个新手机是iphone,我要它做加法，并且执行玩游戏怎么做？
		Mobile iphone = new Mobile();
		iphone.a = 2;
		iphone.b = 3;
		iphone.add();// 直接调用写好的做加法的方法即可
		iphone.PlayGames();// 直接调用玩游戏的方法
	}
}

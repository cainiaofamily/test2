package ketang;

public class TestMobile {
	public static void main(String[] args) {
		Mobile wp = new Mobile();// wp��ʾWindowsPhoneϵͳ���ֻ�
		// Ҫ���ã�����������Ҫ�½�һ���ֻ�����������һ�д���
		// �����Ҫ���������ֻ���ϵͳ�汾���������з���Ϣ������ô����

		wp.version = "ab_22.1";// ����ϵͳ�汾��ab_22.1��������õ�ʱ������Ķ����Ǹð汾
		// ����˴������壬������Mobile.java�����з�װ���˴��Ϳ���ֱ��ʹ��wp.version();Ҳ������汾�ţ������Լ�����
		System.out.println("ϵͳ�汾�ţ�" + wp.version);
		wp.SendMessage();

		// ͬ���������Ҷ���һ�����ֻ���iphone,��Ҫ�����ӷ�������ִ������Ϸ��ô����
		Mobile iphone = new Mobile();
		iphone.a = 2;
		iphone.b = 3;
		iphone.add();// ֱ�ӵ���д�õ����ӷ��ķ�������
		iphone.PlayGames();// ֱ�ӵ�������Ϸ�ķ���
	}
}

package ketang;

public class Mobile {
	int a, b, c;
	int price;// �۸�����
	String version;// ϵͳ�汾
	String colour;// �ֻ���ɫ
	String brand;// �ֻ�Ʒ��

	public void call() {
		System.out.println(brand);
	}

	// call�������ú�ִ�е������Ʒ��
	public void SendMessage() {
		System.out.println("Send message");
	}

	// SendMessage�������ú�ִ�е��Ƿ�����Ϣ�������Ϣ�������ǿ��������涨���
	public void PlayGames() {
		System.out.println("PlayGames");
	}// ͬ��

	public void add() {
		c = a + b;
		System.out.println("��ʹ�������ӷ������㣬����ǣ�" + c);
	}
	// ���һ�����ӷ��ķ���
}

public class Point {
	private int x, y, z;

	public Point() {
		this(0, 0, 0);
	}

	// 生成具有特定坐标的点
	public Point(int ox, int oy, int oz) {
		setXYZ(ox, oy, oz);
	}

	// 设置三个点的坐标
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void display() {

		System.out.println("坐标信息：" + x + y + z);
	}

	public void setXYZ(int x, int y, int z) {
		setX(x);
		setY(y);
		setZ(z);

	}
}

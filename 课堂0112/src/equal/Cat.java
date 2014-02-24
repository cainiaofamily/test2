package equal;

public class Cat {
	String color;
	int size;

	Cat(String color, int size) {
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return color + "" + size;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Cat) {

			Cat c = (Cat) obj;
			if (this.color.equals(c.color) && this.size == c.size) {

				return true;
			}
		}
		return false;
	}
}

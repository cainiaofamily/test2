package Name;

import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

class Name implements Comparable {
	String firstName;
	String lastName;
	Name(String Kitty, String Kaisa) {
		firstName = Kitty;
		lastName = Kaisa;
	}
	@Override
	public String toString() {
		return firstName + lastName;
	}
	public int compareTo(Object o) {
		Name name = (Name) o;
		if (firstName.equals(name.firstName))
			return 0;
		return firstName.compareTo(name.firstName);

	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Name) {

			Name name = (Name) obj;
			if (this.firstName.equals(name.firstName)
					&& this.lastName.equals(name.lastName)) {
				return true;
			}
		}
		return super.equals(obj);
	}
}

// ≤‚ ‘
public class Collection1 {
	public static void main(String[] args) {
		Collection names = new ArrayList();

		names.add(new Name("Cat", "Mading"));
		names.add(new Name("Marry", "Alpha"));
		System.out.println(names.size());
		System.out.println(names);

		Iterator it = names.iterator();

		while (it.hasNext()) {
			Name name1 = (Name) it.next();
			System.out.println(name1.firstName);
		}
		names.remove(new Name("Cat", "Mading"));
		System.out.println(names);

		Set s = new HashSet();
		s.add("aaa");
		s.add("bbb");
		s.add("aaa");
		s.add(new Name("Kitty", "Kaisa"));
		s.add(new Name("Kitty", "Mengla"));
		s.add(new Name("Kitty", "lala"));
		s.add(new Name("Kitty", "lading"));
		s.add(new Integer(3));
		s.add(new Integer(3));
		for (Object o : s) {
			System.out.println(o);
		}

		List list1 = new LinkedList();
		List list2 = new LinkedList();
		for (int i = 0; i <= 9; i++) {
			list1.add("a" + i);
		}
		System.out.println(list1);
		Collections.shuffle(list1);
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(Collections.binarySearch(list1, "a4"));
		for (int i = 0; i <= 20; i++) {
			list2.add("b" + i);
		}
		Collections.copy(list2, list1);
		System.out.println(list2);

		List list = new ArrayList();
		list.add(new Name("Aboluo", "ali"));
		list.add(new Name("Bubby", "cali"));
		list.add(new Name("Cindy", "taddy"));
		Collections.sort(list);
		System.out.println(list);
	}
}
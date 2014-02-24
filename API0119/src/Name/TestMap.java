package Name;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		Map m1 = new HashMap();
		Map m2 = new TreeMap();
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		m2.put("A", 1);
		m2.put("B", 2);
		System.out.println(m1.size());
		System.out.println(m1.get("one"));
		System.out.println(m1.containsKey("one"));
		System.out.println(m2.containsValue(2));
		Map m3 = new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
	}
}

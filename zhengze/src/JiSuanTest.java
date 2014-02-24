import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class JiSuanTest {

	@Test
	public void testAdd() {
		JiSuan jisuan =new JiSuan();
		int result =jisuan.add(3, 4);
		assertEquals(7,result);
	}

	@Ignore
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMultify() {
		fail("Not yet implemented");
	}

}

package junit_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calculateTest {
	calculate c=null;
	@Before
	public void testbefore() {
		c=new calculate();
	}
	@Test
	public void testAdd() {
		assertEquals(6,c.add(3, 3));
	}

	@Test
	public void testSubstract() {
		assertEquals(2,c.substract(5, 3));
	}

	@Test
	public void testCheng() {
		assertEquals(15,c.cheng(5, 3));
	}

	@Test
	public void testChu() {
		assertEquals(2,c.chu(6, 3));
	}

}

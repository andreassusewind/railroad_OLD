package railroad;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class PrivateTest {

	Private p;
	
	@BeforeEach
	public void setUp() {
		p = new Private("Test", "T", 20, 5);
	}

	@Test
	void testPrivate() {
		Class<?> t;
		try {
			t = Class.forName("railroad.Private");
		} catch (ClassNotFoundException e) {
			fail("Class railroad.Private not found.");
			return;
		}
		
		Method[] m = t.getDeclaredMethods();
		assertEquals(m.length, 7, "Class Private has false number of Methods");
		
		Class<?>[] i = t.getInterfaces();
		assertEquals(0, i.length, "Class Private has false number of implemented Interfaces");
		
		assertEquals("railroad.Certificate", t.getSuperclass().getName(), "Class Private extends false class");
	}
	
	@Test
	void testGetInitials() {
		try {
			Private.class.getDeclaredMethod("getInitials", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.getInitials not found");
		}
		
		assertEquals("T", p.getInitials(), "Private.getInitials is false.");
	}

	@Test
	void testSetInitials() {
		try {
			Private.class.getDeclaredMethod("setInitials", new Class[]{String.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.setInitials not found");
		}
		
		p.setInitials("U");
		assertEquals("U", p.getInitials(), "Private.setInitials is false.");
	}

	@Test
	void testGetParvalue() {
		try {
			Private.class.getDeclaredMethod("getParvalue", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.getParvalue not found");
		}
		
		assertEquals(20, p.getParvalue(), "Private.getParvalue is false.");
	}

	@Test
	void testSetParvalue() {
		try {
			Private.class.getDeclaredMethod("setParvalue", new Class[]{int.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.setParvalue not found");
		}
		
		p.setParvalue(10);
		assertEquals(10, p.getParvalue(), "Private.setParvalue is false.");
	}

	@Test
	void testGetRevenue() {
		try {
			Private.class.getDeclaredMethod("getRevenue", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.getRevenue not found");
		}
		
		assertEquals(5, p.getRevenue(), "Private.getRevenue is false.");
	}

	@Test
	void testSetRevenue() {
		try {
			Private.class.getDeclaredMethod("setRevenue", new Class[]{int.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.setRevenue not found");
		}
		
		p.setRevenue(10);
		assertEquals(10, p.getRevenue(), "Private.getRevenue is false.");
	}
}
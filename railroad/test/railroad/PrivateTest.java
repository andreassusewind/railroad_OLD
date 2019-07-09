package railroad;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class PrivateTest {

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
	void testSpecialFkt() {
		try {
			Private.class.getDeclaredMethod("specialFkt", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.specialFkt not found");
		}
	}
	
	@Test
	void testDirectFkt() {
		try {
			Private.class.getDeclaredMethod("directFkt", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.directFkt not found");
		}
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
	}
}
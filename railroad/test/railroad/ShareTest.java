package railroad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ShareTest {

	Share s;
	Corporation c;
	
	@BeforeEach
	public void setUp() {
		s = new Share("Test", false, 10, c);
	}

	@Test
	void testShare() {
		Class<?> t;
		try {
			t = Class.forName("railroad.Share");
		} catch (ClassNotFoundException e) {
			fail("Class railroad.Share not found.");
			return;
		}
		
		Method[] m = t.getDeclaredMethods();
		assertEquals(m.length, 4, "Class Share has false number of Methods");
		
		Class<?>[] i = t.getInterfaces();
		assertEquals(0, i.length, "Class Share has false number of implemented Interfaces");
		
		assertEquals("railroad.Certificate", t.getSuperclass().getName(), "Class Share extends false class");
	}
	
	@Test
	void testIsPresident() {
		try {
			Share.class.getDeclaredMethod("isPresident", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Share.isPresident not found");
		}
		
		assertEquals(false, s.isPresident(), "Share.isPresident is false.");
	}
	
	@Test
	void testGetPercentage() {
		try {
			Share.class.getDeclaredMethod("getPercentage", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Share.isPresident not found");
		}
		
		assertEquals(10, s.getPercentage(), "Share.getPercentage is false");
	}

	@Test
	void testGetCorp() {
		try {
			Share.class.getDeclaredMethod("getCorp", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Share.getCorp not found");
		}
		
		assertEquals(c, s.getCorp(), "Share.getCorp is false");
	}

}

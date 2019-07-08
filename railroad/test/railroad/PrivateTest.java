package railroad;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrivateTest {

	Private p; 
	
	@BeforeEach
	public void setUp() {
		p = new Private("Test", 50, 10); 
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

		try {
			Private.class.getDeclaredMethod("Private", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.Private not found");
		}
		
		Private test = new railroad.Private("T", 40, 5);
		assertEquals(test.getName(), "T", "Private builder (String, int, int) false");
		assertEquals(test.getParvalue(), 40, "Private builder (String, int, int) false");
		assertEquals(test.getRevenue(), 5, "Private builder (String, int, int) false");
		
	}

	@Test
	void testGetName() {
		try {
			Private.class.getDeclaredMethod("getName", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Private.getName not found");
		}
		
		assertEquals("Test", p.getName(), "Private.getName -> false name");
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetParvalue() {
		fail("Not yet implemented");
	}

	@Test
	void testSetParvalue() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRevenue() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRevenue() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}

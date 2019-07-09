package railroad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ShareTest {

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
		assertEquals(m.length, 1, "Class Share has false number of Methods");
		
		Class<?>[] i = t.getInterfaces();
		assertEquals(0, i.length, "Class Share has false number of implemented Interfaces");
		
		assertEquals("railroad.Certificate", t.getSuperclass().getName(), "Class Share extends false class");
	}
	
	

}

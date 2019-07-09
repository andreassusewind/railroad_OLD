package railroad;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CertificateTest {

	@Test
	void testCertificate() {
		Class<?> t;
		try {
			t = Class.forName("railroad.Certificate");
		} catch (ClassNotFoundException e) {
			fail("Class railroad.Certificate not found.");
			return;
		}
		
		Method[] m = t.getDeclaredMethods();
		assertEquals(m.length, 17, "Class Certificate has false number of Methods");
		
		Class<?>[] i = t.getInterfaces();
		assertEquals(0, i.length, "Class Certificate has false number of implemented Interfaces");
	}
}

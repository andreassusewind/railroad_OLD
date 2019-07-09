package railroad;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class PlayerTest {

	Player p;
	
	@BeforeEach
	public void setUp() {
		p = new Player("T", 600);
	}

	
	@Test
	void testPlayer() {
		Class<?> t;
		try {
			t = Class.forName("railroad.Player");
		} catch (ClassNotFoundException e) {
			fail("Class railroad.Player not found.");
			return;
		}
		
		Method[] m = t.getDeclaredMethods();
		assertEquals(m.length, 6, "Class Private has false number of Methods");
		
		Class<?>[] i = t.getInterfaces();
		assertEquals(0, i.length, "Class Private has false number of implemented Interfaces");
	}

	@Test
	void testGetCertificate() {
		try {
			Player.class.getDeclaredMethod("getCerts", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Player.getCerts not found");
		}
		
		p.addCert(new Private1830SV());
		p.addCert(new Private1830SV());
		
		assertEquals("SV", p.getCerts().get(0).getInitials(), "Player.getCerts takes false Certificate Element");
	}
	
	@Test
	void testAddCertificates() {
		testGetCertificate();
	}
	
	@Test
	void testIncreaseMoney() {
		try {
			Player.class.getDeclaredMethod("increaseMoney", new Class[] {int.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Player.increaseMoney not found");
		}
		
		p.increaseMoney(200);
		assertEquals(800, p.getMoney(), "Player.increaseMoney false");
	}

	@Test
	void testDecreaseMoney() {
		try {
			Player.class.getDeclaredMethod("decreaseMoney", new Class[] {int.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Player.decreaseMoney not found");
		}
		
		p.decreaseMoney(200);
		assertEquals(400, p.getMoney(), "Player.decreaseMoney false");
	}
}

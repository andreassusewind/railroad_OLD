package railroad;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CorporationTest {

	Corporation c;
	
	@BeforeEach
	public void setUp() {
		c = new Corporation("Baltimore & Ohio Corporation", "B&O");
	}

	@Test
	void testCorporation() {
		Class<?> t;
		try {
			t = Class.forName("railroad.Corporation");
		} catch (ClassNotFoundException e) {
			fail("Class railroad.Corporation not found.");
			return;
		}
		
		Method[] m = t.getDeclaredMethods();
		assertEquals(m.length, 11, "Class Corporation has false number of Methods");
		
		Class<?>[] i = t.getInterfaces();
		assertEquals(0, i.length, "Class Corporation has false number of implemented Interfaces");
	}
	
	@Test
	void testGetName() {
		try {
			Corporation.class.getDeclaredMethod("getName", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.getName not found");
		}
		
		assertEquals("Baltimore & Ohio Corporation", c.getName(), "Corporation.getName is false.");
	}

	@Test
	void testSetName() {
		try {
			Corporation.class.getDeclaredMethod("setName", new Class[]{String.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.setName not found");
		}
		
		c.setName("Test");;
		assertEquals("Test", c.getName(), "Corporation.setName is false.");
	}

	@Test
	void testGetInitials() {
		try {
			Corporation.class.getDeclaredMethod("getInitials", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.getInitials not found");
		}
		
		assertEquals("B&O", c.getInitials(), "Corporation.getInitials is false.");
	}

	@Test
	void testSetInitials() {
		try {
			Corporation.class.getDeclaredMethod("setInitials", new Class[]{String.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.setInitials not found");
		}
		
		c.setInitials("Test");;
		assertEquals("Test", c.getInitials(), "Corporation.setInitials is false.");
	}
	
	@Test
	void testGetInitialStock() {
		try {
			Corporation.class.getDeclaredMethod("getInitialStock", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.getInitialStock not found");
		}
		
		c.addInitialStock(new Share("Test", false, 10, c));
		assertEquals("Test", c.getInitialStock().get(0).getName(), "Corporation.getInitialStock is false.");
	}

	@Test
	void testAddInitialStock() {
		try {
			Corporation.class.getDeclaredMethod("addInitialStock", new Class[]{Share.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.addInitialStock not found");
		}
		
		c.addInitialStock(new Share("Test", false, 10, c));
		assertEquals("Test", c.getInitialStock().get(0).getName(), "Corporation.getInitialStock is false.");
	}

	@Test
	void testGetBankStock() {
		try {
			Corporation.class.getDeclaredMethod("getBankStock", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.getBankStock not found");
		}
		
		c.addBankStock(new Share("Test", false, 10, c));
		assertEquals("Test", c.getBankStock().get(0).getName(), "Corporation.getInitialStock is false.");
	}

	@Test
	void testAddBankStock() {
		try {
			Corporation.class.getDeclaredMethod("addBankStock", new Class[]{Share.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.addBankStock not found");
		}
		
		c.addBankStock(new Share("Test", false, 10, c));
		assertEquals("Test", c.getBankStock().get(0).getName(), "Corporation.getInitialStock is false.");
	}

	@Test
	void testGetPrivs() {
		try {
			Corporation.class.getDeclaredMethod("getPrivs", new Class[0]);
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.getPrivs not found");
		}
		
		c.addPrivs(new Private1830SV());
		assertEquals("SV", c.getPrivs().get(0).getInitials(), "Corporation.getInitialStock is false.");
	}

	@Test
	void testAddPrivs() {
		try {
			Corporation.class.getDeclaredMethod("addPrivs", new Class[]{Private.class});
		} catch (SecurityException e) {
			e.printStackTrace();
			fail();
		} catch (NoSuchMethodException e) {
			fail("Corporation.addPrivs not found");
		}
		
		c.addPrivs(new Private1830SV());
		assertEquals("SV", c.getPrivs().get(0).getInitials(), "Corporation.getInitialStock is false.");
	}

}

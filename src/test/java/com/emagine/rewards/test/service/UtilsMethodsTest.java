package com.emagine.rewards.test.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;

import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.utils.Utils;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Parameterized.class)
@PrepareForTest({ PropertiesLoader.class })
public class UtilsMethodsTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { new String("enba.audit.timzone") } });
	}

	@Parameterized.Parameter(value = 0)
	public String str;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testIsNullOrEmptyForNull() {
		String str = null;
		assertTrue(Utils.isNullOrEmpty(str));
	}

	@Test
	public void testIsNullOrEmptyForEmpty() {
		String str = "";
		assertTrue(Utils.isNullOrEmpty(str));
	}

	@Test
	public void testIsNullOrEmptyForNotEmptyButOnlyBlanks() {
		String str = "    ";
		assertTrue(Utils.isNullOrEmpty(str));
	}

	@Test
	public void testIsNullOrEmptyForNotEmpty() {
		String str = "TEST";
		assertFalse(Utils.isNullOrEmpty(str));
	}

	@Test
	public void testGetSerialNumber() throws Exception {
		assertNotNull(Utils.getSerialNumber());
		assertTrue(Utils.getSerialNumber().startsWith("511"));
		String uuid = Utils.getSerialNumber();
		assertTrue(uuid.length() == 14);
		String uuid2 = Utils.getSerialNumber();
		assertNotEquals(uuid, uuid2);
	}

	@Test
	public void testIsNumericWhenInputIsNotNumeric() {
		String str = "abcd";
		assertFalse(Utils.isNumeric(str));
	}

	@Test
	public void testIsNumericWhenInputIsNumeric() {
		String str = "1234";
		assertTrue(Utils.isNumeric(str));
	}

	@Test
	public void testIsNumericWhenInputIsNull() {
		String str = null;
		assertFalse(Utils.isNumeric(str));
	}

	@Test(expected = Exception.class)
	public void testGetCurrentTimeStamp() throws Exception {
		mockStatic(PropertiesLoader.class);
		Utils utils = new Utils();
		PowerMockito.when(PropertiesLoader.getValue("enba.audit.timzone")).thenReturn("GMT+10:00");
		Date ts = new Date(System.currentTimeMillis());
		verifyStatic(times(1));
		PropertiesLoader.getValue(str);
		Date ts2 = utils.getCurrentTimeStamp();
		assertTrue(ts2.after(ts));
	}

	@Test
	public void testConvertToDBComment() {
		String str = "This is a 'test This is a test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a 'test This is a test This is a 'testThis is a 'test";
		String corrected = Utils.convertToDBComment(str);
		assertFalse(corrected.contains("'"));
		assertTrue(corrected.length() <= 250);
	}
}

package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

import phone.MyPhone;

public class AllTests {
	public static PhoneNumberUtil pUtil = PhoneNumberUtil.getInstance();
	PhoneNumber phone;
	   @Before
	    public void setUp() throws Exception {
	        phone=pUtil.parse("7777777777", "US");
	    }
	
	
	@Test
    public void testConvertToE164Number() {
        Assert.assertEquals(phone, MyPhone.convertToE164Number("7777777777"));
        Assert.assertNotEquals(phone, MyPhone.convertToE164Number("7uuu777777"));
    }
	
}

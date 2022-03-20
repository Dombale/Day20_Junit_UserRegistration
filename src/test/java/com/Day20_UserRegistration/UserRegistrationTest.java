package com.Day20_UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Priyanka");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("priyanka");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Dombale");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("yamagar");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.email("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.email("abc.xyz.in");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.mobileNumber("91 9919819801");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.mobileNumber("9919819801");
		Assert.assertEquals(false, result);
	}
}
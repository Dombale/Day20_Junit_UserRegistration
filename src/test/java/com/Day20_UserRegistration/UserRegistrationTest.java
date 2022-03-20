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

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.password1("priyanka");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.password1("pri");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.password2("priyanKa");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.password2("priyanka");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule3_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.password3("Priyanka7");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.password3("priyanka");
		Assert.assertEquals(false, result);
	}
}
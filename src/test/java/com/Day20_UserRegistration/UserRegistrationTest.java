package com.Day20_UserRegistration;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validateFirstName("Priya");
	}
}
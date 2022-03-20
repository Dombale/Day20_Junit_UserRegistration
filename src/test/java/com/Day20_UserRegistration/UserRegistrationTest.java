package com.Day20_UserRegistration;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validateFirstName("Priyanka");
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validateLastName("Dombale");
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validateEmail("priyankadombale27@gmail.com");
	}
}
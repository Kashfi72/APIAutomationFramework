package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest 
{
	@Test(description = "Verify if Login API is Working")
	public void createAccountTest()
	{
		SignUpRequest signUpRequest = new  SignUpRequest.Builder()
		.userName("Disha")
		.email("disha@yahoo.com")
		.firstName("Disha")
		.lastName("Bhatt")
		.mobileNumber("1234567890")
		.build();
		
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	
	}

}

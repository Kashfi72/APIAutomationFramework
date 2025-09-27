package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*; // static import to improve readability of code.
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest3 
{	
	@Test(description = "Verify if Login API is Working")
	public void loginTest()
	{
		LoginRequest loginRequest = new LoginRequest("uday1234", "uday1234");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		
		Assert.assertTrue(loginResponse.getToken() != null);
	}

}

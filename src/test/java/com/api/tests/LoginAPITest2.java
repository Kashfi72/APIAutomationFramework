package com.api.tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*; // static import to improve readability of code.
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest2 
{	
	@Test(description = "Verify if Login API is Working")
	public void loginTest()
	{
		Response response = given()
				.baseUri("http://64.227.160.186:8080")
				.header("Content-type","application/json").body("{\\\"username\\\": \\\"uday1234\\\", \\\"password\\\": \\\"uday12345\\\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);;
	}

}

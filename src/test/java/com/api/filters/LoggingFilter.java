package com.api.filters;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter 
{
	private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) 
	{
		logRequest(requestSpec); // with this we have intercept and get information
		Response response = ctx.next(requestSpec, responseSpec); // Request is going to be executed
		logResponse(response);
		
		return response; // taken to tests for assertion
	}
	
	public void logRequest(FilterableRequestSpecification requestSpec)
	{
		logger.info("BASE_URI:"+requestSpec.getBaseUri()); // Base Uri
		logger.info("Request Header:"+requestSpec.getHeaders()); // Request Header
		logger.info("Request Body:"+requestSpec.getBody()); // Request payload
	}
	
	public void logResponse(Response response)
	{
		logger.info("STATUS CODE:"+response.getStatusCode()); // Status Code
		logger.info("Response Header:"+response.headers()); // Response Header
		logger.info("Response Body:"+response.body().prettyPrint()); // Response Body
	}
	

}

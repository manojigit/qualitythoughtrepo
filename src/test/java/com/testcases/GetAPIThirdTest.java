package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPIThirdTest {

	
	@Test
	public void testCase3() {
		//https://reqres.in/api/users/2
		RequestSpecification requestSpec = RestAssured.given().contentType("application/json");
		Response response = requestSpec.get("https://reqres.in/api/users/2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
}

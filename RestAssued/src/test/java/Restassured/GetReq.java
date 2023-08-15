package Restassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetReq {
	
	@BeforeSuite
	void setup()
	{
		System.out.println("setup");
	}

	@Test
	void get_req()
	{
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="api/users?page=2";
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
	
	
		.header("Content-Type", "application/json; charset=utf-8");  

		System.out.println("Test is passed");
		
}

	@AfterSuite
	void teardown()
	{
		System.out.println("teardown");
	}


}

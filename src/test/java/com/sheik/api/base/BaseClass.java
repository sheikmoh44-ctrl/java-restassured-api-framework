package com.sheik.api.base;

import com.sheik.api.utils.ConfigReader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	 protected RequestSpecification request;

	    public void setup() {

	        RestAssured.baseURI = ConfigReader.getProperty("baseURL");

	        request = RestAssured
	                .given()
	                .log().all()
	                .header("Content-Type", "application/json")
	                .header("Accept", "application/json");
	    }
}

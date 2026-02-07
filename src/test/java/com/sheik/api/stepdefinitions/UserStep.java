package com.sheik.api.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.sheik.api.base.BaseClass;
import com.sheik.api.endpoints.Endpoints;
import com.sheik.api.payload.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class UserStep extends BaseClass {
	Response response;
	int productId;

	@Given("user sets the base request")
	public void user_sets_base_request() {
		setup();
	}

	@When("user sends GET request to get all products")
	public void user_sends_get_products() {
		response = request.when().get(Endpoints.GET_ALL_PRODUCTS);
	}

	@Then("user should get status code {int}")
	public void user_validates_status_code(Integer code) {
		response.then().statusCode(code);
	}

	@Then("response should contain list of products")
	public void validate_products_response() {

		List<Map<String, Object>> products = response.jsonPath().getList("$");

		Assert.assertFalse("Product list is empty", products.isEmpty());

		Map<String, Object> product = products.get(0);
		Assert.assertNotNull(product.get("id"));
		Assert.assertNotNull(product.get("title"));
		Assert.assertNotNull(product.get("price"));
		Assert.assertNotNull(product.get("category"));

		double price = Double.parseDouble(product.get("price").toString());
		Assert.assertTrue("Price is not greater than zero", price > 0);
	}

	@When("user sends GET request to get product with id {int}")
	public void user_sends_get_single_product(Integer id) {
		productId = id;
		response = request.pathParam("id", id).when().get(Endpoints.GET_SINGLE_PRODUCT);
	}

	@Then("response should contain product details with id {int}")
	public void validate_single_product(Integer expectedId) {

		int actualId = response.jsonPath().getInt("id");

		Assert.assertEquals("Product Id mismatch", expectedId.intValue(), actualId);

		Assert.assertNotNull(response.jsonPath().get("title"));
		Assert.assertNotNull(response.jsonPath().get("price"));
		Assert.assertNotNull(response.jsonPath().get("category"));
		Assert.assertNotNull(response.jsonPath().get("description"));
	}

	@When("user sends POST request to create a product")
	public void user_creates_product() {
		response = request.body(Product.createProductPayload()).when().post(Endpoints.CREATE_PRODUCT);
	}

	@Then("response should contain created product details")
	public void validate_created_product() {

		Assert.assertNotNull(response.jsonPath().get("id"));
		Assert.assertEquals("Automation Test Product", response.jsonPath().getString("title"));
		Assert.assertEquals("electronics", response.jsonPath().getString("category"));
	}

	@When("user sends PUT request to update product with id {int}")
	public void user_updates_product(Integer id) {
		response = request.pathParam("id", id).body(Product.updateProductPayload()).when()
				.put(Endpoints.UPDATE_PRODUCT);
	}
	
	@Then("response should contain updated product details")
	public void response_should_contain_updated_product_details() {
		Assert.assertNotNull(response.jsonPath().get("id"));
		Assert.assertEquals("Updated Automation Product", response.jsonPath().getString("title"));
		Assert.assertEquals("electronics", response.jsonPath().getString("category"));
	}
	
	@When("user sends DELETE request to delete product with id {int}")
	public void user_deletes_product(Integer id) {
	    response = request
	            .pathParam("id", id)
	            .when()
	            .delete(Endpoints.DELETE_PRODUCT);
	}

	@Then("product should be deleted successfully")
	public void validate_delete_response() {

	    int deletedId = response.jsonPath().getInt("id");
	    Assert.assertTrue("Deleted ID should be greater than 0", deletedId > 0);
	}


}

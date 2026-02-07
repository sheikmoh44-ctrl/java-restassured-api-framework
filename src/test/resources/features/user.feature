Feature: Product API testing

  Background:
    Given user sets the base request

  Scenario: Get all products
    When user sends GET request to get all products
    Then user should get status code 200
    And response should contain list of products

  Scenario: Get single product by id
    When user sends GET request to get product with id 1
    Then user should get status code 200
    And response should contain product details with id 1

  Scenario: Create a new product
    When user sends POST request to create a product
    Then user should get status code 201
    And response should contain created product details

  Scenario: Update an existing product
    When user sends PUT request to update product with id 1
    Then user should get status code 200
    And response should contain updated product details

  Scenario: Delete a product
    When user sends DELETE request to delete product with id 1
    Then user should get status code 200
    And product should be deleted successfully
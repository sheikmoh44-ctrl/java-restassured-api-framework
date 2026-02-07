package com.sheik.api.payload;

import java.util.HashMap;
import java.util.Map;

public class Product {

	public static Map<String, Object> createProductPayload() {

		Map<String, Object> payload = new HashMap<>();

		payload.put("title", "Automation Test Product");
		payload.put("price", 999.99);
		payload.put("description", "Product created using Rest Assured automation");
		payload.put("image", "https://i.pravatar.cc");
		payload.put("category", "electronics");

		return payload;
	}

	public static Map<String, Object> updateProductPayload() {

		Map<String, Object> payload = new HashMap<>();

		payload.put("title", "Updated Automation Product");
		payload.put("price", 1499.99);
		payload.put("description", "Updated using PUT API");
		payload.put("image", "https://i.pravatar.cc");
		payload.put("category", "electronics");

		return payload;
	}

}

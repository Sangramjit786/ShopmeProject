package com.shopme.checkout.paypal;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class PayPalApiTests {
	private static final String BASE_URL = "https://api.sandbox.paypal.com";
	private static final String GET_ORDER_API = "/v2/checkout/orders/";
//	private static final String CLIENT_ID = "PAYPAL_CLIENT_ID";
//	private static final String CLIENT_SECRET = "PAYPAL_CLIENT_SECRET";
	
	private static final String CLIENT_ID = "AXXRMTNI3KO_o96i0e_RJYlVY2a-fmUsoAM7Cve3z8SreWpdwlAxWzYWH5u9GByaKStBbhXm1edlkuK1";
	private static final String CLIENT_SECRET = "ENVS21FpCJIlO6ehttpTlKLFPwbjds-K1MVGq7KrixgLIcEyOG1HSJ4IIgbd6ws5ZbadQJrQZHJ65Lfr";
	
	@Test
	public void testGetOrderDetails() {
		String orderId = "5L0128511Y273332B";
		String requestURL = BASE_URL + GET_ORDER_API + orderId;
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Accept-Language", "en_US");
		headers.setBasicAuth(CLIENT_ID, CLIENT_SECRET);
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<PayPalOrderResponse> response = restTemplate.exchange(
				requestURL, HttpMethod.GET, request, PayPalOrderResponse.class);
		PayPalOrderResponse orderResponse = response.getBody();
		
		
		System.out.println("Response: " + orderResponse);
		System.out.println("Order ID: " + orderResponse.getId());
		System.out.println("Validated: " + orderResponse.validate(orderId));
		
	}
}

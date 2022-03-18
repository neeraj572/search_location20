package com.search.restClient;

import org.springframework.web.client.RestTemplate;

import com.search.dto.Location;

public class RestClient {
	public Location retrieveLocation(long id) {
		RestTemplate restTemplate=new RestTemplate();
		Location forObject = restTemplate.getForObject("http://localhost:8080/findLocation/"+id,Location.class);
		return forObject;
	}

}

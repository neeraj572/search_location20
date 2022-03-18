package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.dto.Location;
import com.search.restClient.RestClient;
import com.search.util.LocationNotFound;

@Controller
public class searchController {
	@RequestMapping("/search")
	public String loadSearchLocation() {
		return "searchLocation";
	}
	
	@RequestMapping("/find")
	public String findLocation(@RequestParam("id") Long id,ModelMap modelMap) {
		if(id==0){
			throw new LocationNotFound();
		}
		RestClient restClient=new RestClient();
		Location retrieveLocation = restClient.retrieveLocation(id);
		modelMap.addAttribute("locations",retrieveLocation);
		return "searchLocation";
	}

}

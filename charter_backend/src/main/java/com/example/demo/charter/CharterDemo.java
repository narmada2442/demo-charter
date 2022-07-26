package com.example.demo.charter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Response;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CharterDemo {
	@Autowired
	PurchaseService purchaseService;
	
	@GetMapping("/getDetails")
	public List<Response> getRewards() {
		
		List<Response> list = new ArrayList<Response>();
				
		list.add(new Response("John","February",0.0,100));
		list.add(new Response("David","March",0.0,170));
		list.add(new Response("Mark","April",0.0,60));
		
		List<Response> response =   purchaseService.getRewards(list);
		
		return response;
		
	}
	

}

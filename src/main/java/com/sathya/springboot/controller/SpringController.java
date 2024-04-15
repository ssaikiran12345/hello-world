package com.sathya.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sathya.springboot.postal.postalapipin;
import com.sathya.springboot.quates.Quoates;


@RestController
public class SpringController {
	
@GetMapping("/quoats")
public ResponseEntity<Quoates>  quoatesapi() {
	String url="https://dummyjson.com/quotes";
	RestTemplate restTemplate=new RestTemplate();
	ResponseEntity<Quoates> res=restTemplate.getForEntity(url, Quoates.class);
	return res;
}
  //website name weatherapi
  @GetMapping("/weather/{location}")
  public ResponseEntity<String> weatherapi(@PathVariable String location){
	  String url="http://api.weatherapi.com/v1/current.json?key=499a131db6da4d6f880132636240804&q="+location+"&aqi=no";
	  RestTemplate restTemplate=new RestTemplate();
	  ResponseEntity<String> res=restTemplate.getForEntity(url , String.class);
	  return res;
  }
    // website name postalapi
  @GetMapping("/postal55/{pin}")
  public ResponseEntity<postalapipin> postalapi11(@PathVariable int pin){
	  String url="https://api.postalpincode.in/pincode/"+pin;
	  RestTemplate restTemplate=new RestTemplate();
	  ResponseEntity<postalapipin> res=restTemplate.getForEntity(url , postalapipin.class);
	  return res;
  }
    
  }



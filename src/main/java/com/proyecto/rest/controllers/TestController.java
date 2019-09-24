package com.proyecto.rest.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.rest.beans.Persona;
import com.proyecto.rest.beans.TestResponse;

@RestController
@RequestMapping(path = "/rest/test")
public class TestController {
//	  @RequestMapping(method = RequestMethod.GET, value="/rest/test")
//
//	  @ResponseBody
	@GetMapping(path="/r", produces = "application/json")
	  public TestResponse testGet() {
		  TestResponse response = new TestResponse();
		  response.setResponse("Respuesta chida");
		  return response;
	  }
	
	 @PostMapping(path= "/p", consumes = "application/json", produces = "application/json")
	 public TestResponse testPost(@RequestBody Persona request) {
		 TestResponse response = new TestResponse();
		 response.setResponse("Hola "+ request.getNombre()+ " tu tienes " + request.getEdad() + "años");
		 return response;
		 
	 }
}

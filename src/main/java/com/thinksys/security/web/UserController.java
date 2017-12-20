package com.thinksys.security.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({ "user" })
public class UserController {
	

	
	@RequestMapping(value = { "failedAuthentication" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.GET })
	public ResponseEntity<String> failedAuth() {

		return new ResponseEntity<String>(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
	}

	 
	
}

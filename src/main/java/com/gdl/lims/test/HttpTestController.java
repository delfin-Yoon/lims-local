package com.gdl.lims.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.model.User;

@RestController
public class HttpTestController {

	@GetMapping("/http/get")
	public String getTest(User u) {
		return "getTest(): " + u.getId() + ", " + u.getPassword() + ", " + u.getName() + ", " + u.getEmail() + ", " + u.getPhone();
	}
	
	@PostMapping("/http/post")
	public String postTest(@RequestBody User u) {
		return "postTest(): " + u.getId() + ", " + u.getPassword() + ", " + u.getName() + ", " + u.getEmail() + ", " + u.getPhone();
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "putTest()";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "deleteTest()";
	}
	
}

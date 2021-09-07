package com.gdl.lims.httptest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.member.dto.MemberDto;

@RestController
public class HttpTestController {

	@GetMapping("/http/get")
	public String getTest(MemberDto u) {
		return "getTest(): " + u.getUserId() + ", " + u.getUserPwd() + ", " + u.getUserName() + ", " + u.getEmail() + ", " + u.getPhone();
	}
	
	@PostMapping("/http/post")
	public String postTest(@RequestBody MemberDto u) {
		return "postTest(): " + u.getUserId() + ", " + u.getUserPwd() + ", " + u.getUserName() + ", " + u.getEmail() + ", " + u.getPhone();
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

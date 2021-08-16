package com.gdl.lims.model;

import lombok.Data;

@Data
public class User {
	
	// 로그인ID
	private String id;
	
	// 비밀번호
	private String password;

	// 이름
	private String name;
	
	// 이메일
	private String email;
	
	// 전화번호
	private String phone;
	
	// 가입일
//	private Timestamp createDate;
//	private String creatDate;
}

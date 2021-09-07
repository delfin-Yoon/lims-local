package com.gdl.lims.member.dto;

import lombok.Data;

@Data
public class MemberDto {
	
	// 로그인ID
	private String userId;
	
	// 비밀번호
	private String userPwd;

	// 이름
	private String userName;
	
	// 이메일
	private String email;
	
	// 전화번호
	private String phone;
	
	// 가입일
//	private Timestamp createDate;
//	private String creatDate;
}

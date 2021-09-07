package com.gdl.lims.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.member.dto.MemberDto;
import com.gdl.lims.member.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 회원정보 목록 조회
	 * 
	 * @param
	 * @return 회원정보 목록
	 */
	@GetMapping("/users")
	public List<MemberDto> selectUserList() {
		return memberService.selectMemberList();
	}
}

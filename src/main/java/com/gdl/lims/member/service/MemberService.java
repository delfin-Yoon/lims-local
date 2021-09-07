package com.gdl.lims.member.service;

import java.util.List;

import com.gdl.lims.member.dto.MemberDto;


public interface MemberService {

	/**
	 * 회원종보목록 조회
	 * 
	 * @return 회원정보목록
	 */
	public List<MemberDto> selectMemberList();
	
}

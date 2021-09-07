package com.gdl.lims.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gdl.lims.member.dto.MemberDto;

@Mapper
public interface MemberDao {

	/**
	 * 회원정보 목록 조회
	 * 
	 * @param
	 * @return 회원정보 목록
	 */
	List<MemberDto> selectMemberList();
}

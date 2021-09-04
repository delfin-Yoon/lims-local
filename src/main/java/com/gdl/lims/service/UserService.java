package com.gdl.lims.service;

import java.util.List;

import com.gdl.lims.model.UserDto;


public interface UserService {

	/**
	 * 회원종보목록 조회
	 * 
	 * @return 회원정보목록
	 */
	public List<UserDto> selectUserList();
	
}

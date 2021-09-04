package com.gdl.lims.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gdl.lims.model.UserDto;

@Mapper
public interface UserMapper {

	/**
	 * 회원정보 목록 조회
	 * 
	 * @param
	 * @return 회원정보 목록
	 */
	List<UserDto> selectUserList();
}

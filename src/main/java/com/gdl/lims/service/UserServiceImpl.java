package com.gdl.lims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.lims.mapper.UserMapper;
import com.gdl.lims.model.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserDto> selectUserList() {
		return userMapper.selectUserList();
	}

}

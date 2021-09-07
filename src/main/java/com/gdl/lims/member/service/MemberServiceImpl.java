package com.gdl.lims.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.lims.member.dao.MemberDao;
import com.gdl.lims.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberMapper;
	
	@Override
	public List<MemberDto> selectMemberList() {
		return memberMapper.selectMemberList();
	}

}

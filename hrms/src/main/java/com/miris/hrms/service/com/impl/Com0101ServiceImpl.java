package com.miris.hrms.service.com.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.miris.hrms.service.com.Com0101Service;
import com.miris.hrms.service.com.mapper.Com0101Mapper;
import com.miris.hrms.service.com.vo.ManagerVO;

@Service
public class Com0101ServiceImpl implements Com0101Service {

	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	Com0101Mapper mapper;
	
	@Override
	public boolean userLoginIn(ManagerVO manager) throws Exception {
		String encPasswd = passwordEncoder.encode(manager.getAdm_pw());
		manager.setAdm_pw(encPasswd);
		
		ManagerVO rstVO = mapper.selectManagerInfo(manager);

		return false;
	}

}
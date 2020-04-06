package com.miris.hrms.service.com.mapper;

import com.miris.hrms.service.com.vo.ManagerVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("com0101Mapper")
public interface Com0101Mapper {
	
	ManagerVO selectManagerInfo(ManagerVO manager) throws Exception;

}

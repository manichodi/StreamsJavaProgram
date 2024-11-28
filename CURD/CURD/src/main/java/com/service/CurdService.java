package com.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.dto.CurdDto;

public interface CurdService {

	public void savecurd(CurdDto curd);

	public void delete(Integer id);

	public void delete(Integer id);
	
	

}

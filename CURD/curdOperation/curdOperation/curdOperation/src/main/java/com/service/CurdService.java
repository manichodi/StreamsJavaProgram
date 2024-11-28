package com.service;


import org.springframework.stereotype.Component;

import com.dto.CurdDto;
@Component
//@Service
public interface CurdService {
	
	public void savecurd(CurdDto curddto);
	
	public void updatecurd(CurdDto curddto ,int id);
	
	
	public void delete( Integer id);


	public CurdDto getId(Integer id);
		

}

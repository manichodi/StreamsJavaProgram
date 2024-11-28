package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.dto.CurdDto;
import com.repo.CurdRepo;
@Component
public class CurdServiceImpl implements CurdService {

	@Autowired
	CurdRepo repo;
	
	public void savecurd( CurdDto curddto) {
		repo.save(curddto);
	}
	public void delete( Integer id) {
		repo.deleteById(id);
	}


	
}

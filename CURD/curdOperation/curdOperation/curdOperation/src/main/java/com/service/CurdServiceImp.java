package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Component;

import com.dto.CurdDto;
import com.repo.CurdRepo;

@Service
//@Component
public class CurdServiceImp implements CurdService {
	@Autowired
	CurdRepo repo;

	public void savecurd(CurdDto curddto) {
		repo.save(curddto);
	}

	public void updatecurd(CurdDto curddtoinput, int id) {

		Optional<CurdDto> obj = repo.findById(id);
		CurdDto curdDto = obj.get();// which you got from db
		curdDto.setProgramming_language(curddtoinput.getProgramming_language());
		curdDto.setProject_name(curddtoinput.getProject_name());
		repo.save(curdDto);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public CurdDto getId(Integer id) {

		CurdDto curdDto = new CurdDto();
		Optional<CurdDto> obj = repo.findById(id);
		if (obj.isPresent()) {
			curdDto = obj.get();
		}

		return curdDto;
	}
}

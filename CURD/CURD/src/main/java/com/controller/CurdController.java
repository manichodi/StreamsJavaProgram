package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CurdDto;
import com.service.CurdService;

@RestController
public class CurdController {
	
	@Autowired
	CurdService serviceobj;
	
	@PostMapping("/saveCURD")
	public void savecurd(@RequestBody CurdDto curd) {
		serviceobj.savecurd(curd);
	}
	@DeleteMapping("/delete/{id}")

	public void delete(@PathVariable("id") Integer id) {
		 serviceobj.delete(id);
	}



}

package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CurdDto;
import com.service.CurdService;

@RestController
public class CurdController {

	@Autowired
	CurdService curdservice;

	@PostMapping("/savecurd")
	public void savecurd(@RequestBody CurdDto curddto) {
		// System.out.println("save");
		curdservice.savecurd(curddto);

	}

	@PutMapping("/update/{id}")
	public void updatecurd(@RequestBody CurdDto curddto, @PathVariable("id") int id) {
		
		curdservice.updatecurd(curddto,id);
	}
	@DeleteMapping("/delete/{id}")

	public void delete(@PathVariable("id") Integer id) {
		curdservice.delete(id);
	}
	
	@GetMapping("/getcurd")
	public CurdDto getapplication(@RequestParam Integer id) {
		  
		return curdservice.getId(id);
	}

}

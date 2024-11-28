package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dto.ClgDto;
@Repository
public interface CurdRepo extends JpaRepository<ClgDto, Integer>{

	

}

package com.placement.attendance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.attendance.model.MentorDetailModel;

public interface MentorDetailRepo extends JpaRepository<MentorDetailModel,Integer>{
	
}

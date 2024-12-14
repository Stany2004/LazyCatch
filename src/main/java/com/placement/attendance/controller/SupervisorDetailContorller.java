package com.placement.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.placement.attendance.model.SupervisorDetailModel;
import com.placement.attendance.repo.SupervisiorDetailRepo;

@RestController
public class SupervisorDetailContorller {

	@Autowired
	private SupervisiorDetailRepo superrepo;
	
	
	@GetMapping("/sdetail")
	public List<SupervisorDetailModel> getMentorDetail()
	{
		List<SupervisorDetailModel> supervisorlist = superrepo.findAll();
		return supervisorlist;
	}
}

package com.placement.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placement.attendance.model.MentorDetailModel;
import com.placement.attendance.repo.MentorDetailRepo;

@RestController
public class MentorDetailController {

	@Autowired
	private MentorDetailRepo mentorrepo;
	
	
	@GetMapping("/mdetail")
	public List<MentorDetailModel> getMentorDetail()
	{
		List<MentorDetailModel> mentorlist = mentorrepo.findAll();
		return mentorlist;
	}
}

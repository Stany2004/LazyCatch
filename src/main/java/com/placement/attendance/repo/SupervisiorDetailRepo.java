package com.placement.attendance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.attendance.model.SupervisorDetailModel;

public interface SupervisiorDetailRepo extends JpaRepository<SupervisorDetailModel,Integer> {

}

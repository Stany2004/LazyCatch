package com.placement.attendance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.attendance.model.MasterDetailModel;

public interface MasterDetailRepo extends JpaRepository<MasterDetailModel,String>{

}

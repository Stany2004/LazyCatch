package com.placement.attendance.model;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@Table(name="mstmentordetail")
public class MentorDetailModel {
	
	@Id
	private int mentorid;
	private String mentorname;
    private String mentormailid;
    private Boolean mentorisactive;
    private Date mentorcreatedate;
    private Date mentormodifieddate;
    
    
    @OneToMany(mappedBy = "mentor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MasterDetailModel> students;
}

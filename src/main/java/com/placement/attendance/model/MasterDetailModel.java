package com.placement.attendance.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="trnmasterdetail")
public class MasterDetailModel {
	@Id
	private String studentregno;
    private String studentname;
    private String studentmailid;
    
    @ManyToOne
    @JoinColumn(name = "mentorid", referencedColumnName = "mentorid", nullable = false)
    private MentorDetailModel mentor;
    
    
    @ManyToOne
    @JoinColumn(name = "supervisorid", referencedColumnName = "supervisorid", nullable = false)
    private SupervisorDetailModel supervisor;
    
    
    
    private Boolean studentisactive;
    private Date studentcreatedate;
    private Date studentmodifieddate;
	
}

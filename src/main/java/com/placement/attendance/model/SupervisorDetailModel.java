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
@Table(name="mstsupervisordetail")
public class SupervisorDetailModel {
	@Id
	private int supervisorid;
	private String supervisorname;
    private String supervisormailid;
    private Boolean supervisorisactive;
    private Date supervisorcreatedate;
    private Date supervisormodifieddate;
    
    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MasterDetailModel> students;
    
}

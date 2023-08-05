package com.ikn.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "status_tab")
public class Status {
	
	@Id
	@SequenceGenerator(name = "status_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "status_gen")
	private Integer id;
	private String response;
	private String time;

}

package com.ikn.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "start_tab")
public class Start {
	
	@Id
	@SequenceGenerator(name = "start_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "start_gen")
	private Integer id;
	private String timeZone;
	private String dateTime;
}

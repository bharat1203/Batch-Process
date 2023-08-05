package com.ikn.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "end_tab")
public class End {
	
	@Id
	@SequenceGenerator(name = "end_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "end_gen")
	private Integer id;
	private String timeZone;
	private String dateTime;

	
}


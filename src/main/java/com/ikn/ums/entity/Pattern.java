package com.ikn.ums.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pattern_tab")
public class Pattern {
	
	@Id
	@SequenceGenerator(name = "pattern_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "pattern_gen")
	private Integer id;
	private String type;
	private Integer interval;
	private Integer month;
	private Integer dayOfMonth;
	private String firstdayOfWeek;
	@Column(name = "index_col")
	private String index;
	private String[] daysOfWeek;

}

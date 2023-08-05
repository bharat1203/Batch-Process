package com.ikn.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "location_tab")
public class Location {
	
	@Id
	@SequenceGenerator(name = "location_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "location_gen")
	private Integer id;
	
	private String displayName;
	
	private String locationType;
	
	private String uniquerId;
	
	private String uniqueIdType;
	
}

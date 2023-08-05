package com.ikn.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "emailaddress_tab")
public class EmailAddress {
	
	@Id
	@SequenceGenerator(name = "emailaddress_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "emailaddress_gen")
	private Integer id;
	private String name;
	private String address;

	
}

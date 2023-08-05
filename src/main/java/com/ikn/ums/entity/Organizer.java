package com.ikn.ums.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "organizer_tab")
public class Organizer {
	
	@Id
	@SequenceGenerator(name = "organizer_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "organizer_gen")
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "emailaddress_fk_id", referencedColumnName = "id", unique = true)
	private EmailAddress emailAddress;
	
	
}

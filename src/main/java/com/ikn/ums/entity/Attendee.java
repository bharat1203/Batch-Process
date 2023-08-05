package com.ikn.ums.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Attendee {
	
	@Id
	@SequenceGenerator(name = "attendess_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "attendess_gen")
	private Integer id;
	private String type;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER,optional = false, targetEntity = EmailAddress.class)
	@JoinColumn(name = "status_fk_id", nullable = true, referencedColumnName = "id", unique = true)
	private Status status;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER,optional = false, targetEntity = EmailAddress.class)
	@JoinColumn(name = "email_fk_id", nullable = false, referencedColumnName = "id", unique = true)
	private EmailAddress emailAddress;

}

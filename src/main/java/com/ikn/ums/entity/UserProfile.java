package com.ikn.ums.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
//@Entity
public class UserProfile {
	
	@Id
	@SequenceGenerator(name = "user_profile_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "user_profile_gen")
	private Integer id;
	private String userId;
	private String userPrincipalName;
	private String displayName;
	private String givenName;
	private String department;
	private String mail;
	private String mobilePhone;
	private String jobTitle;
	private String surname;
	
}

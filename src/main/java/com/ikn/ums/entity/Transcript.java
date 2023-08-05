package com.ikn.ums.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Transcript {
	
	@Id
	@SequenceGenerator(name = "transcript_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "transcript_gen")
	private Integer id;
	private String transcriptId;
	private String meetingId;
	private String meetingOrganizerId;
	@Column(length = 500)
	private String transcriptContentUrl;
	private String createdDateTime;
	private String transcriptFilePath;
	
}

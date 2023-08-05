package com.ikn.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

//@Entity
@Data
public class TranscriptContent {

	@Id
	@SequenceGenerator(name = "transcript_content_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "transcript_content_gen")
	private Integer id;
	private String transcriptFilePath;

}

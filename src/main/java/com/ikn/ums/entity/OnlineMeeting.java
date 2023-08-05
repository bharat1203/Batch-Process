package com.ikn.ums.entity;

import java.util.List;

import com.ikn.ums.dto.TranscriptDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "online_meeting_tab")
public class OnlineMeeting {
	
	@Id
	@SequenceGenerator(name = "onlinemeeting_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "onlinemeeting_gen")
	private Integer id;
	
	private String onlineMeetingId;
	
	private String subject;
	
	private String joinUrl;
	
	private String occurrenceId;
	
	private String onlineMeetingType;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "meeting_fk_id",nullable = true)
	private List<Transcript> meetingTranscripts;
}

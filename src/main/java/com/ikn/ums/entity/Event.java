package com.ikn.ums.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "event_tab")
public class Event {

	@Id
	@SequenceGenerator(name = "events_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "events_gen")
	private Integer id;
	
	private String userId;
	
	private String userPrinicipalName;
	
	private String eventId;
	
	private String eventCreatedDateTime;
	
	private String originalStartTimeZone;
	
	private String originalEndTimeZone;
	
	private String subject;
	
	private String type;
	
	private String occurrenceId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "start_fk_id", referencedColumnName = "id",unique = true)
	private Start start;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "end_fk_id", referencedColumnName = "id",unique = true)
	private End end;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "location_fk_id", referencedColumnName = "id", unique = true, nullable = true)
	private Location location;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "attendee_id", referencedColumnName = "id",unique = true, nullable = false)
	private List<Attendee> attendee;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "organizer_fk_id", referencedColumnName = "id", unique = true)
	private Organizer organizer;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "onlineMeeting_fk_id", referencedColumnName = "id", unique = true)
	private OnlineMeeting onlineMeeting;
    
	private String onlineMeetingProvider;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "recurrence_fk_id", referencedColumnName = "id", unique = true, nullable = true)
	private Recurrence recurrence;
	
	private String seriesMasterId;
	
	private String insertedBy = "IKCON UMS";
    
    private String insertedDate = LocalDateTime.now().toString();

}

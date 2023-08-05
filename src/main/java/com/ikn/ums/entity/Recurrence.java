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
@Table(name = "recurrence_tab")
public class Recurrence {
	
	@Id
	@SequenceGenerator(name = "recurrence_gen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "recurrence_gen")
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pattern_fk_id", referencedColumnName = "id", unique = true,nullable = true)
	private Pattern pattern;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "range_fk_id", referencedColumnName = "id", unique = true, nullable = true)
	private Range range;


}

package com.rs.ies.ri.co.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="co_triggers")
@Data
public class CoTrigger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="trg_id")
	private Integer trgId;
	@Column(name="case_num")
	private Integer caseNo;
	@Column(name="create_dt")
	private LocalDate createDate;
	@Column(name="trg_status")
	private String trgStatus;
	@Column(name="update_dt")
	private LocalDate updateDate;
}

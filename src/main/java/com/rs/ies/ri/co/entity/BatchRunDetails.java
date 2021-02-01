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
@Table(name = "CO_BATCH_RUN_DTLS")
@Data
public class BatchRunDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchSeqNo;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunstatus;
	@Column(name = "START_DATE")
	private LocalDate startDate;
	@Column(name = "END_DATE")
	private LocalDate endDate;
	@Column(name = "INSTANCE_NUM")
	private Integer instanceNum;

}

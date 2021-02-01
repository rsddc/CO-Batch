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
@Table(name = "eligibility_details")
@Data
public class EligibilityDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ED_TRACE_ID")
	private Integer traceId;
	@Column(name="benefit_amt")
	private Double benifitAmt;
	@Column(name="case_num")
	private Integer caseNo;
	@Column(name="create_dt")
	private LocalDate createDate;
	@Column(name="denial_reason")
	private String denialRsn;
	@Column(name="plan_end_dt")
	private LocalDate planEndDate;
	@Column(name="plan_name")
	private String planName;
	@Column(name="plan_start_dt")
	private LocalDate planStartDate;
	@Column(name="plan_status")
	private String planStatus;
	@Column(name="update_dt")
	private LocalDate updateDate;
	

}

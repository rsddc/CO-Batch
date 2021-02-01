package com.rs.ies.ri.co.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_PDFS")
@Data
public class CoPdfs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	@Column(name = "PLAN_NAME")
	private String planName;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "PDF_DOCUMENT")
	private Byte[] pdfDocument;
	@Column(name = "case_num")
	private Integer caseNo;

}

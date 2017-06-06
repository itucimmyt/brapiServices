package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the file_cabinet database table.
 * 
 */
@Entity
@Table(name="file_cabinet", schema="operational")
@NamedQuery(name="FileCabinet.findAll", query="SELECT f FROM FileCabinet f")
public class FileCabinet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	private String files;

	@Column(name="folder_name")
	private String folderName;

	@Column(name="folder_path")
	private String folderPath;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String remarks;

	private String source;

	@Column(name="transaction_id")
	private Integer transactionId;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	public FileCabinet() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreationTimestamp() {
		return this.creationTimestamp;
	}

	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public String getFiles() {
		return this.files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getFolderName() {
		return this.folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public String getFolderPath() {
		return this.folderPath;
	}

	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public Integer getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

}
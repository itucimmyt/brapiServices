package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the study_task_definition database table.
 * 
 */
@Entity
@Table(name="study_task_definition", schema="operational")
@NamedQuery(name="StudyTaskDefinition.findAll", query="SELECT s FROM StudyTaskDefinition s")
public class StudyTaskDefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	private String remarks;
/*
	@Column(name="task_definition")
	private Object taskDefinition;
*/
	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	public StudyTaskDefinition() {
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

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
/*
	public Object getTaskDefinition() {
		return this.taskDefinition;
	}

	public void setTaskDefinition(Object taskDefinition) {
		this.taskDefinition = taskDefinition;
	}
*/
	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

}
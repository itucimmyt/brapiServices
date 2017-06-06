package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the field_layout_study_metadata database table.
 * 
 */
@Entity
@Table(name="field_layout_study_metadata", schema="operational")
@NamedQuery(name="FieldLayoutStudyMetadata.findAll", query="SELECT f FROM FieldLayoutStudyMetadata f")
public class FieldLayoutStudyMetadata implements Serializable {
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

	private String remarks;

	private String value;

	@Column(name="variable_id")
	private Integer variableId;

	//bi-directional many-to-one association to FieldLayoutStudy
	@ManyToOne
	@JoinColumn(name="field_layout_study_id")
	private FieldLayoutStudy fieldLayoutStudy;

	public FieldLayoutStudyMetadata() {
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getVariableId() {
		return this.variableId;
	}

	public void setVariableId(Integer variableId) {
		this.variableId = variableId;
	}

	public FieldLayoutStudy getFieldLayoutStudy() {
		return this.fieldLayoutStudy;
	}

	public void setFieldLayoutStudy(FieldLayoutStudy fieldLayoutStudy) {
		this.fieldLayoutStudy = fieldLayoutStudy;
	}

}
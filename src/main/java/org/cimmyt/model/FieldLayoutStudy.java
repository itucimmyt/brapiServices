package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the field_layout_study database table.
 * 
 */
@Entity
@Table(name="field_layout_study", schema="operational")
@NamedQuery(name="FieldLayoutStudy.findAll", query="SELECT f FROM FieldLayoutStudy f")
public class FieldLayoutStudy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="field_layout_status")
	private String fieldLayoutStatus;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String remarks;

	//bi-directional many-to-one association to FieldLayout
	@ManyToOne
	@JoinColumn(name="field_layout_id")
	private FieldLayout fieldLayout;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to FieldLayoutStudyMetadata
	@OneToMany(mappedBy="fieldLayoutStudy")
	private List<FieldLayoutStudyMetadata> fieldLayoutStudyMetadata;

	public FieldLayoutStudy() {
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

	public String getFieldLayoutStatus() {
		return this.fieldLayoutStatus;
	}

	public void setFieldLayoutStatus(String fieldLayoutStatus) {
		this.fieldLayoutStatus = fieldLayoutStatus;
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

	public FieldLayout getFieldLayout() {
		return this.fieldLayout;
	}

	public void setFieldLayout(FieldLayout fieldLayout) {
		this.fieldLayout = fieldLayout;
	}

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	public List<FieldLayoutStudyMetadata> getFieldLayoutStudyMetadata() {
		return this.fieldLayoutStudyMetadata;
	}

	public void setFieldLayoutStudyMetadata(List<FieldLayoutStudyMetadata> fieldLayoutStudyMetadata) {
		this.fieldLayoutStudyMetadata = fieldLayoutStudyMetadata;
	}

	public FieldLayoutStudyMetadata addFieldLayoutStudyMetadata(FieldLayoutStudyMetadata fieldLayoutStudyMetadata) {
		getFieldLayoutStudyMetadata().add(fieldLayoutStudyMetadata);
		fieldLayoutStudyMetadata.setFieldLayoutStudy(this);

		return fieldLayoutStudyMetadata;
	}

	public FieldLayoutStudyMetadata removeFieldLayoutStudyMetadata(FieldLayoutStudyMetadata fieldLayoutStudyMetadata) {
		getFieldLayoutStudyMetadata().remove(fieldLayoutStudyMetadata);
		fieldLayoutStudyMetadata.setFieldLayoutStudy(null);

		return fieldLayoutStudyMetadata;
	}

}
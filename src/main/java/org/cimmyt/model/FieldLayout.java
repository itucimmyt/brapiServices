package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the field_layout database table.
 * 
 */
@Entity
@Table(name="field_layout", schema="operational")
@NamedQuery(name="FieldLayout.findAll", query="SELECT f FROM FieldLayout f")
public class FieldLayout implements Serializable {
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

	private String name;

	private String remarks;

	//bi-directional many-to-one association to FieldLayoutMetadata
	@OneToMany(mappedBy="fieldLayout")
	private List<FieldLayoutMetadata> fieldLayoutMetadata;

	//bi-directional many-to-one association to FieldLayoutStudy
	@OneToMany(mappedBy="fieldLayout")
	private List<FieldLayoutStudy> fieldLayoutStudies;

	public FieldLayout() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<FieldLayoutMetadata> getFieldLayoutMetadata() {
		return this.fieldLayoutMetadata;
	}

	public void setFieldLayoutMetadata(List<FieldLayoutMetadata> fieldLayoutMetadata) {
		this.fieldLayoutMetadata = fieldLayoutMetadata;
	}

	public FieldLayoutMetadata addFieldLayoutMetadata(FieldLayoutMetadata fieldLayoutMetadata) {
		getFieldLayoutMetadata().add(fieldLayoutMetadata);
		fieldLayoutMetadata.setFieldLayout(this);

		return fieldLayoutMetadata;
	}

	public FieldLayoutMetadata removeFieldLayoutMetadata(FieldLayoutMetadata fieldLayoutMetadata) {
		getFieldLayoutMetadata().remove(fieldLayoutMetadata);
		fieldLayoutMetadata.setFieldLayout(null);

		return fieldLayoutMetadata;
	}

	public List<FieldLayoutStudy> getFieldLayoutStudies() {
		return this.fieldLayoutStudies;
	}

	public void setFieldLayoutStudies(List<FieldLayoutStudy> fieldLayoutStudies) {
		this.fieldLayoutStudies = fieldLayoutStudies;
	}

	public FieldLayoutStudy addFieldLayoutStudy(FieldLayoutStudy fieldLayoutStudy) {
		getFieldLayoutStudies().add(fieldLayoutStudy);
		fieldLayoutStudy.setFieldLayout(this);

		return fieldLayoutStudy;
	}

	public FieldLayoutStudy removeFieldLayoutStudy(FieldLayoutStudy fieldLayoutStudy) {
		getFieldLayoutStudies().remove(fieldLayoutStudy);
		fieldLayoutStudy.setFieldLayout(null);

		return fieldLayoutStudy;
	}

}
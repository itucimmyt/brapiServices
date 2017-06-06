package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the temp_data database table.
 * 
 */
@Entity
@Table(name="temp_data", schema="operational")
@NamedQuery(name="TempData.findAll", query="SELECT t FROM TempData t")
public class TempData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="entity_id")
	private Integer entityId;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="model_name")
	private String modelName;

	@Column(name="modification_timestamp")
	private Time modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	@Column(name="record_id")
	private Integer recordId;

	private Integer remarks;

	@Column(name="schema_name")
	private String schemaName;

	@Column(name="table_name")
	private String tableName;

	private String value;

	@Column(name="variable_id")
	private Integer variableId;

	public TempData() {
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

	public Integer getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Time getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Time modificationTimestamp) {
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

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getRemarks() {
		return this.remarks;
	}

	public void setRemarks(Integer remarks) {
		this.remarks = remarks;
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
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

}
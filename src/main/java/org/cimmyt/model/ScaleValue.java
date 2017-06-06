package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the scale_value database table.
 * @author RHTOLEDO
 * @version 1.0
 */

@Entity
@Table(schema="master",name="scale_value")
@NamedQuery(name="ScaleValue.findAll", query="SELECT s FROM ScaleValue s")
public class ScaleValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private String description;

	@Column(name="display_name")
	private String displayName;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String notes;

	@Column(name="order_number")
	private Integer orderNumber;

	private String remarks;

	@Column(name="scale_value_status")
	private String scaleValueStatus;

	private String value;

	//bi-directional many-to-one association to Scale
	@ManyToOne
	private Scale scale;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to VariableRelationValue
	//@OneToMany(mappedBy="scaleValue1")
	//private List<VariableRelationValue> variableRelationValues1;

	//bi-directional many-to-one association to VariableRelationValue
	//@OneToMany(mappedBy="scaleValue2")
	//private List<VariableRelationValue> variableRelationValues2;

	public ScaleValue() {
	}
	
	public ScaleValue(Integer scaleId){
		this.scale = new Scale(scaleId);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getScaleValueStatus() {
		return this.scaleValueStatus;
	}

	public void setScaleValueStatus(String scaleValueStatus) {
		this.scaleValueStatus = scaleValueStatus;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Scale getScale() {
		return this.scale;
	}

	public void setScale(Scale scale) {
		this.scale = scale;
	}

	//public User getUser1() {
	//	return this.user1;
	//}

	//public void setUser1(User user1) {
	//	this.user1 = user1;
	//}

	//public User getUser2() {
	//	return this.user2;
	//}

	//public void setUser2(User user2) {
	//	this.user2 = user2;
	//}

	//public List<VariableRelationValue> getVariableRelationValues1() {
	//	return this.variableRelationValues1;
	//}

	//public void setVariableRelationValues1(List<VariableRelationValue> variableRelationValues1) {
	//	this.variableRelationValues1 = variableRelationValues1;
	//}

	//public VariableRelationValue addVariableRelationValues1(VariableRelationValue variableRelationValues1) {
	//	getVariableRelationValues1().add(variableRelationValues1);
	//	variableRelationValues1.setScaleValue1(this);

	//	return variableRelationValues1;
	//}

	//public VariableRelationValue removeVariableRelationValues1(VariableRelationValue variableRelationValues1) {
	//	getVariableRelationValues1().remove(variableRelationValues1);
	//	variableRelationValues1.setScaleValue1(null);

	//	return variableRelationValues1;
	//}

	//public List<VariableRelationValue> getVariableRelationValues2() {
	//	return this.variableRelationValues2;
	//}

	//public void setVariableRelationValues2(List<VariableRelationValue> variableRelationValues2) {
	//	this.variableRelationValues2 = variableRelationValues2;
	//}

	//public VariableRelationValue addVariableRelationValues2(VariableRelationValue variableRelationValues2) {
	//	getVariableRelationValues2().add(variableRelationValues2);
	//	variableRelationValues2.setScaleValue2(this);

	//	return variableRelationValues2;
	//}

	//public VariableRelationValue removeVariableRelationValues2(VariableRelationValue variableRelationValues2) {
	//	getVariableRelationValues2().remove(variableRelationValues2);
	//	variableRelationValues2.setScaleValue2(null);

	//	return variableRelationValues2;
	//}

}
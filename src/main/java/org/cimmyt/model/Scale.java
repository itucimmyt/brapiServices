package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the scale database table.
 * @author RHTOLEDO
 */

@Entity
@Table(schema="master")
@NamedQuery(name="Scale.findAll", query="SELECT s FROM Scale s")
public class Scale implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbrev;

	@Column(name="bibliographical_reference")
	private String bibliographicalReference;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private String description;

	@Column(name="display_name")
	private String displayName;

	@Column(name="is_void")
	private Boolean isVoid;

	private String level;

	@Column(name="method_id")
	private Integer methodId;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	@Column(name="ontology_id")
	private String ontologyId;

	@Column(name="property_id")
	private Integer propertyId;

	private String reference;

	private String remarks;

	@Column(name="scale_default_value")
	private String scaleDefaultValue;

	@Column(name="scale_value")
	private String scaleValue;

	@Column(name="scale_value_model")
	private String scaleValueModel;

	private String type;

	private String unit;

	//bi-directional many-to-one association to PropertyMethodScale
	//@OneToMany(mappedBy="scale")
	//private List<PropertyMethodScale> propertyMethodScales;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to ScaleValue
	@OneToMany(mappedBy="scale")
	private List<ScaleValue> scaleValues;

	//bi-directional many-to-one association to Variable
	//@OneToMany(mappedBy="scale")
	//private List<Variable> variables;

	public Scale() {
	}
	
	public Scale(Integer id){
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAbbrev() {
		return this.abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public String getBibliographicalReference() {
		return this.bibliographicalReference;
	}

	public void setBibliographicalReference(String bibliographicalReference) {
		this.bibliographicalReference = bibliographicalReference;
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

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getMethodId() {
		return this.methodId;
	}

	public void setMethodId(Integer methodId) {
		this.methodId = methodId;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOntologyId() {
		return this.ontologyId;
	}

	public void setOntologyId(String ontologyId) {
		this.ontologyId = ontologyId;
	}

	public Integer getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getScaleDefaultValue() {
		return this.scaleDefaultValue;
	}

	public void setScaleDefaultValue(String scaleDefaultValue) {
		this.scaleDefaultValue = scaleDefaultValue;
	}

	public String getScaleValue() {
		return this.scaleValue;
	}

	public void setScaleValue(String scaleValue) {
		this.scaleValue = scaleValue;
	}

	public String getScaleValueModel() {
		return this.scaleValueModel;
	}

	public void setScaleValueModel(String scaleValueModel) {
		this.scaleValueModel = scaleValueModel;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	//public List<PropertyMethodScale> getPropertyMethodScales() {
	//	return this.propertyMethodScales;
	//}

	//public void setPropertyMethodScales(List<PropertyMethodScale> propertyMethodScales) {
	//	this.propertyMethodScales = propertyMethodScales;
	//}

	//public PropertyMethodScale addPropertyMethodScale(PropertyMethodScale propertyMethodScale) {
	//	getPropertyMethodScales().add(propertyMethodScale);
	//	propertyMethodScale.setScale(this);

	//	return propertyMethodScale;
	//}

	//public PropertyMethodScale removePropertyMethodScale(PropertyMethodScale propertyMethodScale) {
	//	getPropertyMethodScales().remove(propertyMethodScale);
	//	propertyMethodScale.setScale(null);

	//	return propertyMethodScale;
	//}

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

	public List<ScaleValue> getScaleValues() {
		return this.scaleValues;
	}

	public void setScaleValues(List<ScaleValue> scaleValues) {
		this.scaleValues = scaleValues;
	}

	public ScaleValue addScaleValue(ScaleValue scaleValue) {
		getScaleValues().add(scaleValue);
		scaleValue.setScale(this);

		return scaleValue;
	}

	public ScaleValue removeScaleValue(ScaleValue scaleValue) {
		getScaleValues().remove(scaleValue);
		scaleValue.setScale(null);

		return scaleValue;
	}

	//public List<Variable> getVariables() {
	//	return this.variables;
	//}

	//public void setVariables(List<Variable> variables) {
	//	this.variables = variables;
	//}

	//public Variable addVariable(Variable variable) {
	//	getVariables().add(variable);
	//	variable.setScale(this);

	//	return variable;
	//}

	//public Variable removeVariable(Variable variable) {
	//	getVariables().remove(variable);
	//	variable.setScale(null);

	//	return variable;
	//}

}
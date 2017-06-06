package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the property database table.
 * 
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Property.findAll", query="SELECT p FROM Property p")
public class Property implements Serializable {
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

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	@Column(name="ontology_id")
	private String ontologyId;

	@Column(name="property_notes")
	private String propertyNotes;

	private String remarks;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to PropertyMethodScale
	//@OneToMany(mappedBy="property")
	//private List<PropertyMethodScale> propertyMethodScales;

	//bi-directional many-to-one association to Variable
	@OneToMany(mappedBy="property")
	private List<Variable> variables;

	public Property() {
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

	public String getPropertyNotes() {
		return this.propertyNotes;
	}

	public void setPropertyNotes(String propertyNotes) {
		this.propertyNotes = propertyNotes;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	//public List<PropertyMethodScale> getPropertyMethodScales() {
	//	return this.propertyMethodScales;
	//}

	//public void setPropertyMethodScales(List<PropertyMethodScale> propertyMethodScales) {
	//	this.propertyMethodScales = propertyMethodScales;
	//}

	//public PropertyMethodScale addPropertyMethodScale(PropertyMethodScale propertyMethodScale) {
	//	getPropertyMethodScales().add(propertyMethodScale);
	//	propertyMethodScale.setProperty(this);

	//	return propertyMethodScale;
	//}

	//public PropertyMethodScale removePropertyMethodScale(PropertyMethodScale propertyMethodScale) {
	//	getPropertyMethodScales().remove(propertyMethodScale);
	//	propertyMethodScale.setProperty(null);

	//	return propertyMethodScale;
	//}

	public List<Variable> getVariables() {
		return this.variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}

	public Variable addVariable(Variable variable) {
		getVariables().add(variable);
		variable.setProperty(this);

		return variable;
	}

	public Variable removeVariable(Variable variable) {
		getVariables().remove(variable);
		variable.setProperty(null);

		return variable;
	}

}
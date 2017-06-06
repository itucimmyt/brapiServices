package org.cimmyt.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;


/**
 * 
 * @author RHTOLEDO
 * @version 1.0
 * 
 * Note: Relationship code with others tables was commented.       
 */

@Entity
@Table(schema="master")
@NamedQuery(name="Program.findAll", query="SELECT p FROM Program p")
public class Program implements Serializable {
	
	public Program() {
	}	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbrev;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private String description;

	@Column(name="display_name")
	private String displayName;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="level_type")
	private Integer levelType;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	@Column(name="program_status")
	private String programStatus;

	private String remarks;

	private String type;

	//bi-directional many-to-one association to ItemServiceTeam
	//@OneToMany(mappedBy="program")
	//private List<ItemServiceTeam> itemServiceTeams;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="program")
	private List<Product> products;

	//bi-directional many-to-one association to Pipeline
	//@ManyToOne
	//private Pipeline pipeline;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to ProgramMetadata
	//@OneToMany(mappedBy="program")
	//private List<ProgramMetadata> programMetadata;

	//bi-directional many-to-one association to ProgramPlace
	//@OneToMany(mappedBy="program")
	//private List<ProgramPlace> programPlaces;

	//bi-directional many-to-one association to ProgramRelation
	//@OneToMany(mappedBy="program1")
	//private List<ProgramRelation> programRelations1;

	//bi-directional many-to-one association to ProgramRelation
	//@OneToMany(mappedBy="program2")
	//private List<ProgramRelation> programRelations2;

	//bi-directional many-to-one association to ProgramRole
	//@OneToMany(mappedBy="program")
	//private List<ProgramRole> programRoles;

	//bi-directional many-to-one association to ProgramTeam
	//@OneToMany(mappedBy="program")
	//private List<ProgramTeam> programTeams;

	//bi-directional many-to-one association to ProgramTvp
	//@OneToMany(mappedBy="program")
	//private List<ProgramTvp> programTvps;

	//bi-directional many-to-one association to ProgramVariableSet
	//@OneToMany(mappedBy="program")
	//private List<ProgramVariableSet> programVariableSets;

	//bi-directional many-to-one association to ProgramYearSequence
	//@OneToMany(mappedBy="program")
	//private List<ProgramYearSequence> programYearSequences;

	//bi-directional many-to-one association to Service
	//@OneToMany(mappedBy="program")
	//private List<Service> services;



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

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public Integer getLevelType() {
		return this.levelType;
	}

	public void setLevelType(Integer levelType) {
		this.levelType = levelType;
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

	public String getProgramStatus() {
		return this.programStatus;
	}

	public void setProgramStatus(String programStatus) {
		this.programStatus = programStatus;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//public List<ItemServiceTeam> getItemServiceTeams() {
	//	return this.itemServiceTeams;
	//}

	//public void setItemServiceTeams(List<ItemServiceTeam> itemServiceTeams) {
	//	this.itemServiceTeams = itemServiceTeams;
	//}

	//public ItemServiceTeam addItemServiceTeam(ItemServiceTeam itemServiceTeam) {
	//	getItemServiceTeams().add(itemServiceTeam);
	//	itemServiceTeam.setProgram(this);

	//	return itemServiceTeam;
	//}

	//public ItemServiceTeam removeItemServiceTeam(ItemServiceTeam itemServiceTeam) {
	//	getItemServiceTeams().remove(itemServiceTeam);
	//	itemServiceTeam.setProgram(null);

	//	return itemServiceTeam;
	//}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setProgram(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setProgram(null);

		return product;
	}

	//public Pipeline getPipeline() {
	//	return this.pipeline;
	//}

	//public void setPipeline(Pipeline pipeline) {
	//	this.pipeline = pipeline;
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

	//public List<ProgramMetadata> getProgramMetadata() {
	//	return this.programMetadata;
	//}

	//public void setProgramMetadata(List<ProgramMetadata> programMetadata) {
	//	this.programMetadata = programMetadata;
	//}

	//public ProgramMetadata addProgramMetadata(ProgramMetadata programMetadata) {
	//	getProgramMetadata().add(programMetadata);
	//	programMetadata.setProgram(this);

	//	return programMetadata;
	//}

	//public ProgramMetadata removeProgramMetadata(ProgramMetadata programMetadata) {
	//	getProgramMetadata().remove(programMetadata);
	//	programMetadata.setProgram(null);

	//	return programMetadata;
	//}

	//public List<ProgramPlace> getProgramPlaces() {
	//	return this.programPlaces;
	//}

	//public void setProgramPlaces(List<ProgramPlace> programPlaces) {
	//	this.programPlaces = programPlaces;
	//}

	//public ProgramPlace addProgramPlace(ProgramPlace programPlace) {
	//	getProgramPlaces().add(programPlace);
	//	programPlace.setProgram(this);

	//	return programPlace;
	//}

	//public ProgramPlace removeProgramPlace(ProgramPlace programPlace) {
	//	getProgramPlaces().remove(programPlace);
	//	programPlace.setProgram(null);

	//	return programPlace;
	//}

	//public List<ProgramRelation> getProgramRelations1() {
	//	return this.programRelations1;
	//}

	//public void setProgramRelations1(List<ProgramRelation> programRelations1) {
	//	this.programRelations1 = programRelations1;
	//}

	//public ProgramRelation addProgramRelations1(ProgramRelation programRelations1) {
	//	getProgramRelations1().add(programRelations1);
	//	programRelations1.setProgram1(this);

	//	return programRelations1;
	//}

	//public ProgramRelation removeProgramRelations1(ProgramRelation programRelations1) {
	//	getProgramRelations1().remove(programRelations1);
	//	programRelations1.setProgram1(null);

	//	return programRelations1;
	//}

	//public List<ProgramRelation> getProgramRelations2() {
	//	return this.programRelations2;
	//}

	//public void setProgramRelations2(List<ProgramRelation> programRelations2) {
	//	this.programRelations2 = programRelations2;
	//}

	//public ProgramRelation addProgramRelations2(ProgramRelation programRelations2) {
	//	getProgramRelations2().add(programRelations2);
	//	programRelations2.setProgram2(this);

	//	return programRelations2;
	//}

	//public ProgramRelation removeProgramRelations2(ProgramRelation programRelations2) {
	//	getProgramRelations2().remove(programRelations2);
	//	programRelations2.setProgram2(null);

	//	return programRelations2;
	//}

	//public List<ProgramRole> getProgramRoles() {
	//	return this.programRoles;
	//}

	//public void setProgramRoles(List<ProgramRole> programRoles) {
	//	this.programRoles = programRoles;
	//}

	//public ProgramRole addProgramRole(ProgramRole programRole) {
	//	getProgramRoles().add(programRole);
	//	programRole.setProgram(this);

	//	return programRole;
	//}

	//public ProgramRole removeProgramRole(ProgramRole programRole) {
	//	getProgramRoles().remove(programRole);
	//	programRole.setProgram(null);

	//	return programRole;
	//}

	//public List<ProgramTeam> getProgramTeams() {
	//	return this.programTeams;
	//}

	//public void setProgramTeams(List<ProgramTeam> programTeams) {
	//	this.programTeams = programTeams;
	//}

	//public ProgramTeam addProgramTeam(ProgramTeam programTeam) {
	//	getProgramTeams().add(programTeam);
	//	programTeam.setProgram(this);

	//	return programTeam;
	//}

	//public ProgramTeam removeProgramTeam(ProgramTeam programTeam) {
	//	getProgramTeams().remove(programTeam);
	//	programTeam.setProgram(null);

	//	return programTeam;
	//}

	//public List<ProgramTvp> getProgramTvps() {
	//	return this.programTvps;
	//}

	//public void setProgramTvps(List<ProgramTvp> programTvps) {
	//	this.programTvps = programTvps;
	//}

	//public ProgramTvp addProgramTvp(ProgramTvp programTvp) {
	//	getProgramTvps().add(programTvp);
	//	programTvp.setProgram(this);

	//	return programTvp;
	//}

	//public ProgramTvp removeProgramTvp(ProgramTvp programTvp) {
	//	getProgramTvps().remove(programTvp);
	//	programTvp.setProgram(null);

	//	return programTvp;
	//}

	//public List<ProgramVariableSet> getProgramVariableSets() {
	//	return this.programVariableSets;
	//}

	//public void setProgramVariableSets(List<ProgramVariableSet> programVariableSets) {
	//	this.programVariableSets = programVariableSets;
	//}

	//public ProgramVariableSet addProgramVariableSet(ProgramVariableSet programVariableSet) {
	//	getProgramVariableSets().add(programVariableSet);
	//	programVariableSet.setProgram(this);

	//	return programVariableSet;
	//}

	//public ProgramVariableSet removeProgramVariableSet(ProgramVariableSet programVariableSet) {
	//	getProgramVariableSets().remove(programVariableSet);
	//	programVariableSet.setProgram(null);

	//	return programVariableSet;
	//}

	//public List<ProgramYearSequence> getProgramYearSequences() {
	//	return this.programYearSequences;
	//}

	//public void setProgramYearSequences(List<ProgramYearSequence> programYearSequences) {
	//	this.programYearSequences = programYearSequences;
	//}

	//public ProgramYearSequence addProgramYearSequence(ProgramYearSequence programYearSequence) {
	//	getProgramYearSequences().add(programYearSequence);
	//	programYearSequence.setProgram(this);

	//	return programYearSequence;
	//}

	//public ProgramYearSequence removeProgramYearSequence(ProgramYearSequence programYearSequence) {
	//	getProgramYearSequences().remove(programYearSequence);
	//	programYearSequence.setProgram(null);

	//	return programYearSequence;
	//}

	//public List<Service> getServices() {
	//	return this.services;
	//}

	//public void setServices(List<Service> services) {
	//	this.services = services;
	//}

	//public Service addService(Service service) {
	//	getServices().add(service);
	//	service.setProgram(this);

	//	return service;
	//}

	//public Service removeService(Service service) {
	//	getServices().remove(service);
	//	service.setProgram(null);

	//	return service;
	//}	

}

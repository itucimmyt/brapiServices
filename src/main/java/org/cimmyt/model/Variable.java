package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the variable database table.
 * 
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Variable.findAll", query="SELECT v FROM Variable v")
public class Variable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbrev;

	@Column(name="bibliographical_reference")
	private String bibliographicalReference;

	@Column(name="class_variable_id")
	private Integer classVariableId;

	@Column(name="column_table")
	private String columnTable;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="data_level")
	private String dataLevel;

	@Column(name="data_type")
	private String dataType;

	@Column(name="default_value")
	private String defaultValue;

	private String description;

	@Column(name="display_name")
	private String displayName;

	//@Column(name="field_prop")
	//private Object fieldProp;

	@Column(name="is_column")
	private Boolean isColumn;

	@Column(name="is_computed")
	private Boolean isComputed;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="json_type")
	private String jsonType;

	private String label;

	@Column(name="member_data_type")
	private String memberDataType;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	@Column(name="not_null")
	private Boolean notNull;

	private String notes;

	@Column(name="ontology_reference")
	private String ontologyReference;

	private String remarks;

	private String status;

	private String synonym;

	@Column(name="target_model")
	private String targetModel;

	private String type;

	private String usage;

	@Column(name="variable_set")
	private String variableSet;
	
	
	//bi-directional many-to-one association to Operational.Plot_Data
	@OneToMany(mappedBy="variable")
	private List<PlotData> plotData;
	
	public List<PlotData> getPlotData() {
		return plotData;
	}

	public void setPlotData(List<PlotData> plotData) {
		this.plotData = plotData;
	}
	
	public PlotData addPlotData(PlotData plotData){
		getPlotData().add(plotData);
		plotData.setVariable(this);
		return plotData;
	}
	
	public PlotData removePlotData(PlotData plotData){
		getPlotData().remove(plotData);
		plotData.setPlot(null);
		
		return plotData;
	}
	
	
	

	//bi-directional many-to-one association to Entity
	//@OneToMany(mappedBy="variable")
	//private List<Entity> entities;

	//bi-directional many-to-one association to FacilityData
	@OneToMany(mappedBy="variable")
	private List<FacilityData> facilityData;

	//bi-directional many-to-one association to FacilityMetadata
	//@OneToMany(mappedBy="variable")
	//private List<FacilityMetadata> facilityMetadata;

	//bi-directional many-to-one association to Formula
	//@OneToMany(mappedBy="variable")
	//private List<Formula> formulas;

	//bi-directional many-to-one association to FormulaParameter
	//@OneToMany(mappedBy="variable")
	//private List<FormulaParameter> formulaParameters;

	//bi-directional many-to-one association to GeolocationData
	//@OneToMany(mappedBy="variable")
	//private List<GeolocationData> geolocationData;

	//bi-directional many-to-one association to GeolocationMetadata
	//@OneToMany(mappedBy="variable")
	//private List<GeolocationMetadata> geolocationMetadata;

	//bi-directional many-to-one association to ItemMetadata
	//@OneToMany(mappedBy="variable")
	//private List<ItemMetadata> itemMetadata;

	//bi-directional many-to-one association to PlaceData
	//@OneToMany(mappedBy="variable")
	//private List<PlaceData> placeData;

	//bi-directional many-to-one association to PlaceMetadata
	//@OneToMany(mappedBy="variable")
	//private List<PlaceMetadata> placeMetadata;

	//bi-directional many-to-one association to ProductMetadata
	@OneToMany(mappedBy="variable")
	private List<ProductMetadata> productMetadata;

	//bi-directional many-to-one association to ProgramMetadata
	//@OneToMany(mappedBy="variable")
	//private List<ProgramMetadata> programMetadata;

	//bi-directional many-to-one association to ProgramPlaceMetadata
	//@OneToMany(mappedBy="variable")
	//private List<ProgramPlaceMetadata> programPlaceMetadata;

	//bi-directional many-to-one association to RecordVariable
	//@OneToMany(mappedBy="variable")
	//private List<RecordVariable> recordVariables;

	//bi-directional many-to-one association to SchemeMetadata
	//@OneToMany(mappedBy="variable")
	//private List<SchemeMetadata> schemeMetadata;

	//bi-directional many-to-one association to SchemeRelationMetadata
	//@OneToMany(mappedBy="variable")
	//private List<SchemeRelationMetadata> schemeRelationMetadata;

	//bi-directional many-to-one association to TvpMetadata
	//@OneToMany(mappedBy="variable")
	//private List<TvpMetadata> tvpMetadata;

	//bi-directional many-to-one association to UserMetadata
	//@OneToMany(mappedBy="variable")
	//private List<UserMetadata> userMetadata;

	//bi-directional many-to-one association to UserVariableSetMember
	//@OneToMany(mappedBy="variable")
	//private List<UserVariableSetMember> userVariableSetMembers;

	//bi-directional many-to-one association to Method
	@ManyToOne
	private Method method;

	//bi-directional many-to-one association to Property
	@ManyToOne
	private Property property;

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

	//bi-directional many-to-one association to Variable
	@ManyToOne
	@JoinColumn(name="member_variable_id")
	private Variable variable1;

	//bi-directional many-to-one association to Variable
	@OneToMany(mappedBy="variable1")
	private List<Variable> variables1;

	//bi-directional many-to-one association to Variable
	@ManyToOne
	@JoinColumn(name="target_variable_id")
	private Variable variable2;

	//bi-directional many-to-one association to Variable
	@OneToMany(mappedBy="variable2")
	private List<Variable> variables2;

	//bi-directional many-to-one association to VariableMapping
	//@OneToMany(mappedBy="variable1")
	//private List<VariableMapping> variableMappings1;

	//bi-directional many-to-one association to VariableMapping
	//@OneToMany(mappedBy="variable2")
	//private List<VariableMapping> variableMappings2;

	//bi-directional many-to-one association to VariableRelation
	//@OneToMany(mappedBy="variable1")
	//private List<VariableRelation> variableRelations1;

	//bi-directional many-to-one association to VariableRelation
	//@OneToMany(mappedBy="variable2")
	//private List<VariableRelation> variableRelations2;

	//bi-directional many-to-one association to VariableResult
	//@OneToMany(mappedBy="variable1")
	//private List<VariableResult> variableResults1;

	//bi-directional many-to-one association to VariableResult
	//@OneToMany(mappedBy="variable2")
	//private List<VariableResult> variableResults2;

	//bi-directional many-to-one association to VariableSetMember
	//@OneToMany(mappedBy="variable")
	//private List<VariableSetMember> variableSetMembers;

	public Variable() {
	}
	
	public Variable(String variableType, String op){
		this.type = variableType;
		this.notes = op;
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

	public Integer getClassVariableId() {
		return this.classVariableId;
	}

	public void setClassVariableId(Integer classVariableId) {
		this.classVariableId = classVariableId;
	}

	public String getColumnTable() {
		return this.columnTable;
	}

	public void setColumnTable(String columnTable) {
		this.columnTable = columnTable;
	}

	public Timestamp getCreationTimestamp() {
		return this.creationTimestamp;
	}

	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public String getDataLevel() {
		return this.dataLevel;
	}

	public void setDataLevel(String dataLevel) {
		this.dataLevel = dataLevel;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
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

	//public Object getFieldProp() {
	//	return this.fieldProp;
	//}

	//public void setFieldProp(Object fieldProp) {
	//	this.fieldProp = fieldProp;
	//}

	public Boolean getIsColumn() {
		return this.isColumn;
	}

	public void setIsColumn(Boolean isColumn) {
		this.isColumn = isColumn;
	}

	public Boolean getIsComputed() {
		return this.isComputed;
	}

	public void setIsComputed(Boolean isComputed) {
		this.isComputed = isComputed;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public String getJsonType() {
		return this.jsonType;
	}

	public void setJsonType(String jsonType) {
		this.jsonType = jsonType;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getMemberDataType() {
		return this.memberDataType;
	}

	public void setMemberDataType(String memberDataType) {
		this.memberDataType = memberDataType;
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

	public Boolean getNotNull() {
		return this.notNull;
	}

	public void setNotNull(Boolean notNull) {
		this.notNull = notNull;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOntologyReference() {
		return this.ontologyReference;
	}

	public void setOntologyReference(String ontologyReference) {
		this.ontologyReference = ontologyReference;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSynonym() {
		return this.synonym;
	}

	public void setSynonym(String synonym) {
		this.synonym = synonym;
	}

	public String getTargetModel() {
		return this.targetModel;
	}

	public void setTargetModel(String targetModel) {
		this.targetModel = targetModel;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getVariableSet() {
		return this.variableSet;
	}

	public void setVariableSet(String variableSet) {
		this.variableSet = variableSet;
	}

	//public List<Entity> getEntities() {
	//	return this.entities;
	//}

	//public void setEntities(List<Entity> entities) {
	//	this.entities = entities;
	//}

	//public Entity addEntity(Entity entity) {
	//	getEntities().add(entity);
	//	entity.setVariable(this);

	//	return entity;
	//}

	//public Entity removeEntity(Entity entity) {
	//	getEntities().remove(entity);
	//	entity.setVariable(null);

	//	return entity;
	//}

	public List<FacilityData> getFacilityData() {
		return this.facilityData;
	}

	public void setFacilityData(List<FacilityData> facilityData) {
		this.facilityData = facilityData;
	}

	public FacilityData addFacilityData(FacilityData facilityData) {
		getFacilityData().add(facilityData);
		facilityData.setVariable(this);

		return facilityData;
	}

	public FacilityData removeFacilityData(FacilityData facilityData) {
		getFacilityData().remove(facilityData);
		facilityData.setVariable(null);

		return facilityData;
	}

	//public List<FacilityMetadata> getFacilityMetadata() {
	//	return this.facilityMetadata;
	//}

	//public void setFacilityMetadata(List<FacilityMetadata> facilityMetadata) {
	//	this.facilityMetadata = facilityMetadata;
	//}

	//public FacilityMetadata addFacilityMetadata(FacilityMetadata facilityMetadata) {
	//	getFacilityMetadata().add(facilityMetadata);
	//	facilityMetadata.setVariable(this);

	//	return facilityMetadata;
	//}

	//public FacilityMetadata removeFacilityMetadata(FacilityMetadata facilityMetadata) {
	//	getFacilityMetadata().remove(facilityMetadata);
	//	facilityMetadata.setVariable(null);

	//	return facilityMetadata;
	//}

	//public List<Formula> getFormulas() {
	//	return this.formulas;
	//}

	//public void setFormulas(List<Formula> formulas) {
	//	this.formulas = formulas;
	//}

	//public Formula addFormula(Formula formula) {
	//	getFormulas().add(formula);
	//	formula.setVariable(this);

	//	return formula;
	//}

	//public Formula removeFormula(Formula formula) {
	//	getFormulas().remove(formula);
	//	formula.setVariable(null);

	//	return formula;
	//}

	//public List<FormulaParameter> getFormulaParameters() {
	//	return this.formulaParameters;
	//}

	//public void setFormulaParameters(List<FormulaParameter> formulaParameters) {
	//	this.formulaParameters = formulaParameters;
	//}

	//public FormulaParameter addFormulaParameter(FormulaParameter formulaParameter) {
	//	getFormulaParameters().add(formulaParameter);
	//	formulaParameter.setVariable(this);

	//	return formulaParameter;
	//}

	//public FormulaParameter removeFormulaParameter(FormulaParameter formulaParameter) {
	//	getFormulaParameters().remove(formulaParameter);
	//	formulaParameter.setVariable(null);

	//	return formulaParameter;
	//}

	//public List<GeolocationData> getGeolocationData() {
	//	return this.geolocationData;
	//}

	//public void setGeolocationData(List<GeolocationData> geolocationData) {
	//	this.geolocationData = geolocationData;
	//}

	//public GeolocationData addGeolocationData(GeolocationData geolocationData) {
	//	getGeolocationData().add(geolocationData);
	//	geolocationData.setVariable(this);

	//	return geolocationData;
	//}

	//public GeolocationData removeGeolocationData(GeolocationData geolocationData) {
	//	getGeolocationData().remove(geolocationData);
	//	geolocationData.setVariable(null);

	//	return geolocationData;
	//}

	//public List<GeolocationMetadata> getGeolocationMetadata() {
	//	return this.geolocationMetadata;
	//}

	//public void setGeolocationMetadata(List<GeolocationMetadata> geolocationMetadata) {
	//	this.geolocationMetadata = geolocationMetadata;
	//}

	//public GeolocationMetadata addGeolocationMetadata(GeolocationMetadata geolocationMetadata) {
	//	getGeolocationMetadata().add(geolocationMetadata);
	//	geolocationMetadata.setVariable(this);

	//	return geolocationMetadata;
	//}

	//public GeolocationMetadata removeGeolocationMetadata(GeolocationMetadata geolocationMetadata) {
	//	getGeolocationMetadata().remove(geolocationMetadata);
	//	geolocationMetadata.setVariable(null);

	//	return geolocationMetadata;
	//}

	//public List<ItemMetadata> getItemMetadata() {
	//	return this.itemMetadata;
	//}

	//public void setItemMetadata(List<ItemMetadata> itemMetadata) {
	//	this.itemMetadata = itemMetadata;
	//}

	//public ItemMetadata addItemMetadata(ItemMetadata itemMetadata) {
	//	getItemMetadata().add(itemMetadata);
	//	itemMetadata.setVariable(this);

	//	return itemMetadata;
	//}

	//public ItemMetadata removeItemMetadata(ItemMetadata itemMetadata) {
	//	getItemMetadata().remove(itemMetadata);
	//	itemMetadata.setVariable(null);

	//	return itemMetadata;
	//}

	//public List<PlaceData> getPlaceData() {
	//	return this.placeData;
	//}

	//public void setPlaceData(List<PlaceData> placeData) {
	//	this.placeData = placeData;
	//}

	//public PlaceData addPlaceData(PlaceData placeData) {
	//	getPlaceData().add(placeData);
	//	placeData.setVariable(this);

	//	return placeData;
	//}

	//public PlaceData removePlaceData(PlaceData placeData) {
	//	getPlaceData().remove(placeData);
	//	placeData.setVariable(null);

	//	return placeData;
	//}

	//public List<PlaceMetadata> getPlaceMetadata() {
	//	return this.placeMetadata;
	//}

	//public void setPlaceMetadata(List<PlaceMetadata> placeMetadata) {
	//	this.placeMetadata = placeMetadata;
	//}

	//public PlaceMetadata addPlaceMetadata(PlaceMetadata placeMetadata) {
	//	getPlaceMetadata().add(placeMetadata);
	//	placeMetadata.setVariable(this);

	//	return placeMetadata;
	//}

	//public PlaceMetadata removePlaceMetadata(PlaceMetadata placeMetadata) {
	//	getPlaceMetadata().remove(placeMetadata);
	//	placeMetadata.setVariable(null);

	//	return placeMetadata;
	//}

	public List<ProductMetadata> getProductMetadata() {
		return this.productMetadata;
	}

	public void setProductMetadata(List<ProductMetadata> productMetadata) {
		this.productMetadata = productMetadata;
	}

	public ProductMetadata addProductMetadata(ProductMetadata productMetadata) {
		getProductMetadata().add(productMetadata);
		productMetadata.setVariable(this);

		return productMetadata;
	}

	public ProductMetadata removeProductMetadata(ProductMetadata productMetadata) {
		getProductMetadata().remove(productMetadata);
		productMetadata.setVariable(null);

		return productMetadata;
	}

	//public List<ProgramMetadata> getProgramMetadata() {
	//	return this.programMetadata;
	//}

	//public void setProgramMetadata(List<ProgramMetadata> programMetadata) {
	//	this.programMetadata = programMetadata;
	//}

	//public ProgramMetadata addProgramMetadata(ProgramMetadata programMetadata) {
	//	getProgramMetadata().add(programMetadata);
	//	programMetadata.setVariable(this);

	//	return programMetadata;
	//}

	//public ProgramMetadata removeProgramMetadata(ProgramMetadata programMetadata) {
	//	getProgramMetadata().remove(programMetadata);
	//	programMetadata.setVariable(null);

	//	return programMetadata;
	//}

	//public List<ProgramPlaceMetadata> getProgramPlaceMetadata() {
	//	return this.programPlaceMetadata;
	//}

	//public void setProgramPlaceMetadata(List<ProgramPlaceMetadata> programPlaceMetadata) {
	//	this.programPlaceMetadata = programPlaceMetadata;
	//}

	//public ProgramPlaceMetadata addProgramPlaceMetadata(ProgramPlaceMetadata programPlaceMetadata) {
	//	getProgramPlaceMetadata().add(programPlaceMetadata);
	//	programPlaceMetadata.setVariable(this);

	//	return programPlaceMetadata;
	//}

	//public ProgramPlaceMetadata removeProgramPlaceMetadata(ProgramPlaceMetadata programPlaceMetadata) {
	//	getProgramPlaceMetadata().remove(programPlaceMetadata);
	//	programPlaceMetadata.setVariable(null);

	//	return programPlaceMetadata;
	//}

	//public List<RecordVariable> getRecordVariables() {
	//	return this.recordVariables;
	//}

	//public void setRecordVariables(List<RecordVariable> recordVariables) {
	//	this.recordVariables = recordVariables;
	//}

	//public RecordVariable addRecordVariable(RecordVariable recordVariable) {
	//	getRecordVariables().add(recordVariable);
	//	recordVariable.setVariable(this);

	//	return recordVariable;
	//}

	//public RecordVariable removeRecordVariable(RecordVariable recordVariable) {
	//	getRecordVariables().remove(recordVariable);
	//	recordVariable.setVariable(null);

	//	return recordVariable;
	//}

	//public List<SchemeMetadata> getSchemeMetadata() {
	//	return this.schemeMetadata;
	//}

	//public void setSchemeMetadata(List<SchemeMetadata> schemeMetadata) {
	//	this.schemeMetadata = schemeMetadata;
	//}

	//public SchemeMetadata addSchemeMetadata(SchemeMetadata schemeMetadata) {
	//	getSchemeMetadata().add(schemeMetadata);
	//	schemeMetadata.setVariable(this);

	//	return schemeMetadata;
	//}

	//public SchemeMetadata removeSchemeMetadata(SchemeMetadata schemeMetadata) {
	//	getSchemeMetadata().remove(schemeMetadata);
	//	schemeMetadata.setVariable(null);

	//	return schemeMetadata;
	//}

	//public List<SchemeRelationMetadata> getSchemeRelationMetadata() {
	//	return this.schemeRelationMetadata;
	//}

	//public void setSchemeRelationMetadata(List<SchemeRelationMetadata> schemeRelationMetadata) {
	//	this.schemeRelationMetadata = schemeRelationMetadata;
	//}

	//public SchemeRelationMetadata addSchemeRelationMetadata(SchemeRelationMetadata schemeRelationMetadata) {
	//	getSchemeRelationMetadata().add(schemeRelationMetadata);
	//	schemeRelationMetadata.setVariable(this);

	//	return schemeRelationMetadata;
	//}

	//public SchemeRelationMetadata removeSchemeRelationMetadata(SchemeRelationMetadata schemeRelationMetadata) {
	//	getSchemeRelationMetadata().remove(schemeRelationMetadata);
	//	schemeRelationMetadata.setVariable(null);

	//	return schemeRelationMetadata;
	//}

	//public List<TvpMetadata> getTvpMetadata() {
	//	return this.tvpMetadata;
	//}

	//public void setTvpMetadata(List<TvpMetadata> tvpMetadata) {
	//	this.tvpMetadata = tvpMetadata;
	//}

	//public TvpMetadata addTvpMetadata(TvpMetadata tvpMetadata) {
	//	getTvpMetadata().add(tvpMetadata);
	//	tvpMetadata.setVariable(this);

	//	return tvpMetadata;
	//}

	//public TvpMetadata removeTvpMetadata(TvpMetadata tvpMetadata) {
	//	getTvpMetadata().remove(tvpMetadata);
	//	tvpMetadata.setVariable(null);

	//	return tvpMetadata;
	//}

	//public List<UserMetadata> getUserMetadata() {
	//	return this.userMetadata;
	//}

	//public void setUserMetadata(List<UserMetadata> userMetadata) {
	//	this.userMetadata = userMetadata;
	//}

	//public UserMetadata addUserMetadata(UserMetadata userMetadata) {
	//	getUserMetadata().add(userMetadata);
	//	userMetadata.setVariable(this);

	//	return userMetadata;
	//}

	//public UserMetadata removeUserMetadata(UserMetadata userMetadata) {
	//	getUserMetadata().remove(userMetadata);
	//	userMetadata.setVariable(null);

	//	return userMetadata;
	//}

	//public List<UserVariableSetMember> getUserVariableSetMembers() {
	//	return this.userVariableSetMembers;
	//}

	//public void setUserVariableSetMembers(List<UserVariableSetMember> userVariableSetMembers) {
	//	this.userVariableSetMembers = userVariableSetMembers;
	//}

	//public UserVariableSetMember addUserVariableSetMember(UserVariableSetMember userVariableSetMember) {
	//	getUserVariableSetMembers().add(userVariableSetMember);
	//	userVariableSetMember.setVariable(this);

	//	return userVariableSetMember;
	//}

	//public UserVariableSetMember removeUserVariableSetMember(UserVariableSetMember userVariableSetMember) {
	//	getUserVariableSetMembers().remove(userVariableSetMember);
	//	userVariableSetMember.setVariable(null);

	//	return userVariableSetMember;
	//}

	public Method getMethod() {
		return this.method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Property getProperty() {
		return this.property;
	}

	public void setProperty(Property property) {
		this.property = property;
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

	public Variable getVariable1() {
		return this.variable1;
	}

	public void setVariable1(Variable variable1) {
		this.variable1 = variable1;
	}

	public List<Variable> getVariables1() {
		return this.variables1;
	}

	public void setVariables1(List<Variable> variables1) {
		this.variables1 = variables1;
	}

	public Variable addVariables1(Variable variables1) {
		getVariables1().add(variables1);
		variables1.setVariable1(this);

		return variables1;
	}

	public Variable removeVariables1(Variable variables1) {
		getVariables1().remove(variables1);
		variables1.setVariable1(null);

		return variables1;
	}

	public Variable getVariable2() {
		return this.variable2;
	}

	public void setVariable2(Variable variable2) {
		this.variable2 = variable2;
	}

	public List<Variable> getVariables2() {
		return this.variables2;
	}

	public void setVariables2(List<Variable> variables2) {
		this.variables2 = variables2;
	}

	public Variable addVariables2(Variable variables2) {
		getVariables2().add(variables2);
		variables2.setVariable2(this);

		return variables2;
	}

	public Variable removeVariables2(Variable variables2) {
		getVariables2().remove(variables2);
		variables2.setVariable2(null);

		return variables2;
	}

	//public List<VariableMapping> getVariableMappings1() {
	//	return this.variableMappings1;
	//}

	//public void setVariableMappings1(List<VariableMapping> variableMappings1) {
	//	this.variableMappings1 = variableMappings1;
	//}

	//public VariableMapping addVariableMappings1(VariableMapping variableMappings1) {
	//	getVariableMappings1().add(variableMappings1);
	//	variableMappings1.setVariable1(this);

	//	return variableMappings1;
	//}

	//public VariableMapping removeVariableMappings1(VariableMapping variableMappings1) {
	//	getVariableMappings1().remove(variableMappings1);
	//	variableMappings1.setVariable1(null);

	//	return variableMappings1;
	//}

	//public List<VariableMapping> getVariableMappings2() {
	//	return this.variableMappings2;
	//}

	//public void setVariableMappings2(List<VariableMapping> variableMappings2) {
	//	this.variableMappings2 = variableMappings2;
	//}

	//public VariableMapping addVariableMappings2(VariableMapping variableMappings2) {
	//	getVariableMappings2().add(variableMappings2);
	//	variableMappings2.setVariable2(this);

	//	return variableMappings2;
	//}

	//public VariableMapping removeVariableMappings2(VariableMapping variableMappings2) {
	//	getVariableMappings2().remove(variableMappings2);
	//	variableMappings2.setVariable2(null);

	//	return variableMappings2;
	//}

	//public List<VariableRelation> getVariableRelations1() {
	//	return this.variableRelations1;
	//}

	//public void setVariableRelations1(List<VariableRelation> variableRelations1) {
	//	this.variableRelations1 = variableRelations1;
	//}

	//public VariableRelation addVariableRelations1(VariableRelation variableRelations1) {
	//	getVariableRelations1().add(variableRelations1);
	//	variableRelations1.setVariable1(this);

	//	return variableRelations1;
	//}

	//public VariableRelation removeVariableRelations1(VariableRelation variableRelations1) {
	//	getVariableRelations1().remove(variableRelations1);
	//	variableRelations1.setVariable1(null);

	//	return variableRelations1;
	//}

	//public List<VariableRelation> getVariableRelations2() {
	//	return this.variableRelations2;
	//}

	//public void setVariableRelations2(List<VariableRelation> variableRelations2) {
	//	this.variableRelations2 = variableRelations2;
	//}

	//public VariableRelation addVariableRelations2(VariableRelation variableRelations2) {
	//	getVariableRelations2().add(variableRelations2);
	//	variableRelations2.setVariable2(this);

	//	return variableRelations2;
	//}

	//public VariableRelation removeVariableRelations2(VariableRelation variableRelations2) {
	//	getVariableRelations2().remove(variableRelations2);
	//	variableRelations2.setVariable2(null);

	//	return variableRelations2;
	//}

	//public List<VariableResult> getVariableResults1() {
	//	return this.variableResults1;
	//}

	//public void setVariableResults1(List<VariableResult> variableResults1) {
	//	this.variableResults1 = variableResults1;
	//}

	//public VariableResult addVariableResults1(VariableResult variableResults1) {
	//	getVariableResults1().add(variableResults1);
	//	variableResults1.setVariable1(this);

	//	return variableResults1;
	//}

	//public VariableResult removeVariableResults1(VariableResult variableResults1) {
	//	getVariableResults1().remove(variableResults1);
	//	variableResults1.setVariable1(null);

	//	return variableResults1;
	//}

	//public List<VariableResult> getVariableResults2() {
	//	return this.variableResults2;
	//}

	//public void setVariableResults2(List<VariableResult> variableResults2) {
	//	this.variableResults2 = variableResults2;
	//}

	//public VariableResult addVariableResults2(VariableResult variableResults2) {
	//	getVariableResults2().add(variableResults2);
	//	variableResults2.setVariable2(this);

	//	return variableResults2;
	//}

	//public VariableResult removeVariableResults2(VariableResult variableResults2) {
	//	getVariableResults2().remove(variableResults2);
	//	variableResults2.setVariable2(null);

	//	return variableResults2;
	//}

	//public List<VariableSetMember> getVariableSetMembers() {
	//	return this.variableSetMembers;
	//}

	//public void setVariableSetMembers(List<VariableSetMember> variableSetMembers) {
	//	this.variableSetMembers = variableSetMembers;
	//}

	//public VariableSetMember addVariableSetMember(VariableSetMember variableSetMember) {
	//	getVariableSetMembers().add(variableSetMember);
	//	variableSetMember.setVariable(this);

	//	return variableSetMember;
	//}

	//public VariableSetMember removeVariableSetMember(VariableSetMember variableSetMember) {
	//	getVariableSetMembers().remove(variableSetMember);
	//	variableSetMember.setVariable(null);

	//	return variableSetMember;
	//}

}
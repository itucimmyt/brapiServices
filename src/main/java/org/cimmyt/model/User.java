package org.cimmyt.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(schema="master")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="display_name")
	private String displayName;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String notes;

	private String remarks;

	private String salutation;

	private Integer status;

	@Column(name="user_type")
	private Integer userType;

	private String username;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_end_date")
	private Date validEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_start_date")
	private Date validStartDate;
	
	public User(){}
	
	public User(String userName){
		this.username = userName;
	}

/*	
	//bi-directional many-to-one association to Changelog
	@OneToMany(mappedBy="user1")
	private List<Changelog> changelogs1;

	//bi-directional many-to-one association to Changelog
	@OneToMany(mappedBy="user2")
	private List<Changelog> changelogs2;

	//bi-directional many-to-one association to Changelog
	@OneToMany(mappedBy="user3")
	private List<Changelog> changelogs3;

	//bi-directional many-to-one association to CrossMethod
	//@OneToMany(mappedBy="user1")
	//private List<CrossMethod> crossMethods1;

	//bi-directional many-to-one association to CrossMethod
	//@OneToMany(mappedBy="user2")
	//private List<CrossMethod> crossMethods2;

	//bi-directional many-to-one association to CrossParentageGm
	//@OneToMany(mappedBy="user1")
	//private List<CrossParentageGm> crossParentageGms1;

	//bi-directional many-to-one association to CrossParentageGm
	//@OneToMany(mappedBy="user2")
	//private List<CrossParentageGm> crossParentageGms2;

	//bi-directional many-to-one association to Crosscutting
	//@OneToMany(mappedBy="user1")
	//private List<Crosscutting> crosscuttings1;

	//bi-directional many-to-one association to Crosscutting
	//@OneToMany(mappedBy="user2")
	//private List<Crosscutting> crosscuttings2;

	//bi-directional many-to-one association to CrosscuttingTeam
	//@OneToMany(mappedBy="user1")
	//private List<CrosscuttingTeam> crosscuttingTeams1;

	//bi-directional many-to-one association to CrosscuttingTeam
	//@OneToMany(mappedBy="user2")
	//private List<CrosscuttingTeam> crosscuttingTeams2;

	//bi-directional many-to-one association to Entity
	//@OneToMany(mappedBy="user1")
	//private List<Entity> entities1;

	//bi-directional many-to-one association to Entity
	//@OneToMany(mappedBy="user2")
	//private List<Entity> entities2;

	//bi-directional many-to-one association to Facility
	@OneToMany(mappedBy="user1")
	private List<Facility> facilities1;

	//bi-directional many-to-one association to Facility
	@OneToMany(mappedBy="user2")
	private List<Facility> facilities2;

	//bi-directional many-to-one association to FacilityData
	@OneToMany(mappedBy="user1")
	private List<FacilityData> facilityData1;

	//bi-directional many-to-one association to FacilityData
	@OneToMany(mappedBy="user2")
	private List<FacilityData> facilityData2;

	//bi-directional many-to-one association to FacilityMetadata
	//@OneToMany(mappedBy="user1")
	//private List<FacilityMetadata> facilityMetadata1;

	//bi-directional many-to-one association to FacilityMetadata
	//@OneToMany(mappedBy="user2")
	//private List<FacilityMetadata> facilityMetadata2;

	//bi-directional many-to-one association to FacilityType
	//@OneToMany(mappedBy="user1")
	//private List<FacilityType> facilityTypes1;

	//bi-directional many-to-one association to FacilityType
	//@OneToMany(mappedBy="user2")
	//private List<FacilityType> facilityTypes2;

	//bi-directional many-to-one association to Family
	//@OneToMany(mappedBy="user1")
	//private List<Family> families1;

	//bi-directional many-to-one association to Family
	//@OneToMany(mappedBy="user2")
	//private List<Family> families2;

	//bi-directional many-to-one association to Formula
	//@OneToMany(mappedBy="user1")
	//private List<Formula> formulas1;

	//bi-directional many-to-one association to Formula
	//@OneToMany(mappedBy="user2")
	//private List<Formula> formulas2;

	//bi-directional many-to-one association to FormulaParameter
	//@OneToMany(mappedBy="user1")
	//private List<FormulaParameter> formulaParameters1;

	//bi-directional many-to-one association to FormulaParameter
	//@OneToMany(mappedBy="user2")
	//private List<FormulaParameter> formulaParameters2;

	//bi-directional many-to-one association to Geolocation
	//@OneToMany(mappedBy="user1")
	//private List<Geolocation> geolocations1;

	//bi-directional many-to-one association to Geolocation
	//@OneToMany(mappedBy="user2")
	//private List<Geolocation> geolocations2;

	//bi-directional many-to-one association to GeolocationData
	//@OneToMany(mappedBy="user1")
	//private List<GeolocationData> geolocationData1;

	//bi-directional many-to-one association to GeolocationData
	//@OneToMany(mappedBy="user2")
	//private List<GeolocationData> geolocationData2;

	//bi-directional many-to-one association to GeolocationMetadata
	//@OneToMany(mappedBy="user1")
	//private List<GeolocationMetadata> geolocationMetadata1;

	//bi-directional many-to-one association to GeolocationMetadata
	//@OneToMany(mappedBy="user2")
	//private List<GeolocationMetadata> geolocationMetadata2;

	//bi-directional many-to-one association to GlocnHistory
	//@OneToMany(mappedBy="user")
	//private List<GlocnHistory> glocnHistories;

	//bi-directional many-to-one association to GlocnYearSequence
	//@OneToMany(mappedBy="user")
	//private List<GlocnYearSequence> glocnYearSequences;

	//bi-directional many-to-one association to Institute
	//@OneToMany(mappedBy="user1")
	//private List<Institute> institutes1;

	//bi-directional many-to-one association to Institute
	//@OneToMany(mappedBy="user2")
	//private List<Institute> institutes2;

	//bi-directional many-to-one association to Instruction
	//@OneToMany(mappedBy="user1")
	//private List<Instruction> instructions1;

	//bi-directional many-to-one association to Instruction
	//@OneToMany(mappedBy="user2")
	//private List<Instruction> instructions2;

	//bi-directional many-to-one association to Item
	//@OneToMany(mappedBy="user1")
	//private List<Item> items1;

	//bi-directional many-to-one association to Item
	//@OneToMany(mappedBy="user2")
	//private List<Item> items2;

	//bi-directional many-to-one association to ItemAction
	//@OneToMany(mappedBy="user1")
	//private List<ItemAction> itemActions1;

	//bi-directional many-to-one association to ItemAction
	//@OneToMany(mappedBy="user2")
	//private List<ItemAction> itemActions2;

	//bi-directional many-to-one association to ItemMetadata
	//@OneToMany(mappedBy="user1")
	//private List<ItemMetadata> itemMetadata1;

	//bi-directional many-to-one association to ItemMetadata
	//@OneToMany(mappedBy="user2")
	//private List<ItemMetadata> itemMetadata2;

	//bi-directional many-to-one association to ItemRecord
	//@OneToMany(mappedBy="user1")
	//private List<ItemRecord> itemRecords1;

	//bi-directional many-to-one association to ItemRecord
	//@OneToMany(mappedBy="user2")
	//private List<ItemRecord> itemRecords2;

	//bi-directional many-to-one association to ItemRelation
	//@OneToMany(mappedBy="user1")
	//private List<ItemRelation> itemRelations1;

	//bi-directional many-to-one association to ItemRelation
	@OneToMany(mappedBy="user2")
	private List<ItemRelation> itemRelations2;

	//bi-directional many-to-one association to ItemService
	@OneToMany(mappedBy="user1")
	private List<ItemService> itemServices1;

	//bi-directional many-to-one association to ItemService
	@OneToMany(mappedBy="user2")
	private List<ItemService> itemServices2;

	//bi-directional many-to-one association to ItemServiceTeam
	@OneToMany(mappedBy="user1")
	private List<ItemServiceTeam> itemServiceTeams1;

	//bi-directional many-to-one association to ItemServiceTeam
	@OneToMany(mappedBy="user2")
	private List<ItemServiceTeam> itemServiceTeams2;

	//bi-directional many-to-one association to Method
	@OneToMany(mappedBy="user1")
	private List<Method> methods1;

	//bi-directional many-to-one association to Method
	@OneToMany(mappedBy="user2")
	private List<Method> methods2;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="user1")
	private List<Notification> notifications1;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="user2")
	private List<Notification> notifications2;

	//bi-directional many-to-one association to NotificationApplicationRelation
	@OneToMany(mappedBy="user1")
	private List<NotificationApplicationRelation> notificationApplicationRelations1;

	//bi-directional many-to-one association to NotificationApplicationRelation
	@OneToMany(mappedBy="user2")
	private List<NotificationApplicationRelation> notificationApplicationRelations2;

	//bi-directional many-to-one association to Organization
	@OneToMany(mappedBy="user1")
	private List<Organization> organizations1;

	//bi-directional many-to-one association to Organization
	@OneToMany(mappedBy="user2")
	private List<Organization> organizations2;

	//bi-directional many-to-one association to Phase
	@OneToMany(mappedBy="user1")
	private List<Phase> phases1;

	//bi-directional many-to-one association to Phase
	@OneToMany(mappedBy="user2")
	private List<Phase> phases2;

	//bi-directional many-to-one association to Pipeline
	@OneToMany(mappedBy="user1")
	private List<Pipeline> pipelines1;

	//bi-directional many-to-one association to Pipeline
	@OneToMany(mappedBy="user2")
	private List<Pipeline> pipelines2;

	//bi-directional many-to-one association to PipelineTeam
	@OneToMany(mappedBy="user1")
	private List<PipelineTeam> pipelineTeams1;

	//bi-directional many-to-one association to PipelineTeam
	@OneToMany(mappedBy="user2")
	private List<PipelineTeam> pipelineTeams2;

	//bi-directional many-to-one association to Place
	@OneToMany(mappedBy="user1")
	private List<Place> places1;

	//bi-directional many-to-one association to Place
	@OneToMany(mappedBy="user2")
	private List<Place> places2;

	//bi-directional many-to-one association to PlaceData
	@OneToMany(mappedBy="user1")
	private List<PlaceData> placeData1;

	//bi-directional many-to-one association to PlaceData
	@OneToMany(mappedBy="user2")
	private List<PlaceData> placeData2;

	//bi-directional many-to-one association to PlaceMetadata
	@OneToMany(mappedBy="user1")
	private List<PlaceMetadata> placeMetadata1;

	//bi-directional many-to-one association to PlaceMetadata
	@OneToMany(mappedBy="user2")
	private List<PlaceMetadata> placeMetadata2;

	//bi-directional many-to-one association to PlaceSeason
	@OneToMany(mappedBy="user1")
	private List<PlaceSeason> placeSeasons1;

	//bi-directional many-to-one association to PlaceSeason
	@OneToMany(mappedBy="user2")
	private List<PlaceSeason> placeSeasons2;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="user1")
	private List<Product> products1;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="user2")
	private List<Product> products2;

	//bi-directional many-to-one association to ProductGid
	@OneToMany(mappedBy="user1")
	private List<ProductGid> productGids1;

	//bi-directional many-to-one association to ProductGid
	@OneToMany(mappedBy="user2")
	private List<ProductGid> productGids2;

	//bi-directional many-to-one association to ProductList
	@OneToMany(mappedBy="user1")
	private List<ProductList> productLists1;

	//bi-directional many-to-one association to ProductList
	@OneToMany(mappedBy="user2")
	private List<ProductList> productLists2;

	//bi-directional many-to-one association to ProductListMember
	@OneToMany(mappedBy="user1")
	private List<ProductListMember> productListMembers1;

	//bi-directional many-to-one association to ProductListMember
	@OneToMany(mappedBy="user2")
	private List<ProductListMember> productListMembers2;

	//bi-directional many-to-one association to ProductMetadata
	@OneToMany(mappedBy="user1")
	private List<ProductMetadata> productMetadata1;

	//bi-directional many-to-one association to ProductMetadata
	@OneToMany(mappedBy="user2")
	private List<ProductMetadata> productMetadata2;

	//bi-directional many-to-one association to ProductName
	@OneToMany(mappedBy="user1")
	private List<ProductName> productNames1;

	//bi-directional many-to-one association to ProductName
	@OneToMany(mappedBy="user2")
	private List<ProductName> productNames2;

	//bi-directional many-to-one association to Program
	@OneToMany(mappedBy="user1")
	private List<Program> programs1;

	//bi-directional many-to-one association to Program
	@OneToMany(mappedBy="user2")
	private List<Program> programs2;

	//bi-directional many-to-one association to ProgramMetadata
	@OneToMany(mappedBy="user1")
	private List<ProgramMetadata> programMetadata1;

	//bi-directional many-to-one association to ProgramMetadata
	@OneToMany(mappedBy="user2")
	private List<ProgramMetadata> programMetadata2;

	//bi-directional many-to-one association to ProgramPlace
	@OneToMany(mappedBy="user1")
	private List<ProgramPlace> programPlaces1;

	//bi-directional many-to-one association to ProgramPlace
	@OneToMany(mappedBy="user2")
	private List<ProgramPlace> programPlaces2;

	//bi-directional many-to-one association to ProgramPlaceMetadata
	@OneToMany(mappedBy="user1")
	private List<ProgramPlaceMetadata> programPlaceMetadata1;

	//bi-directional many-to-one association to ProgramPlaceMetadata
	@OneToMany(mappedBy="user2")
	private List<ProgramPlaceMetadata> programPlaceMetadata2;

	//bi-directional many-to-one association to ProgramRelation
	@OneToMany(mappedBy="user1")
	private List<ProgramRelation> programRelations1;

	//bi-directional many-to-one association to ProgramRelation
	@OneToMany(mappedBy="user2")
	private List<ProgramRelation> programRelations2;

	//bi-directional many-to-one association to ProgramRole
	@OneToMany(mappedBy="user1")
	private List<ProgramRole> programRoles1;

	//bi-directional many-to-one association to ProgramRole
	@OneToMany(mappedBy="user2")
	private List<ProgramRole> programRoles2;

	//bi-directional many-to-one association to ProgramTeam
	@OneToMany(mappedBy="user1")
	private List<ProgramTeam> programTeams1;

	//bi-directional many-to-one association to ProgramTeam
	@OneToMany(mappedBy="user2")
	private List<ProgramTeam> programTeams2;

	//bi-directional many-to-one association to ProgramTvp
	@OneToMany(mappedBy="user1")
	private List<ProgramTvp> programTvps1;

	//bi-directional many-to-one association to ProgramTvp
	@OneToMany(mappedBy="user2")
	private List<ProgramTvp> programTvps2;

	//bi-directional many-to-one association to ProgramVariableSet
	@OneToMany(mappedBy="user1")
	private List<ProgramVariableSet> programVariableSets1;

	//bi-directional many-to-one association to ProgramVariableSet
	@OneToMany(mappedBy="user2")
	private List<ProgramVariableSet> programVariableSets2;

	//bi-directional many-to-one association to ProgramYearSequence
	@OneToMany(mappedBy="user1")
	private List<ProgramYearSequence> programYearSequences1;

	//bi-directional many-to-one association to ProgramYearSequence
	@OneToMany(mappedBy="user2")
	private List<ProgramYearSequence> programYearSequences2;

	//bi-directional many-to-one association to Property
	@OneToMany(mappedBy="user1")
	private List<Property> properties1;

	//bi-directional many-to-one association to Property
	@OneToMany(mappedBy="user2")
	private List<Property> properties2;

	//bi-directional many-to-one association to PropertyMethodScale
	@OneToMany(mappedBy="user1")
	private List<PropertyMethodScale> propertyMethodScales1;

	//bi-directional many-to-one association to PropertyMethodScale
	@OneToMany(mappedBy="user2")
	private List<PropertyMethodScale> propertyMethodScales2;

	//bi-directional many-to-one association to Record
	@OneToMany(mappedBy="user1")
	private List<Record> records1;

	//bi-directional many-to-one association to Record
	@OneToMany(mappedBy="user2")
	private List<Record> records2;

	//bi-directional many-to-one association to RecordVariable
	@OneToMany(mappedBy="user1")
	private List<RecordVariable> recordVariables1;

	//bi-directional many-to-one association to RecordVariable
	@OneToMany(mappedBy="user2")
	private List<RecordVariable> recordVariables2;

	//bi-directional many-to-one association to Role
	@OneToMany(mappedBy="user1")
	private List<Role> roles1;

	//bi-directional many-to-one association to Role
	@OneToMany(mappedBy="user2")
	private List<Role> roles2;

	//bi-directional many-to-one association to Scale
	@OneToMany(mappedBy="user1")
	private List<Scale> scales1;

	//bi-directional many-to-one association to Scale
	@OneToMany(mappedBy="user2")
	private List<Scale> scales2;

	//bi-directional many-to-one association to ScaleValue
	@OneToMany(mappedBy="user1")
	private List<ScaleValue> scaleValues1;

	//bi-directional many-to-one association to ScaleValue
	@OneToMany(mappedBy="user2")
	private List<ScaleValue> scaleValues2;

	//bi-directional many-to-one association to Scheme
	@OneToMany(mappedBy="user1")
	private List<Scheme> schemes1;

	//bi-directional many-to-one association to Scheme
	@OneToMany(mappedBy="user2")
	private List<Scheme> schemes2;

	//bi-directional many-to-one association to SchemeMetadata
	@OneToMany(mappedBy="user1")
	private List<SchemeMetadata> schemeMetadata1;

	//bi-directional many-to-one association to SchemeMetadata
	@OneToMany(mappedBy="user2")
	private List<SchemeMetadata> schemeMetadata2;

	//bi-directional many-to-one association to SchemeRelation
	@OneToMany(mappedBy="user1")
	private List<SchemeRelation> schemeRelations1;

	//bi-directional many-to-one association to SchemeRelation
	@OneToMany(mappedBy="user2")
	private List<SchemeRelation> schemeRelations2;

	//bi-directional many-to-one association to SchemeRelationMetadata
	@OneToMany(mappedBy="user1")
	private List<SchemeRelationMetadata> schemeRelationMetadata1;

	//bi-directional many-to-one association to SchemeRelationMetadata
	@OneToMany(mappedBy="user2")
	private List<SchemeRelationMetadata> schemeRelationMetadata2;

	//bi-directional many-to-one association to Season
	@OneToMany(mappedBy="user1")
	private List<Season> seasons1;

	//bi-directional many-to-one association to Season
	@OneToMany(mappedBy="user2")
	private List<Season> seasons2;

	//bi-directional many-to-one association to Service
	@OneToMany(mappedBy="user1")
	private List<Service> services1;

	//bi-directional many-to-one association to Service
	@OneToMany(mappedBy="user2")
	private List<Service> services2;

	//bi-directional many-to-one association to ServiceRecord
	@OneToMany(mappedBy="user1")
	private List<ServiceRecord> serviceRecords1;

	//bi-directional many-to-one association to ServiceRecord
	@OneToMany(mappedBy="user2")
	private List<ServiceRecord> serviceRecords2;

	//bi-directional many-to-one association to ServiceRelation
	@OneToMany(mappedBy="user1")
	private List<ServiceRelation> serviceRelations1;

	//bi-directional many-to-one association to ServiceRelation
	@OneToMany(mappedBy="user2")
	private List<ServiceRelation> serviceRelations2;

	//bi-directional many-to-one association to ServiceRequiredVariable
	@OneToMany(mappedBy="user1")
	private List<ServiceRequiredVariable> serviceRequiredVariables1;

	//bi-directional many-to-one association to ServiceRequiredVariable
	@OneToMany(mappedBy="user2")
	private List<ServiceRequiredVariable> serviceRequiredVariables2;

	//bi-directional many-to-one association to ServiceTask
	@OneToMany(mappedBy="user1")
	private List<ServiceTask> serviceTasks1;

	//bi-directional many-to-one association to ServiceTask
	@OneToMany(mappedBy="user2")
	private List<ServiceTask> serviceTasks2;

	//bi-directional many-to-one association to ServiceTeam
	@OneToMany(mappedBy="user1")
	private List<ServiceTeam> serviceTeams1;

	//bi-directional many-to-one association to ServiceTeam
	@OneToMany(mappedBy="user2")
	private List<ServiceTeam> serviceTeams2;

	//bi-directional many-to-one association to Team
	@OneToMany(mappedBy="user1")
	private List<Team> teams1;

	//bi-directional many-to-one association to Team
	@OneToMany(mappedBy="user2")
	private List<Team> teams2;

	//bi-directional many-to-one association to Team
	@OneToMany(mappedBy="user3")
	private List<Team> teams3;

	//bi-directional many-to-one association to TeamMember
	@OneToMany(mappedBy="user1")
	private List<TeamMember> teamMembers1;

	//bi-directional many-to-one association to TeamMember
	@OneToMany(mappedBy="user2")
	private List<TeamMember> teamMembers2;

	//bi-directional many-to-one association to TeamMember
	@OneToMany(mappedBy="user3")
	private List<TeamMember> teamMembers3;

	//bi-directional many-to-one association to TimingRule
	@OneToMany(mappedBy="user1")
	private List<TimingRule> timingRules1;

	//bi-directional many-to-one association to TimingRule
	@OneToMany(mappedBy="user2")
	private List<TimingRule> timingRules2;

	//bi-directional many-to-one association to Tooltip
	@OneToMany(mappedBy="user1")
	private List<Tooltip> tooltips1;

	//bi-directional many-to-one association to Tooltip
	@OneToMany(mappedBy="user2")
	private List<Tooltip> tooltips2;

	//bi-directional many-to-one association to Tvp
	@OneToMany(mappedBy="user1")
	private List<Tvp> tvps1;

	//bi-directional many-to-one association to Tvp
	@OneToMany(mappedBy="user2")
	private List<Tvp> tvps2;

	//bi-directional many-to-one association to TvpMetadata
	@OneToMany(mappedBy="user1")
	private List<TvpMetadata> tvpMetadata1;

	//bi-directional many-to-one association to TvpMetadata
	@OneToMany(mappedBy="user2")
	private List<TvpMetadata> tvpMetadata2;

	//bi-directional many-to-one association to TvpProductProfile
	@OneToMany(mappedBy="user1")
	private List<TvpProductProfile> tvpProductProfiles1;

	//bi-directional many-to-one association to TvpProductProfile
	@OneToMany(mappedBy="user2")
	private List<TvpProductProfile> tvpProductProfiles2;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="creator_id")
	private User user1;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="user1")
	private List<User> users1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="modifier_id")
	private User user2;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="user2")
	private List<User> users2;

	//bi-directional many-to-one association to UserItem
	@OneToMany(mappedBy="user")
	private List<UserItem> userItems;

	//bi-directional many-to-one association to UserMetadata
	@OneToMany(mappedBy="user1")
	private List<UserMetadata> userMetadata1;

	//bi-directional many-to-one association to UserMetadata
	@OneToMany(mappedBy="user2")
	private List<UserMetadata> userMetadata2;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="user1")
	private List<UserRole> userRoles1;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="user2")
	private List<UserRole> userRoles2;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="user3")
	private List<UserRole> userRoles3;

	//bi-directional many-to-one association to UserSession
	@OneToMany(mappedBy="user1")
	private List<UserSession> userSessions1;

	//bi-directional many-to-one association to UserSession
	@OneToMany(mappedBy="user2")
	private List<UserSession> userSessions2;

	//bi-directional many-to-one association to UserSession
	@OneToMany(mappedBy="user3")
	private List<UserSession> userSessions3;

	//bi-directional many-to-one association to UserVariableSetMember
	@OneToMany(mappedBy="user1")
	private List<UserVariableSetMember> userVariableSetMembers1;

	//bi-directional many-to-one association to UserVariableSetMember
	@OneToMany(mappedBy="user2")
	private List<UserVariableSetMember> userVariableSetMembers2;

	//bi-directional many-to-one association to UserVariableSetMember
	@OneToMany(mappedBy="user3")
	private List<UserVariableSetMember> userVariableSetMembers3;

	//bi-directional many-to-one association to Variable
	@OneToMany(mappedBy="user1")
	private List<Variable> variables1;

	//bi-directional many-to-one association to Variable
	@OneToMany(mappedBy="user2")
	private List<Variable> variables2;

	//bi-directional many-to-one association to VariableMapping
	@OneToMany(mappedBy="user1")
	private List<VariableMapping> variableMappings1;

	//bi-directional many-to-one association to VariableMapping
	@OneToMany(mappedBy="user2")
	private List<VariableMapping> variableMappings2;

	//bi-directional many-to-one association to VariableRelation
	@OneToMany(mappedBy="user1")
	private List<VariableRelation> variableRelations1;

	//bi-directional many-to-one association to VariableRelation
	@OneToMany(mappedBy="user2")
	private List<VariableRelation> variableRelations2;

	//bi-directional many-to-one association to VariableRelationValue
	@OneToMany(mappedBy="user1")
	private List<VariableRelationValue> variableRelationValues1;

	//bi-directional many-to-one association to VariableRelationValue
	@OneToMany(mappedBy="user2")
	private List<VariableRelationValue> variableRelationValues2;

	//bi-directional many-to-one association to VariableResult
	@OneToMany(mappedBy="user1")
	private List<VariableResult> variableResults1;

	//bi-directional many-to-one association to VariableResult
	@OneToMany(mappedBy="user2")
	private List<VariableResult> variableResults2;

	//bi-directional many-to-one association to VariableSet
	@OneToMany(mappedBy="user1")
	private List<VariableSet> variableSets1;

	//bi-directional many-to-one association to VariableSet
	@OneToMany(mappedBy="user2")
	private List<VariableSet> variableSets2;

	//bi-directional many-to-one association to VariableSetAccess
	@OneToMany(mappedBy="user1")
	private List<VariableSetAccess> variableSetAccesses1;

	//bi-directional many-to-one association to VariableSetAccess
	@OneToMany(mappedBy="user2")
	private List<VariableSetAccess> variableSetAccesses2;

	//bi-directional many-to-one association to VariableSetMember
	@OneToMany(mappedBy="user1")
	private List<VariableSetMember> variableSetMembers1;

	//bi-directional many-to-one association to VariableSetMember
	@OneToMany(mappedBy="user2")
	private List<VariableSetMember> variableSetMembers2;

	//bi-directional many-to-one association to VariableSetRelation
	@OneToMany(mappedBy="user1")
	private List<VariableSetRelation> variableSetRelations1;

	//bi-directional many-to-one association to VariableSetRelation
	@OneToMany(mappedBy="user2")
	private List<VariableSetRelation> variableSetRelations2;
*/

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

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getValidEndDate() {
		return this.validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public Date getValidStartDate() {
		return this.validStartDate;
	}

	public void setValidStartDate(Date validStartDate) {
		this.validStartDate = validStartDate;
	}

/*	public List<Changelog> getChangelogs1() {
		return this.changelogs1;
	}

	public void setChangelogs1(List<Changelog> changelogs1) {
		this.changelogs1 = changelogs1;
	}

	public Changelog addChangelogs1(Changelog changelogs1) {
		getChangelogs1().add(changelogs1);
		changelogs1.setUser1(this);

		return changelogs1;
	}

	public Changelog removeChangelogs1(Changelog changelogs1) {
		getChangelogs1().remove(changelogs1);
		changelogs1.setUser1(null);

		return changelogs1;
	}

	public List<Changelog> getChangelogs2() {
		return this.changelogs2;
	}

	public void setChangelogs2(List<Changelog> changelogs2) {
		this.changelogs2 = changelogs2;
	}

	public Changelog addChangelogs2(Changelog changelogs2) {
		getChangelogs2().add(changelogs2);
		changelogs2.setUser2(this);

		return changelogs2;
	}

	public Changelog removeChangelogs2(Changelog changelogs2) {
		getChangelogs2().remove(changelogs2);
		changelogs2.setUser2(null);

		return changelogs2;
	}

	public List<Changelog> getChangelogs3() {
		return this.changelogs3;
	}

	public void setChangelogs3(List<Changelog> changelogs3) {
		this.changelogs3 = changelogs3;
	}

	public Changelog addChangelogs3(Changelog changelogs3) {
		getChangelogs3().add(changelogs3);
		changelogs3.setUser3(this);

		return changelogs3;
	}

	public Changelog removeChangelogs3(Changelog changelogs3) {
		getChangelogs3().remove(changelogs3);
		changelogs3.setUser3(null);

		return changelogs3;
	}

	public List<CrossMethod> getCrossMethods1() {
		return this.crossMethods1;
	}

	public void setCrossMethods1(List<CrossMethod> crossMethods1) {
		this.crossMethods1 = crossMethods1;
	}

	public CrossMethod addCrossMethods1(CrossMethod crossMethods1) {
		getCrossMethods1().add(crossMethods1);
		crossMethods1.setUser1(this);

		return crossMethods1;
	}

	public CrossMethod removeCrossMethods1(CrossMethod crossMethods1) {
		getCrossMethods1().remove(crossMethods1);
		crossMethods1.setUser1(null);

		return crossMethods1;
	}

	public List<CrossMethod> getCrossMethods2() {
		return this.crossMethods2;
	}

	public void setCrossMethods2(List<CrossMethod> crossMethods2) {
		this.crossMethods2 = crossMethods2;
	}

	public CrossMethod addCrossMethods2(CrossMethod crossMethods2) {
		getCrossMethods2().add(crossMethods2);
		crossMethods2.setUser2(this);

		return crossMethods2;
	}

	public CrossMethod removeCrossMethods2(CrossMethod crossMethods2) {
		getCrossMethods2().remove(crossMethods2);
		crossMethods2.setUser2(null);

		return crossMethods2;
	}

	public List<CrossParentageGm> getCrossParentageGms1() {
		return this.crossParentageGms1;
	}

	public void setCrossParentageGms1(List<CrossParentageGm> crossParentageGms1) {
		this.crossParentageGms1 = crossParentageGms1;
	}

	public CrossParentageGm addCrossParentageGms1(CrossParentageGm crossParentageGms1) {
		getCrossParentageGms1().add(crossParentageGms1);
		crossParentageGms1.setUser1(this);

		return crossParentageGms1;
	}

	public CrossParentageGm removeCrossParentageGms1(CrossParentageGm crossParentageGms1) {
		getCrossParentageGms1().remove(crossParentageGms1);
		crossParentageGms1.setUser1(null);

		return crossParentageGms1;
	}

	public List<CrossParentageGm> getCrossParentageGms2() {
		return this.crossParentageGms2;
	}

	public void setCrossParentageGms2(List<CrossParentageGm> crossParentageGms2) {
		this.crossParentageGms2 = crossParentageGms2;
	}

	public CrossParentageGm addCrossParentageGms2(CrossParentageGm crossParentageGms2) {
		getCrossParentageGms2().add(crossParentageGms2);
		crossParentageGms2.setUser2(this);

		return crossParentageGms2;
	}

	public CrossParentageGm removeCrossParentageGms2(CrossParentageGm crossParentageGms2) {
		getCrossParentageGms2().remove(crossParentageGms2);
		crossParentageGms2.setUser2(null);

		return crossParentageGms2;
	}

	public List<Crosscutting> getCrosscuttings1() {
		return this.crosscuttings1;
	}

	public void setCrosscuttings1(List<Crosscutting> crosscuttings1) {
		this.crosscuttings1 = crosscuttings1;
	}

	public Crosscutting addCrosscuttings1(Crosscutting crosscuttings1) {
		getCrosscuttings1().add(crosscuttings1);
		crosscuttings1.setUser1(this);

		return crosscuttings1;
	}

	public Crosscutting removeCrosscuttings1(Crosscutting crosscuttings1) {
		getCrosscuttings1().remove(crosscuttings1);
		crosscuttings1.setUser1(null);

		return crosscuttings1;
	}

	public List<Crosscutting> getCrosscuttings2() {
		return this.crosscuttings2;
	}

	public void setCrosscuttings2(List<Crosscutting> crosscuttings2) {
		this.crosscuttings2 = crosscuttings2;
	}

	public Crosscutting addCrosscuttings2(Crosscutting crosscuttings2) {
		getCrosscuttings2().add(crosscuttings2);
		crosscuttings2.setUser2(this);

		return crosscuttings2;
	}

	public Crosscutting removeCrosscuttings2(Crosscutting crosscuttings2) {
		getCrosscuttings2().remove(crosscuttings2);
		crosscuttings2.setUser2(null);

		return crosscuttings2;
	}

	public List<CrosscuttingTeam> getCrosscuttingTeams1() {
		return this.crosscuttingTeams1;
	}

	public void setCrosscuttingTeams1(List<CrosscuttingTeam> crosscuttingTeams1) {
		this.crosscuttingTeams1 = crosscuttingTeams1;
	}

	public CrosscuttingTeam addCrosscuttingTeams1(CrosscuttingTeam crosscuttingTeams1) {
		getCrosscuttingTeams1().add(crosscuttingTeams1);
		crosscuttingTeams1.setUser1(this);

		return crosscuttingTeams1;
	}

	public CrosscuttingTeam removeCrosscuttingTeams1(CrosscuttingTeam crosscuttingTeams1) {
		getCrosscuttingTeams1().remove(crosscuttingTeams1);
		crosscuttingTeams1.setUser1(null);

		return crosscuttingTeams1;
	}

	public List<CrosscuttingTeam> getCrosscuttingTeams2() {
		return this.crosscuttingTeams2;
	}

	public void setCrosscuttingTeams2(List<CrosscuttingTeam> crosscuttingTeams2) {
		this.crosscuttingTeams2 = crosscuttingTeams2;
	}

	public CrosscuttingTeam addCrosscuttingTeams2(CrosscuttingTeam crosscuttingTeams2) {
		getCrosscuttingTeams2().add(crosscuttingTeams2);
		crosscuttingTeams2.setUser2(this);

		return crosscuttingTeams2;
	}

	public CrosscuttingTeam removeCrosscuttingTeams2(CrosscuttingTeam crosscuttingTeams2) {
		getCrosscuttingTeams2().remove(crosscuttingTeams2);
		crosscuttingTeams2.setUser2(null);

		return crosscuttingTeams2;
	}

	public List<Entity> getEntities1() {
		return this.entities1;
	}

	public void setEntities1(List<Entity> entities1) {
		this.entities1 = entities1;
	}

	public Entity addEntities1(Entity entities1) {
		getEntities1().add(entities1);
		entities1.setUser1(this);

		return entities1;
	}

	public Entity removeEntities1(Entity entities1) {
		getEntities1().remove(entities1);
		entities1.setUser1(null);

		return entities1;
	}

	public List<Entity> getEntities2() {
		return this.entities2;
	}

	public void setEntities2(List<Entity> entities2) {
		this.entities2 = entities2;
	}

	public Entity addEntities2(Entity entities2) {
		getEntities2().add(entities2);
		entities2.setUser2(this);

		return entities2;
	}

	public Entity removeEntities2(Entity entities2) {
		getEntities2().remove(entities2);
		entities2.setUser2(null);

		return entities2;
	}

	public List<Facility> getFacilities1() {
		return this.facilities1;
	}

	public void setFacilities1(List<Facility> facilities1) {
		this.facilities1 = facilities1;
	}

	public Facility addFacilities1(Facility facilities1) {
		getFacilities1().add(facilities1);
		facilities1.setUser1(this);

		return facilities1;
	}

	public Facility removeFacilities1(Facility facilities1) {
		getFacilities1().remove(facilities1);
		facilities1.setUser1(null);

		return facilities1;
	}

	public List<Facility> getFacilities2() {
		return this.facilities2;
	}

	public void setFacilities2(List<Facility> facilities2) {
		this.facilities2 = facilities2;
	}

	public Facility addFacilities2(Facility facilities2) {
		getFacilities2().add(facilities2);
		facilities2.setUser2(this);

		return facilities2;
	}

	public Facility removeFacilities2(Facility facilities2) {
		getFacilities2().remove(facilities2);
		facilities2.setUser2(null);

		return facilities2;
	}

	public List<FacilityData> getFacilityData1() {
		return this.facilityData1;
	}

	public void setFacilityData1(List<FacilityData> facilityData1) {
		this.facilityData1 = facilityData1;
	}

	public FacilityData addFacilityData1(FacilityData facilityData1) {
		getFacilityData1().add(facilityData1);
		facilityData1.setUser1(this);

		return facilityData1;
	}

	public FacilityData removeFacilityData1(FacilityData facilityData1) {
		getFacilityData1().remove(facilityData1);
		facilityData1.setUser1(null);

		return facilityData1;
	}

	public List<FacilityData> getFacilityData2() {
		return this.facilityData2;
	}

	public void setFacilityData2(List<FacilityData> facilityData2) {
		this.facilityData2 = facilityData2;
	}

	public FacilityData addFacilityData2(FacilityData facilityData2) {
		getFacilityData2().add(facilityData2);
		facilityData2.setUser2(this);

		return facilityData2;
	}

	public FacilityData removeFacilityData2(FacilityData facilityData2) {
		getFacilityData2().remove(facilityData2);
		facilityData2.setUser2(null);

		return facilityData2;
	}

	public List<FacilityMetadata> getFacilityMetadata1() {
		return this.facilityMetadata1;
	}

	public void setFacilityMetadata1(List<FacilityMetadata> facilityMetadata1) {
		this.facilityMetadata1 = facilityMetadata1;
	}

	public FacilityMetadata addFacilityMetadata1(FacilityMetadata facilityMetadata1) {
		getFacilityMetadata1().add(facilityMetadata1);
		facilityMetadata1.setUser1(this);

		return facilityMetadata1;
	}

	public FacilityMetadata removeFacilityMetadata1(FacilityMetadata facilityMetadata1) {
		getFacilityMetadata1().remove(facilityMetadata1);
		facilityMetadata1.setUser1(null);

		return facilityMetadata1;
	}

	public List<FacilityMetadata> getFacilityMetadata2() {
		return this.facilityMetadata2;
	}

	public void setFacilityMetadata2(List<FacilityMetadata> facilityMetadata2) {
		this.facilityMetadata2 = facilityMetadata2;
	}

	public FacilityMetadata addFacilityMetadata2(FacilityMetadata facilityMetadata2) {
		getFacilityMetadata2().add(facilityMetadata2);
		facilityMetadata2.setUser2(this);

		return facilityMetadata2;
	}

	public FacilityMetadata removeFacilityMetadata2(FacilityMetadata facilityMetadata2) {
		getFacilityMetadata2().remove(facilityMetadata2);
		facilityMetadata2.setUser2(null);

		return facilityMetadata2;
	}

	public List<FacilityType> getFacilityTypes1() {
		return this.facilityTypes1;
	}

	public void setFacilityTypes1(List<FacilityType> facilityTypes1) {
		this.facilityTypes1 = facilityTypes1;
	}

	public FacilityType addFacilityTypes1(FacilityType facilityTypes1) {
		getFacilityTypes1().add(facilityTypes1);
		facilityTypes1.setUser1(this);

		return facilityTypes1;
	}

	public FacilityType removeFacilityTypes1(FacilityType facilityTypes1) {
		getFacilityTypes1().remove(facilityTypes1);
		facilityTypes1.setUser1(null);

		return facilityTypes1;
	}

	public List<FacilityType> getFacilityTypes2() {
		return this.facilityTypes2;
	}

	public void setFacilityTypes2(List<FacilityType> facilityTypes2) {
		this.facilityTypes2 = facilityTypes2;
	}

	public FacilityType addFacilityTypes2(FacilityType facilityTypes2) {
		getFacilityTypes2().add(facilityTypes2);
		facilityTypes2.setUser2(this);

		return facilityTypes2;
	}

	public FacilityType removeFacilityTypes2(FacilityType facilityTypes2) {
		getFacilityTypes2().remove(facilityTypes2);
		facilityTypes2.setUser2(null);

		return facilityTypes2;
	}

	public List<Family> getFamilies1() {
		return this.families1;
	}

	public void setFamilies1(List<Family> families1) {
		this.families1 = families1;
	}

	public Family addFamilies1(Family families1) {
		getFamilies1().add(families1);
		families1.setUser1(this);

		return families1;
	}

	public Family removeFamilies1(Family families1) {
		getFamilies1().remove(families1);
		families1.setUser1(null);

		return families1;
	}

	public List<Family> getFamilies2() {
		return this.families2;
	}

	public void setFamilies2(List<Family> families2) {
		this.families2 = families2;
	}

	public Family addFamilies2(Family families2) {
		getFamilies2().add(families2);
		families2.setUser2(this);

		return families2;
	}

	public Family removeFamilies2(Family families2) {
		getFamilies2().remove(families2);
		families2.setUser2(null);

		return families2;
	}

	public List<Formula> getFormulas1() {
		return this.formulas1;
	}

	public void setFormulas1(List<Formula> formulas1) {
		this.formulas1 = formulas1;
	}

	public Formula addFormulas1(Formula formulas1) {
		getFormulas1().add(formulas1);
		formulas1.setUser1(this);

		return formulas1;
	}

	public Formula removeFormulas1(Formula formulas1) {
		getFormulas1().remove(formulas1);
		formulas1.setUser1(null);

		return formulas1;
	}

	public List<Formula> getFormulas2() {
		return this.formulas2;
	}

	public void setFormulas2(List<Formula> formulas2) {
		this.formulas2 = formulas2;
	}

	public Formula addFormulas2(Formula formulas2) {
		getFormulas2().add(formulas2);
		formulas2.setUser2(this);

		return formulas2;
	}

	public Formula removeFormulas2(Formula formulas2) {
		getFormulas2().remove(formulas2);
		formulas2.setUser2(null);

		return formulas2;
	}

	public List<FormulaParameter> getFormulaParameters1() {
		return this.formulaParameters1;
	}

	public void setFormulaParameters1(List<FormulaParameter> formulaParameters1) {
		this.formulaParameters1 = formulaParameters1;
	}

	public FormulaParameter addFormulaParameters1(FormulaParameter formulaParameters1) {
		getFormulaParameters1().add(formulaParameters1);
		formulaParameters1.setUser1(this);

		return formulaParameters1;
	}

	public FormulaParameter removeFormulaParameters1(FormulaParameter formulaParameters1) {
		getFormulaParameters1().remove(formulaParameters1);
		formulaParameters1.setUser1(null);

		return formulaParameters1;
	}

	public List<FormulaParameter> getFormulaParameters2() {
		return this.formulaParameters2;
	}

	public void setFormulaParameters2(List<FormulaParameter> formulaParameters2) {
		this.formulaParameters2 = formulaParameters2;
	}

	public FormulaParameter addFormulaParameters2(FormulaParameter formulaParameters2) {
		getFormulaParameters2().add(formulaParameters2);
		formulaParameters2.setUser2(this);

		return formulaParameters2;
	}

	public FormulaParameter removeFormulaParameters2(FormulaParameter formulaParameters2) {
		getFormulaParameters2().remove(formulaParameters2);
		formulaParameters2.setUser2(null);

		return formulaParameters2;
	}

	public List<Geolocation> getGeolocations1() {
		return this.geolocations1;
	}

	public void setGeolocations1(List<Geolocation> geolocations1) {
		this.geolocations1 = geolocations1;
	}

	public Geolocation addGeolocations1(Geolocation geolocations1) {
		getGeolocations1().add(geolocations1);
		geolocations1.setUser1(this);

		return geolocations1;
	}

	public Geolocation removeGeolocations1(Geolocation geolocations1) {
		getGeolocations1().remove(geolocations1);
		geolocations1.setUser1(null);

		return geolocations1;
	}

	public List<Geolocation> getGeolocations2() {
		return this.geolocations2;
	}

	public void setGeolocations2(List<Geolocation> geolocations2) {
		this.geolocations2 = geolocations2;
	}

	public Geolocation addGeolocations2(Geolocation geolocations2) {
		getGeolocations2().add(geolocations2);
		geolocations2.setUser2(this);

		return geolocations2;
	}

	public Geolocation removeGeolocations2(Geolocation geolocations2) {
		getGeolocations2().remove(geolocations2);
		geolocations2.setUser2(null);

		return geolocations2;
	}

	public List<GeolocationData> getGeolocationData1() {
		return this.geolocationData1;
	}

	public void setGeolocationData1(List<GeolocationData> geolocationData1) {
		this.geolocationData1 = geolocationData1;
	}

	public GeolocationData addGeolocationData1(GeolocationData geolocationData1) {
		getGeolocationData1().add(geolocationData1);
		geolocationData1.setUser1(this);

		return geolocationData1;
	}

	public GeolocationData removeGeolocationData1(GeolocationData geolocationData1) {
		getGeolocationData1().remove(geolocationData1);
		geolocationData1.setUser1(null);

		return geolocationData1;
	}

	public List<GeolocationData> getGeolocationData2() {
		return this.geolocationData2;
	}

	public void setGeolocationData2(List<GeolocationData> geolocationData2) {
		this.geolocationData2 = geolocationData2;
	}

	public GeolocationData addGeolocationData2(GeolocationData geolocationData2) {
		getGeolocationData2().add(geolocationData2);
		geolocationData2.setUser2(this);

		return geolocationData2;
	}

	public GeolocationData removeGeolocationData2(GeolocationData geolocationData2) {
		getGeolocationData2().remove(geolocationData2);
		geolocationData2.setUser2(null);

		return geolocationData2;
	}

	public List<GeolocationMetadata> getGeolocationMetadata1() {
		return this.geolocationMetadata1;
	}

	public void setGeolocationMetadata1(List<GeolocationMetadata> geolocationMetadata1) {
		this.geolocationMetadata1 = geolocationMetadata1;
	}

	public GeolocationMetadata addGeolocationMetadata1(GeolocationMetadata geolocationMetadata1) {
		getGeolocationMetadata1().add(geolocationMetadata1);
		geolocationMetadata1.setUser1(this);

		return geolocationMetadata1;
	}

	public GeolocationMetadata removeGeolocationMetadata1(GeolocationMetadata geolocationMetadata1) {
		getGeolocationMetadata1().remove(geolocationMetadata1);
		geolocationMetadata1.setUser1(null);

		return geolocationMetadata1;
	}

	public List<GeolocationMetadata> getGeolocationMetadata2() {
		return this.geolocationMetadata2;
	}

	public void setGeolocationMetadata2(List<GeolocationMetadata> geolocationMetadata2) {
		this.geolocationMetadata2 = geolocationMetadata2;
	}

	public GeolocationMetadata addGeolocationMetadata2(GeolocationMetadata geolocationMetadata2) {
		getGeolocationMetadata2().add(geolocationMetadata2);
		geolocationMetadata2.setUser2(this);

		return geolocationMetadata2;
	}

	public GeolocationMetadata removeGeolocationMetadata2(GeolocationMetadata geolocationMetadata2) {
		getGeolocationMetadata2().remove(geolocationMetadata2);
		geolocationMetadata2.setUser2(null);

		return geolocationMetadata2;
	}

	public List<GlocnHistory> getGlocnHistories() {
		return this.glocnHistories;
	}

	public void setGlocnHistories(List<GlocnHistory> glocnHistories) {
		this.glocnHistories = glocnHistories;
	}

	public GlocnHistory addGlocnHistory(GlocnHistory glocnHistory) {
		getGlocnHistories().add(glocnHistory);
		glocnHistory.setUser(this);

		return glocnHistory;
	}

	public GlocnHistory removeGlocnHistory(GlocnHistory glocnHistory) {
		getGlocnHistories().remove(glocnHistory);
		glocnHistory.setUser(null);

		return glocnHistory;
	}

	public List<GlocnYearSequence> getGlocnYearSequences() {
		return this.glocnYearSequences;
	}

	public void setGlocnYearSequences(List<GlocnYearSequence> glocnYearSequences) {
		this.glocnYearSequences = glocnYearSequences;
	}

	public GlocnYearSequence addGlocnYearSequence(GlocnYearSequence glocnYearSequence) {
		getGlocnYearSequences().add(glocnYearSequence);
		glocnYearSequence.setUser(this);

		return glocnYearSequence;
	}

	public GlocnYearSequence removeGlocnYearSequence(GlocnYearSequence glocnYearSequence) {
		getGlocnYearSequences().remove(glocnYearSequence);
		glocnYearSequence.setUser(null);

		return glocnYearSequence;
	}

	public List<Institute> getInstitutes1() {
		return this.institutes1;
	}

	public void setInstitutes1(List<Institute> institutes1) {
		this.institutes1 = institutes1;
	}

	public Institute addInstitutes1(Institute institutes1) {
		getInstitutes1().add(institutes1);
		institutes1.setUser1(this);

		return institutes1;
	}

	public Institute removeInstitutes1(Institute institutes1) {
		getInstitutes1().remove(institutes1);
		institutes1.setUser1(null);

		return institutes1;
	}

	public List<Institute> getInstitutes2() {
		return this.institutes2;
	}

	public void setInstitutes2(List<Institute> institutes2) {
		this.institutes2 = institutes2;
	}

	public Institute addInstitutes2(Institute institutes2) {
		getInstitutes2().add(institutes2);
		institutes2.setUser2(this);

		return institutes2;
	}

	public Institute removeInstitutes2(Institute institutes2) {
		getInstitutes2().remove(institutes2);
		institutes2.setUser2(null);

		return institutes2;
	}

	public List<Instruction> getInstructions1() {
		return this.instructions1;
	}

	public void setInstructions1(List<Instruction> instructions1) {
		this.instructions1 = instructions1;
	}

	public Instruction addInstructions1(Instruction instructions1) {
		getInstructions1().add(instructions1);
		instructions1.setUser1(this);

		return instructions1;
	}

	public Instruction removeInstructions1(Instruction instructions1) {
		getInstructions1().remove(instructions1);
		instructions1.setUser1(null);

		return instructions1;
	}

	public List<Instruction> getInstructions2() {
		return this.instructions2;
	}

	public void setInstructions2(List<Instruction> instructions2) {
		this.instructions2 = instructions2;
	}

	public Instruction addInstructions2(Instruction instructions2) {
		getInstructions2().add(instructions2);
		instructions2.setUser2(this);

		return instructions2;
	}

	public Instruction removeInstructions2(Instruction instructions2) {
		getInstructions2().remove(instructions2);
		instructions2.setUser2(null);

		return instructions2;
	}

	public List<Item> getItems1() {
		return this.items1;
	}

	public void setItems1(List<Item> items1) {
		this.items1 = items1;
	}

	public Item addItems1(Item items1) {
		getItems1().add(items1);
		items1.setUser1(this);

		return items1;
	}

	public Item removeItems1(Item items1) {
		getItems1().remove(items1);
		items1.setUser1(null);

		return items1;
	}

	public List<Item> getItems2() {
		return this.items2;
	}

	public void setItems2(List<Item> items2) {
		this.items2 = items2;
	}

	public Item addItems2(Item items2) {
		getItems2().add(items2);
		items2.setUser2(this);

		return items2;
	}

	public Item removeItems2(Item items2) {
		getItems2().remove(items2);
		items2.setUser2(null);

		return items2;
	}

	public List<ItemAction> getItemActions1() {
		return this.itemActions1;
	}

	public void setItemActions1(List<ItemAction> itemActions1) {
		this.itemActions1 = itemActions1;
	}

	public ItemAction addItemActions1(ItemAction itemActions1) {
		getItemActions1().add(itemActions1);
		itemActions1.setUser1(this);

		return itemActions1;
	}

	public ItemAction removeItemActions1(ItemAction itemActions1) {
		getItemActions1().remove(itemActions1);
		itemActions1.setUser1(null);

		return itemActions1;
	}

	public List<ItemAction> getItemActions2() {
		return this.itemActions2;
	}

	public void setItemActions2(List<ItemAction> itemActions2) {
		this.itemActions2 = itemActions2;
	}

	public ItemAction addItemActions2(ItemAction itemActions2) {
		getItemActions2().add(itemActions2);
		itemActions2.setUser2(this);

		return itemActions2;
	}

	public ItemAction removeItemActions2(ItemAction itemActions2) {
		getItemActions2().remove(itemActions2);
		itemActions2.setUser2(null);

		return itemActions2;
	}

	public List<ItemMetadata> getItemMetadata1() {
		return this.itemMetadata1;
	}

	public void setItemMetadata1(List<ItemMetadata> itemMetadata1) {
		this.itemMetadata1 = itemMetadata1;
	}

	public ItemMetadata addItemMetadata1(ItemMetadata itemMetadata1) {
		getItemMetadata1().add(itemMetadata1);
		itemMetadata1.setUser1(this);

		return itemMetadata1;
	}

	public ItemMetadata removeItemMetadata1(ItemMetadata itemMetadata1) {
		getItemMetadata1().remove(itemMetadata1);
		itemMetadata1.setUser1(null);

		return itemMetadata1;
	}

	public List<ItemMetadata> getItemMetadata2() {
		return this.itemMetadata2;
	}

	public void setItemMetadata2(List<ItemMetadata> itemMetadata2) {
		this.itemMetadata2 = itemMetadata2;
	}

	public ItemMetadata addItemMetadata2(ItemMetadata itemMetadata2) {
		getItemMetadata2().add(itemMetadata2);
		itemMetadata2.setUser2(this);

		return itemMetadata2;
	}

	public ItemMetadata removeItemMetadata2(ItemMetadata itemMetadata2) {
		getItemMetadata2().remove(itemMetadata2);
		itemMetadata2.setUser2(null);

		return itemMetadata2;
	}

	public List<ItemRecord> getItemRecords1() {
		return this.itemRecords1;
	}

	public void setItemRecords1(List<ItemRecord> itemRecords1) {
		this.itemRecords1 = itemRecords1;
	}

	public ItemRecord addItemRecords1(ItemRecord itemRecords1) {
		getItemRecords1().add(itemRecords1);
		itemRecords1.setUser1(this);

		return itemRecords1;
	}

	public ItemRecord removeItemRecords1(ItemRecord itemRecords1) {
		getItemRecords1().remove(itemRecords1);
		itemRecords1.setUser1(null);

		return itemRecords1;
	}

	public List<ItemRecord> getItemRecords2() {
		return this.itemRecords2;
	}

	public void setItemRecords2(List<ItemRecord> itemRecords2) {
		this.itemRecords2 = itemRecords2;
	}

	public ItemRecord addItemRecords2(ItemRecord itemRecords2) {
		getItemRecords2().add(itemRecords2);
		itemRecords2.setUser2(this);

		return itemRecords2;
	}

	public ItemRecord removeItemRecords2(ItemRecord itemRecords2) {
		getItemRecords2().remove(itemRecords2);
		itemRecords2.setUser2(null);

		return itemRecords2;
	}

	public List<ItemRelation> getItemRelations1() {
		return this.itemRelations1;
	}

	public void setItemRelations1(List<ItemRelation> itemRelations1) {
		this.itemRelations1 = itemRelations1;
	}

	public ItemRelation addItemRelations1(ItemRelation itemRelations1) {
		getItemRelations1().add(itemRelations1);
		itemRelations1.setUser1(this);

		return itemRelations1;
	}

	public ItemRelation removeItemRelations1(ItemRelation itemRelations1) {
		getItemRelations1().remove(itemRelations1);
		itemRelations1.setUser1(null);

		return itemRelations1;
	}

	public List<ItemRelation> getItemRelations2() {
		return this.itemRelations2;
	}

	public void setItemRelations2(List<ItemRelation> itemRelations2) {
		this.itemRelations2 = itemRelations2;
	}

	public ItemRelation addItemRelations2(ItemRelation itemRelations2) {
		getItemRelations2().add(itemRelations2);
		itemRelations2.setUser2(this);

		return itemRelations2;
	}

	public ItemRelation removeItemRelations2(ItemRelation itemRelations2) {
		getItemRelations2().remove(itemRelations2);
		itemRelations2.setUser2(null);

		return itemRelations2;
	}

	public List<ItemService> getItemServices1() {
		return this.itemServices1;
	}

	public void setItemServices1(List<ItemService> itemServices1) {
		this.itemServices1 = itemServices1;
	}

	public ItemService addItemServices1(ItemService itemServices1) {
		getItemServices1().add(itemServices1);
		itemServices1.setUser1(this);

		return itemServices1;
	}

	public ItemService removeItemServices1(ItemService itemServices1) {
		getItemServices1().remove(itemServices1);
		itemServices1.setUser1(null);

		return itemServices1;
	}

	public List<ItemService> getItemServices2() {
		return this.itemServices2;
	}

	public void setItemServices2(List<ItemService> itemServices2) {
		this.itemServices2 = itemServices2;
	}

	public ItemService addItemServices2(ItemService itemServices2) {
		getItemServices2().add(itemServices2);
		itemServices2.setUser2(this);

		return itemServices2;
	}

	public ItemService removeItemServices2(ItemService itemServices2) {
		getItemServices2().remove(itemServices2);
		itemServices2.setUser2(null);

		return itemServices2;
	}

	public List<ItemServiceTeam> getItemServiceTeams1() {
		return this.itemServiceTeams1;
	}

	public void setItemServiceTeams1(List<ItemServiceTeam> itemServiceTeams1) {
		this.itemServiceTeams1 = itemServiceTeams1;
	}

	public ItemServiceTeam addItemServiceTeams1(ItemServiceTeam itemServiceTeams1) {
		getItemServiceTeams1().add(itemServiceTeams1);
		itemServiceTeams1.setUser1(this);

		return itemServiceTeams1;
	}

	public ItemServiceTeam removeItemServiceTeams1(ItemServiceTeam itemServiceTeams1) {
		getItemServiceTeams1().remove(itemServiceTeams1);
		itemServiceTeams1.setUser1(null);

		return itemServiceTeams1;
	}

	public List<ItemServiceTeam> getItemServiceTeams2() {
		return this.itemServiceTeams2;
	}

	public void setItemServiceTeams2(List<ItemServiceTeam> itemServiceTeams2) {
		this.itemServiceTeams2 = itemServiceTeams2;
	}

	public ItemServiceTeam addItemServiceTeams2(ItemServiceTeam itemServiceTeams2) {
		getItemServiceTeams2().add(itemServiceTeams2);
		itemServiceTeams2.setUser2(this);

		return itemServiceTeams2;
	}

	public ItemServiceTeam removeItemServiceTeams2(ItemServiceTeam itemServiceTeams2) {
		getItemServiceTeams2().remove(itemServiceTeams2);
		itemServiceTeams2.setUser2(null);

		return itemServiceTeams2;
	}

	public List<Method> getMethods1() {
		return this.methods1;
	}

	public void setMethods1(List<Method> methods1) {
		this.methods1 = methods1;
	}

	public Method addMethods1(Method methods1) {
		getMethods1().add(methods1);
		methods1.setUser1(this);

		return methods1;
	}

	public Method removeMethods1(Method methods1) {
		getMethods1().remove(methods1);
		methods1.setUser1(null);

		return methods1;
	}

	public List<Method> getMethods2() {
		return this.methods2;
	}

	public void setMethods2(List<Method> methods2) {
		this.methods2 = methods2;
	}

	public Method addMethods2(Method methods2) {
		getMethods2().add(methods2);
		methods2.setUser2(this);

		return methods2;
	}

	public Method removeMethods2(Method methods2) {
		getMethods2().remove(methods2);
		methods2.setUser2(null);

		return methods2;
	}

	public List<Notification> getNotifications1() {
		return this.notifications1;
	}

	public void setNotifications1(List<Notification> notifications1) {
		this.notifications1 = notifications1;
	}

	public Notification addNotifications1(Notification notifications1) {
		getNotifications1().add(notifications1);
		notifications1.setUser1(this);

		return notifications1;
	}

	public Notification removeNotifications1(Notification notifications1) {
		getNotifications1().remove(notifications1);
		notifications1.setUser1(null);

		return notifications1;
	}

	public List<Notification> getNotifications2() {
		return this.notifications2;
	}

	public void setNotifications2(List<Notification> notifications2) {
		this.notifications2 = notifications2;
	}

	public Notification addNotifications2(Notification notifications2) {
		getNotifications2().add(notifications2);
		notifications2.setUser2(this);

		return notifications2;
	}

	public Notification removeNotifications2(Notification notifications2) {
		getNotifications2().remove(notifications2);
		notifications2.setUser2(null);

		return notifications2;
	}

	public List<NotificationApplicationRelation> getNotificationApplicationRelations1() {
		return this.notificationApplicationRelations1;
	}

	public void setNotificationApplicationRelations1(List<NotificationApplicationRelation> notificationApplicationRelations1) {
		this.notificationApplicationRelations1 = notificationApplicationRelations1;
	}

	public NotificationApplicationRelation addNotificationApplicationRelations1(NotificationApplicationRelation notificationApplicationRelations1) {
		getNotificationApplicationRelations1().add(notificationApplicationRelations1);
		notificationApplicationRelations1.setUser1(this);

		return notificationApplicationRelations1;
	}

	public NotificationApplicationRelation removeNotificationApplicationRelations1(NotificationApplicationRelation notificationApplicationRelations1) {
		getNotificationApplicationRelations1().remove(notificationApplicationRelations1);
		notificationApplicationRelations1.setUser1(null);

		return notificationApplicationRelations1;
	}

	public List<NotificationApplicationRelation> getNotificationApplicationRelations2() {
		return this.notificationApplicationRelations2;
	}

	public void setNotificationApplicationRelations2(List<NotificationApplicationRelation> notificationApplicationRelations2) {
		this.notificationApplicationRelations2 = notificationApplicationRelations2;
	}

	public NotificationApplicationRelation addNotificationApplicationRelations2(NotificationApplicationRelation notificationApplicationRelations2) {
		getNotificationApplicationRelations2().add(notificationApplicationRelations2);
		notificationApplicationRelations2.setUser2(this);

		return notificationApplicationRelations2;
	}

	public NotificationApplicationRelation removeNotificationApplicationRelations2(NotificationApplicationRelation notificationApplicationRelations2) {
		getNotificationApplicationRelations2().remove(notificationApplicationRelations2);
		notificationApplicationRelations2.setUser2(null);

		return notificationApplicationRelations2;
	}

	public List<Organization> getOrganizations1() {
		return this.organizations1;
	}

	public void setOrganizations1(List<Organization> organizations1) {
		this.organizations1 = organizations1;
	}

	public Organization addOrganizations1(Organization organizations1) {
		getOrganizations1().add(organizations1);
		organizations1.setUser1(this);

		return organizations1;
	}

	public Organization removeOrganizations1(Organization organizations1) {
		getOrganizations1().remove(organizations1);
		organizations1.setUser1(null);

		return organizations1;
	}

	public List<Organization> getOrganizations2() {
		return this.organizations2;
	}

	public void setOrganizations2(List<Organization> organizations2) {
		this.organizations2 = organizations2;
	}

	public Organization addOrganizations2(Organization organizations2) {
		getOrganizations2().add(organizations2);
		organizations2.setUser2(this);

		return organizations2;
	}

	public Organization removeOrganizations2(Organization organizations2) {
		getOrganizations2().remove(organizations2);
		organizations2.setUser2(null);

		return organizations2;
	}

	public List<Phase> getPhases1() {
		return this.phases1;
	}

	public void setPhases1(List<Phase> phases1) {
		this.phases1 = phases1;
	}

	public Phase addPhases1(Phase phases1) {
		getPhases1().add(phases1);
		phases1.setUser1(this);

		return phases1;
	}

	public Phase removePhases1(Phase phases1) {
		getPhases1().remove(phases1);
		phases1.setUser1(null);

		return phases1;
	}

	public List<Phase> getPhases2() {
		return this.phases2;
	}

	public void setPhases2(List<Phase> phases2) {
		this.phases2 = phases2;
	}

	public Phase addPhases2(Phase phases2) {
		getPhases2().add(phases2);
		phases2.setUser2(this);

		return phases2;
	}

	public Phase removePhases2(Phase phases2) {
		getPhases2().remove(phases2);
		phases2.setUser2(null);

		return phases2;
	}

	public List<Pipeline> getPipelines1() {
		return this.pipelines1;
	}

	public void setPipelines1(List<Pipeline> pipelines1) {
		this.pipelines1 = pipelines1;
	}

	public Pipeline addPipelines1(Pipeline pipelines1) {
		getPipelines1().add(pipelines1);
		pipelines1.setUser1(this);

		return pipelines1;
	}

	public Pipeline removePipelines1(Pipeline pipelines1) {
		getPipelines1().remove(pipelines1);
		pipelines1.setUser1(null);

		return pipelines1;
	}

	public List<Pipeline> getPipelines2() {
		return this.pipelines2;
	}

	public void setPipelines2(List<Pipeline> pipelines2) {
		this.pipelines2 = pipelines2;
	}

	public Pipeline addPipelines2(Pipeline pipelines2) {
		getPipelines2().add(pipelines2);
		pipelines2.setUser2(this);

		return pipelines2;
	}

	public Pipeline removePipelines2(Pipeline pipelines2) {
		getPipelines2().remove(pipelines2);
		pipelines2.setUser2(null);

		return pipelines2;
	}

	public List<PipelineTeam> getPipelineTeams1() {
		return this.pipelineTeams1;
	}

	public void setPipelineTeams1(List<PipelineTeam> pipelineTeams1) {
		this.pipelineTeams1 = pipelineTeams1;
	}

	public PipelineTeam addPipelineTeams1(PipelineTeam pipelineTeams1) {
		getPipelineTeams1().add(pipelineTeams1);
		pipelineTeams1.setUser1(this);

		return pipelineTeams1;
	}

	public PipelineTeam removePipelineTeams1(PipelineTeam pipelineTeams1) {
		getPipelineTeams1().remove(pipelineTeams1);
		pipelineTeams1.setUser1(null);

		return pipelineTeams1;
	}

	public List<PipelineTeam> getPipelineTeams2() {
		return this.pipelineTeams2;
	}

	public void setPipelineTeams2(List<PipelineTeam> pipelineTeams2) {
		this.pipelineTeams2 = pipelineTeams2;
	}

	public PipelineTeam addPipelineTeams2(PipelineTeam pipelineTeams2) {
		getPipelineTeams2().add(pipelineTeams2);
		pipelineTeams2.setUser2(this);

		return pipelineTeams2;
	}

	public PipelineTeam removePipelineTeams2(PipelineTeam pipelineTeams2) {
		getPipelineTeams2().remove(pipelineTeams2);
		pipelineTeams2.setUser2(null);

		return pipelineTeams2;
	}

	public List<Place> getPlaces1() {
		return this.places1;
	}

	public void setPlaces1(List<Place> places1) {
		this.places1 = places1;
	}

	public Place addPlaces1(Place places1) {
		getPlaces1().add(places1);
		places1.setUser1(this);

		return places1;
	}

	public Place removePlaces1(Place places1) {
		getPlaces1().remove(places1);
		places1.setUser1(null);

		return places1;
	}

	public List<Place> getPlaces2() {
		return this.places2;
	}

	public void setPlaces2(List<Place> places2) {
		this.places2 = places2;
	}

	public Place addPlaces2(Place places2) {
		getPlaces2().add(places2);
		places2.setUser2(this);

		return places2;
	}

	public Place removePlaces2(Place places2) {
		getPlaces2().remove(places2);
		places2.setUser2(null);

		return places2;
	}

	public List<PlaceData> getPlaceData1() {
		return this.placeData1;
	}

	public void setPlaceData1(List<PlaceData> placeData1) {
		this.placeData1 = placeData1;
	}

	public PlaceData addPlaceData1(PlaceData placeData1) {
		getPlaceData1().add(placeData1);
		placeData1.setUser1(this);

		return placeData1;
	}

	public PlaceData removePlaceData1(PlaceData placeData1) {
		getPlaceData1().remove(placeData1);
		placeData1.setUser1(null);

		return placeData1;
	}

	public List<PlaceData> getPlaceData2() {
		return this.placeData2;
	}

	public void setPlaceData2(List<PlaceData> placeData2) {
		this.placeData2 = placeData2;
	}

	public PlaceData addPlaceData2(PlaceData placeData2) {
		getPlaceData2().add(placeData2);
		placeData2.setUser2(this);

		return placeData2;
	}

	public PlaceData removePlaceData2(PlaceData placeData2) {
		getPlaceData2().remove(placeData2);
		placeData2.setUser2(null);

		return placeData2;
	}

	public List<PlaceMetadata> getPlaceMetadata1() {
		return this.placeMetadata1;
	}

	public void setPlaceMetadata1(List<PlaceMetadata> placeMetadata1) {
		this.placeMetadata1 = placeMetadata1;
	}

	public PlaceMetadata addPlaceMetadata1(PlaceMetadata placeMetadata1) {
		getPlaceMetadata1().add(placeMetadata1);
		placeMetadata1.setUser1(this);

		return placeMetadata1;
	}

	public PlaceMetadata removePlaceMetadata1(PlaceMetadata placeMetadata1) {
		getPlaceMetadata1().remove(placeMetadata1);
		placeMetadata1.setUser1(null);

		return placeMetadata1;
	}

	public List<PlaceMetadata> getPlaceMetadata2() {
		return this.placeMetadata2;
	}

	public void setPlaceMetadata2(List<PlaceMetadata> placeMetadata2) {
		this.placeMetadata2 = placeMetadata2;
	}

	public PlaceMetadata addPlaceMetadata2(PlaceMetadata placeMetadata2) {
		getPlaceMetadata2().add(placeMetadata2);
		placeMetadata2.setUser2(this);

		return placeMetadata2;
	}

	public PlaceMetadata removePlaceMetadata2(PlaceMetadata placeMetadata2) {
		getPlaceMetadata2().remove(placeMetadata2);
		placeMetadata2.setUser2(null);

		return placeMetadata2;
	}

	public List<PlaceSeason> getPlaceSeasons1() {
		return this.placeSeasons1;
	}

	public void setPlaceSeasons1(List<PlaceSeason> placeSeasons1) {
		this.placeSeasons1 = placeSeasons1;
	}

	public PlaceSeason addPlaceSeasons1(PlaceSeason placeSeasons1) {
		getPlaceSeasons1().add(placeSeasons1);
		placeSeasons1.setUser1(this);

		return placeSeasons1;
	}

	public PlaceSeason removePlaceSeasons1(PlaceSeason placeSeasons1) {
		getPlaceSeasons1().remove(placeSeasons1);
		placeSeasons1.setUser1(null);

		return placeSeasons1;
	}

	public List<PlaceSeason> getPlaceSeasons2() {
		return this.placeSeasons2;
	}

	public void setPlaceSeasons2(List<PlaceSeason> placeSeasons2) {
		this.placeSeasons2 = placeSeasons2;
	}

	public PlaceSeason addPlaceSeasons2(PlaceSeason placeSeasons2) {
		getPlaceSeasons2().add(placeSeasons2);
		placeSeasons2.setUser2(this);

		return placeSeasons2;
	}

	public PlaceSeason removePlaceSeasons2(PlaceSeason placeSeasons2) {
		getPlaceSeasons2().remove(placeSeasons2);
		placeSeasons2.setUser2(null);

		return placeSeasons2;
	}

	public List<Product> getProducts1() {
		return this.products1;
	}

	public void setProducts1(List<Product> products1) {
		this.products1 = products1;
	}

	public Product addProducts1(Product products1) {
		getProducts1().add(products1);
		products1.setUser1(this);

		return products1;
	}

	public Product removeProducts1(Product products1) {
		getProducts1().remove(products1);
		products1.setUser1(null);

		return products1;
	}

	public List<Product> getProducts2() {
		return this.products2;
	}

	public void setProducts2(List<Product> products2) {
		this.products2 = products2;
	}

	public Product addProducts2(Product products2) {
		getProducts2().add(products2);
		products2.setUser2(this);

		return products2;
	}

	public Product removeProducts2(Product products2) {
		getProducts2().remove(products2);
		products2.setUser2(null);

		return products2;
	}

	public List<ProductGid> getProductGids1() {
		return this.productGids1;
	}

	public void setProductGids1(List<ProductGid> productGids1) {
		this.productGids1 = productGids1;
	}

	public ProductGid addProductGids1(ProductGid productGids1) {
		getProductGids1().add(productGids1);
		productGids1.setUser1(this);

		return productGids1;
	}

	public ProductGid removeProductGids1(ProductGid productGids1) {
		getProductGids1().remove(productGids1);
		productGids1.setUser1(null);

		return productGids1;
	}

	public List<ProductGid> getProductGids2() {
		return this.productGids2;
	}

	public void setProductGids2(List<ProductGid> productGids2) {
		this.productGids2 = productGids2;
	}

	public ProductGid addProductGids2(ProductGid productGids2) {
		getProductGids2().add(productGids2);
		productGids2.setUser2(this);

		return productGids2;
	}

	public ProductGid removeProductGids2(ProductGid productGids2) {
		getProductGids2().remove(productGids2);
		productGids2.setUser2(null);

		return productGids2;
	}

	public List<ProductList> getProductLists1() {
		return this.productLists1;
	}

	public void setProductLists1(List<ProductList> productLists1) {
		this.productLists1 = productLists1;
	}

	public ProductList addProductLists1(ProductList productLists1) {
		getProductLists1().add(productLists1);
		productLists1.setUser1(this);

		return productLists1;
	}

	public ProductList removeProductLists1(ProductList productLists1) {
		getProductLists1().remove(productLists1);
		productLists1.setUser1(null);

		return productLists1;
	}

	public List<ProductList> getProductLists2() {
		return this.productLists2;
	}

	public void setProductLists2(List<ProductList> productLists2) {
		this.productLists2 = productLists2;
	}

	public ProductList addProductLists2(ProductList productLists2) {
		getProductLists2().add(productLists2);
		productLists2.setUser2(this);

		return productLists2;
	}

	public ProductList removeProductLists2(ProductList productLists2) {
		getProductLists2().remove(productLists2);
		productLists2.setUser2(null);

		return productLists2;
	}

	public List<ProductListMember> getProductListMembers1() {
		return this.productListMembers1;
	}

	public void setProductListMembers1(List<ProductListMember> productListMembers1) {
		this.productListMembers1 = productListMembers1;
	}

	public ProductListMember addProductListMembers1(ProductListMember productListMembers1) {
		getProductListMembers1().add(productListMembers1);
		productListMembers1.setUser1(this);

		return productListMembers1;
	}

	public ProductListMember removeProductListMembers1(ProductListMember productListMembers1) {
		getProductListMembers1().remove(productListMembers1);
		productListMembers1.setUser1(null);

		return productListMembers1;
	}

	public List<ProductListMember> getProductListMembers2() {
		return this.productListMembers2;
	}

	public void setProductListMembers2(List<ProductListMember> productListMembers2) {
		this.productListMembers2 = productListMembers2;
	}

	public ProductListMember addProductListMembers2(ProductListMember productListMembers2) {
		getProductListMembers2().add(productListMembers2);
		productListMembers2.setUser2(this);

		return productListMembers2;
	}

	public ProductListMember removeProductListMembers2(ProductListMember productListMembers2) {
		getProductListMembers2().remove(productListMembers2);
		productListMembers2.setUser2(null);

		return productListMembers2;
	}

	public List<ProductMetadata> getProductMetadata1() {
		return this.productMetadata1;
	}

	public void setProductMetadata1(List<ProductMetadata> productMetadata1) {
		this.productMetadata1 = productMetadata1;
	}

	public ProductMetadata addProductMetadata1(ProductMetadata productMetadata1) {
		getProductMetadata1().add(productMetadata1);
		productMetadata1.setUser1(this);

		return productMetadata1;
	}

	public ProductMetadata removeProductMetadata1(ProductMetadata productMetadata1) {
		getProductMetadata1().remove(productMetadata1);
		productMetadata1.setUser1(null);

		return productMetadata1;
	}

	public List<ProductMetadata> getProductMetadata2() {
		return this.productMetadata2;
	}

	public void setProductMetadata2(List<ProductMetadata> productMetadata2) {
		this.productMetadata2 = productMetadata2;
	}

	public ProductMetadata addProductMetadata2(ProductMetadata productMetadata2) {
		getProductMetadata2().add(productMetadata2);
		productMetadata2.setUser2(this);

		return productMetadata2;
	}

	public ProductMetadata removeProductMetadata2(ProductMetadata productMetadata2) {
		getProductMetadata2().remove(productMetadata2);
		productMetadata2.setUser2(null);

		return productMetadata2;
	}

	public List<ProductName> getProductNames1() {
		return this.productNames1;
	}

	public void setProductNames1(List<ProductName> productNames1) {
		this.productNames1 = productNames1;
	}

	public ProductName addProductNames1(ProductName productNames1) {
		getProductNames1().add(productNames1);
		productNames1.setUser1(this);

		return productNames1;
	}

	public ProductName removeProductNames1(ProductName productNames1) {
		getProductNames1().remove(productNames1);
		productNames1.setUser1(null);

		return productNames1;
	}

	public List<ProductName> getProductNames2() {
		return this.productNames2;
	}

	public void setProductNames2(List<ProductName> productNames2) {
		this.productNames2 = productNames2;
	}

	public ProductName addProductNames2(ProductName productNames2) {
		getProductNames2().add(productNames2);
		productNames2.setUser2(this);

		return productNames2;
	}

	public ProductName removeProductNames2(ProductName productNames2) {
		getProductNames2().remove(productNames2);
		productNames2.setUser2(null);

		return productNames2;
	}

	public List<Program> getPrograms1() {
		return this.programs1;
	}

	public void setPrograms1(List<Program> programs1) {
		this.programs1 = programs1;
	}

	public Program addPrograms1(Program programs1) {
		getPrograms1().add(programs1);
		programs1.setUser1(this);

		return programs1;
	}

	public Program removePrograms1(Program programs1) {
		getPrograms1().remove(programs1);
		programs1.setUser1(null);

		return programs1;
	}

	public List<Program> getPrograms2() {
		return this.programs2;
	}

	public void setPrograms2(List<Program> programs2) {
		this.programs2 = programs2;
	}

	public Program addPrograms2(Program programs2) {
		getPrograms2().add(programs2);
		programs2.setUser2(this);

		return programs2;
	}

	public Program removePrograms2(Program programs2) {
		getPrograms2().remove(programs2);
		programs2.setUser2(null);

		return programs2;
	}

	public List<ProgramMetadata> getProgramMetadata1() {
		return this.programMetadata1;
	}

	public void setProgramMetadata1(List<ProgramMetadata> programMetadata1) {
		this.programMetadata1 = programMetadata1;
	}

	public ProgramMetadata addProgramMetadata1(ProgramMetadata programMetadata1) {
		getProgramMetadata1().add(programMetadata1);
		programMetadata1.setUser1(this);

		return programMetadata1;
	}

	public ProgramMetadata removeProgramMetadata1(ProgramMetadata programMetadata1) {
		getProgramMetadata1().remove(programMetadata1);
		programMetadata1.setUser1(null);

		return programMetadata1;
	}

	public List<ProgramMetadata> getProgramMetadata2() {
		return this.programMetadata2;
	}

	public void setProgramMetadata2(List<ProgramMetadata> programMetadata2) {
		this.programMetadata2 = programMetadata2;
	}

	public ProgramMetadata addProgramMetadata2(ProgramMetadata programMetadata2) {
		getProgramMetadata2().add(programMetadata2);
		programMetadata2.setUser2(this);

		return programMetadata2;
	}

	public ProgramMetadata removeProgramMetadata2(ProgramMetadata programMetadata2) {
		getProgramMetadata2().remove(programMetadata2);
		programMetadata2.setUser2(null);

		return programMetadata2;
	}

	public List<ProgramPlace> getProgramPlaces1() {
		return this.programPlaces1;
	}

	public void setProgramPlaces1(List<ProgramPlace> programPlaces1) {
		this.programPlaces1 = programPlaces1;
	}

	public ProgramPlace addProgramPlaces1(ProgramPlace programPlaces1) {
		getProgramPlaces1().add(programPlaces1);
		programPlaces1.setUser1(this);

		return programPlaces1;
	}

	public ProgramPlace removeProgramPlaces1(ProgramPlace programPlaces1) {
		getProgramPlaces1().remove(programPlaces1);
		programPlaces1.setUser1(null);

		return programPlaces1;
	}

	public List<ProgramPlace> getProgramPlaces2() {
		return this.programPlaces2;
	}

	public void setProgramPlaces2(List<ProgramPlace> programPlaces2) {
		this.programPlaces2 = programPlaces2;
	}

	public ProgramPlace addProgramPlaces2(ProgramPlace programPlaces2) {
		getProgramPlaces2().add(programPlaces2);
		programPlaces2.setUser2(this);

		return programPlaces2;
	}

	public ProgramPlace removeProgramPlaces2(ProgramPlace programPlaces2) {
		getProgramPlaces2().remove(programPlaces2);
		programPlaces2.setUser2(null);

		return programPlaces2;
	}

	public List<ProgramPlaceMetadata> getProgramPlaceMetadata1() {
		return this.programPlaceMetadata1;
	}

	public void setProgramPlaceMetadata1(List<ProgramPlaceMetadata> programPlaceMetadata1) {
		this.programPlaceMetadata1 = programPlaceMetadata1;
	}

	public ProgramPlaceMetadata addProgramPlaceMetadata1(ProgramPlaceMetadata programPlaceMetadata1) {
		getProgramPlaceMetadata1().add(programPlaceMetadata1);
		programPlaceMetadata1.setUser1(this);

		return programPlaceMetadata1;
	}

	public ProgramPlaceMetadata removeProgramPlaceMetadata1(ProgramPlaceMetadata programPlaceMetadata1) {
		getProgramPlaceMetadata1().remove(programPlaceMetadata1);
		programPlaceMetadata1.setUser1(null);

		return programPlaceMetadata1;
	}

	public List<ProgramPlaceMetadata> getProgramPlaceMetadata2() {
		return this.programPlaceMetadata2;
	}

	public void setProgramPlaceMetadata2(List<ProgramPlaceMetadata> programPlaceMetadata2) {
		this.programPlaceMetadata2 = programPlaceMetadata2;
	}

	public ProgramPlaceMetadata addProgramPlaceMetadata2(ProgramPlaceMetadata programPlaceMetadata2) {
		getProgramPlaceMetadata2().add(programPlaceMetadata2);
		programPlaceMetadata2.setUser2(this);

		return programPlaceMetadata2;
	}

	public ProgramPlaceMetadata removeProgramPlaceMetadata2(ProgramPlaceMetadata programPlaceMetadata2) {
		getProgramPlaceMetadata2().remove(programPlaceMetadata2);
		programPlaceMetadata2.setUser2(null);

		return programPlaceMetadata2;
	}

	public List<ProgramRelation> getProgramRelations1() {
		return this.programRelations1;
	}

	public void setProgramRelations1(List<ProgramRelation> programRelations1) {
		this.programRelations1 = programRelations1;
	}

	public ProgramRelation addProgramRelations1(ProgramRelation programRelations1) {
		getProgramRelations1().add(programRelations1);
		programRelations1.setUser1(this);

		return programRelations1;
	}

	public ProgramRelation removeProgramRelations1(ProgramRelation programRelations1) {
		getProgramRelations1().remove(programRelations1);
		programRelations1.setUser1(null);

		return programRelations1;
	}

	public List<ProgramRelation> getProgramRelations2() {
		return this.programRelations2;
	}

	public void setProgramRelations2(List<ProgramRelation> programRelations2) {
		this.programRelations2 = programRelations2;
	}

	public ProgramRelation addProgramRelations2(ProgramRelation programRelations2) {
		getProgramRelations2().add(programRelations2);
		programRelations2.setUser2(this);

		return programRelations2;
	}

	public ProgramRelation removeProgramRelations2(ProgramRelation programRelations2) {
		getProgramRelations2().remove(programRelations2);
		programRelations2.setUser2(null);

		return programRelations2;
	}

	public List<ProgramRole> getProgramRoles1() {
		return this.programRoles1;
	}

	public void setProgramRoles1(List<ProgramRole> programRoles1) {
		this.programRoles1 = programRoles1;
	}

	public ProgramRole addProgramRoles1(ProgramRole programRoles1) {
		getProgramRoles1().add(programRoles1);
		programRoles1.setUser1(this);

		return programRoles1;
	}

	public ProgramRole removeProgramRoles1(ProgramRole programRoles1) {
		getProgramRoles1().remove(programRoles1);
		programRoles1.setUser1(null);

		return programRoles1;
	}

	public List<ProgramRole> getProgramRoles2() {
		return this.programRoles2;
	}

	public void setProgramRoles2(List<ProgramRole> programRoles2) {
		this.programRoles2 = programRoles2;
	}

	public ProgramRole addProgramRoles2(ProgramRole programRoles2) {
		getProgramRoles2().add(programRoles2);
		programRoles2.setUser2(this);

		return programRoles2;
	}

	public ProgramRole removeProgramRoles2(ProgramRole programRoles2) {
		getProgramRoles2().remove(programRoles2);
		programRoles2.setUser2(null);

		return programRoles2;
	}

	public List<ProgramTeam> getProgramTeams1() {
		return this.programTeams1;
	}

	public void setProgramTeams1(List<ProgramTeam> programTeams1) {
		this.programTeams1 = programTeams1;
	}

	public ProgramTeam addProgramTeams1(ProgramTeam programTeams1) {
		getProgramTeams1().add(programTeams1);
		programTeams1.setUser1(this);

		return programTeams1;
	}

	public ProgramTeam removeProgramTeams1(ProgramTeam programTeams1) {
		getProgramTeams1().remove(programTeams1);
		programTeams1.setUser1(null);

		return programTeams1;
	}

	public List<ProgramTeam> getProgramTeams2() {
		return this.programTeams2;
	}

	public void setProgramTeams2(List<ProgramTeam> programTeams2) {
		this.programTeams2 = programTeams2;
	}

	public ProgramTeam addProgramTeams2(ProgramTeam programTeams2) {
		getProgramTeams2().add(programTeams2);
		programTeams2.setUser2(this);

		return programTeams2;
	}

	public ProgramTeam removeProgramTeams2(ProgramTeam programTeams2) {
		getProgramTeams2().remove(programTeams2);
		programTeams2.setUser2(null);

		return programTeams2;
	}

	public List<ProgramTvp> getProgramTvps1() {
		return this.programTvps1;
	}

	public void setProgramTvps1(List<ProgramTvp> programTvps1) {
		this.programTvps1 = programTvps1;
	}

	public ProgramTvp addProgramTvps1(ProgramTvp programTvps1) {
		getProgramTvps1().add(programTvps1);
		programTvps1.setUser1(this);

		return programTvps1;
	}

	public ProgramTvp removeProgramTvps1(ProgramTvp programTvps1) {
		getProgramTvps1().remove(programTvps1);
		programTvps1.setUser1(null);

		return programTvps1;
	}

	public List<ProgramTvp> getProgramTvps2() {
		return this.programTvps2;
	}

	public void setProgramTvps2(List<ProgramTvp> programTvps2) {
		this.programTvps2 = programTvps2;
	}

	public ProgramTvp addProgramTvps2(ProgramTvp programTvps2) {
		getProgramTvps2().add(programTvps2);
		programTvps2.setUser2(this);

		return programTvps2;
	}

	public ProgramTvp removeProgramTvps2(ProgramTvp programTvps2) {
		getProgramTvps2().remove(programTvps2);
		programTvps2.setUser2(null);

		return programTvps2;
	}

	public List<ProgramVariableSet> getProgramVariableSets1() {
		return this.programVariableSets1;
	}

	public void setProgramVariableSets1(List<ProgramVariableSet> programVariableSets1) {
		this.programVariableSets1 = programVariableSets1;
	}

	public ProgramVariableSet addProgramVariableSets1(ProgramVariableSet programVariableSets1) {
		getProgramVariableSets1().add(programVariableSets1);
		programVariableSets1.setUser1(this);

		return programVariableSets1;
	}

	public ProgramVariableSet removeProgramVariableSets1(ProgramVariableSet programVariableSets1) {
		getProgramVariableSets1().remove(programVariableSets1);
		programVariableSets1.setUser1(null);

		return programVariableSets1;
	}

	public List<ProgramVariableSet> getProgramVariableSets2() {
		return this.programVariableSets2;
	}

	public void setProgramVariableSets2(List<ProgramVariableSet> programVariableSets2) {
		this.programVariableSets2 = programVariableSets2;
	}

	public ProgramVariableSet addProgramVariableSets2(ProgramVariableSet programVariableSets2) {
		getProgramVariableSets2().add(programVariableSets2);
		programVariableSets2.setUser2(this);

		return programVariableSets2;
	}

	public ProgramVariableSet removeProgramVariableSets2(ProgramVariableSet programVariableSets2) {
		getProgramVariableSets2().remove(programVariableSets2);
		programVariableSets2.setUser2(null);

		return programVariableSets2;
	}

	public List<ProgramYearSequence> getProgramYearSequences1() {
		return this.programYearSequences1;
	}

	public void setProgramYearSequences1(List<ProgramYearSequence> programYearSequences1) {
		this.programYearSequences1 = programYearSequences1;
	}

	public ProgramYearSequence addProgramYearSequences1(ProgramYearSequence programYearSequences1) {
		getProgramYearSequences1().add(programYearSequences1);
		programYearSequences1.setUser1(this);

		return programYearSequences1;
	}

	public ProgramYearSequence removeProgramYearSequences1(ProgramYearSequence programYearSequences1) {
		getProgramYearSequences1().remove(programYearSequences1);
		programYearSequences1.setUser1(null);

		return programYearSequences1;
	}

	public List<ProgramYearSequence> getProgramYearSequences2() {
		return this.programYearSequences2;
	}

	public void setProgramYearSequences2(List<ProgramYearSequence> programYearSequences2) {
		this.programYearSequences2 = programYearSequences2;
	}

	public ProgramYearSequence addProgramYearSequences2(ProgramYearSequence programYearSequences2) {
		getProgramYearSequences2().add(programYearSequences2);
		programYearSequences2.setUser2(this);

		return programYearSequences2;
	}

	public ProgramYearSequence removeProgramYearSequences2(ProgramYearSequence programYearSequences2) {
		getProgramYearSequences2().remove(programYearSequences2);
		programYearSequences2.setUser2(null);

		return programYearSequences2;
	}

	public List<Property> getProperties1() {
		return this.properties1;
	}

	public void setProperties1(List<Property> properties1) {
		this.properties1 = properties1;
	}

	public Property addProperties1(Property properties1) {
		getProperties1().add(properties1);
		properties1.setUser1(this);

		return properties1;
	}

	public Property removeProperties1(Property properties1) {
		getProperties1().remove(properties1);
		properties1.setUser1(null);

		return properties1;
	}

	public List<Property> getProperties2() {
		return this.properties2;
	}

	public void setProperties2(List<Property> properties2) {
		this.properties2 = properties2;
	}

	public Property addProperties2(Property properties2) {
		getProperties2().add(properties2);
		properties2.setUser2(this);

		return properties2;
	}

	public Property removeProperties2(Property properties2) {
		getProperties2().remove(properties2);
		properties2.setUser2(null);

		return properties2;
	}

	public List<PropertyMethodScale> getPropertyMethodScales1() {
		return this.propertyMethodScales1;
	}

	public void setPropertyMethodScales1(List<PropertyMethodScale> propertyMethodScales1) {
		this.propertyMethodScales1 = propertyMethodScales1;
	}

	public PropertyMethodScale addPropertyMethodScales1(PropertyMethodScale propertyMethodScales1) {
		getPropertyMethodScales1().add(propertyMethodScales1);
		propertyMethodScales1.setUser1(this);

		return propertyMethodScales1;
	}

	public PropertyMethodScale removePropertyMethodScales1(PropertyMethodScale propertyMethodScales1) {
		getPropertyMethodScales1().remove(propertyMethodScales1);
		propertyMethodScales1.setUser1(null);

		return propertyMethodScales1;
	}

	public List<PropertyMethodScale> getPropertyMethodScales2() {
		return this.propertyMethodScales2;
	}

	public void setPropertyMethodScales2(List<PropertyMethodScale> propertyMethodScales2) {
		this.propertyMethodScales2 = propertyMethodScales2;
	}

	public PropertyMethodScale addPropertyMethodScales2(PropertyMethodScale propertyMethodScales2) {
		getPropertyMethodScales2().add(propertyMethodScales2);
		propertyMethodScales2.setUser2(this);

		return propertyMethodScales2;
	}

	public PropertyMethodScale removePropertyMethodScales2(PropertyMethodScale propertyMethodScales2) {
		getPropertyMethodScales2().remove(propertyMethodScales2);
		propertyMethodScales2.setUser2(null);

		return propertyMethodScales2;
	}

	public List<Record> getRecords1() {
		return this.records1;
	}

	public void setRecords1(List<Record> records1) {
		this.records1 = records1;
	}

	public Record addRecords1(Record records1) {
		getRecords1().add(records1);
		records1.setUser1(this);

		return records1;
	}

	public Record removeRecords1(Record records1) {
		getRecords1().remove(records1);
		records1.setUser1(null);

		return records1;
	}

	public List<Record> getRecords2() {
		return this.records2;
	}

	public void setRecords2(List<Record> records2) {
		this.records2 = records2;
	}

	public Record addRecords2(Record records2) {
		getRecords2().add(records2);
		records2.setUser2(this);

		return records2;
	}

	public Record removeRecords2(Record records2) {
		getRecords2().remove(records2);
		records2.setUser2(null);

		return records2;
	}

	public List<RecordVariable> getRecordVariables1() {
		return this.recordVariables1;
	}

	public void setRecordVariables1(List<RecordVariable> recordVariables1) {
		this.recordVariables1 = recordVariables1;
	}

	public RecordVariable addRecordVariables1(RecordVariable recordVariables1) {
		getRecordVariables1().add(recordVariables1);
		recordVariables1.setUser1(this);

		return recordVariables1;
	}

	public RecordVariable removeRecordVariables1(RecordVariable recordVariables1) {
		getRecordVariables1().remove(recordVariables1);
		recordVariables1.setUser1(null);

		return recordVariables1;
	}

	public List<RecordVariable> getRecordVariables2() {
		return this.recordVariables2;
	}

	public void setRecordVariables2(List<RecordVariable> recordVariables2) {
		this.recordVariables2 = recordVariables2;
	}

	public RecordVariable addRecordVariables2(RecordVariable recordVariables2) {
		getRecordVariables2().add(recordVariables2);
		recordVariables2.setUser2(this);

		return recordVariables2;
	}

	public RecordVariable removeRecordVariables2(RecordVariable recordVariables2) {
		getRecordVariables2().remove(recordVariables2);
		recordVariables2.setUser2(null);

		return recordVariables2;
	}

	public List<Role> getRoles1() {
		return this.roles1;
	}

	public void setRoles1(List<Role> roles1) {
		this.roles1 = roles1;
	}

	public Role addRoles1(Role roles1) {
		getRoles1().add(roles1);
		roles1.setUser1(this);

		return roles1;
	}

	public Role removeRoles1(Role roles1) {
		getRoles1().remove(roles1);
		roles1.setUser1(null);

		return roles1;
	}

	public List<Role> getRoles2() {
		return this.roles2;
	}

	public void setRoles2(List<Role> roles2) {
		this.roles2 = roles2;
	}

	public Role addRoles2(Role roles2) {
		getRoles2().add(roles2);
		roles2.setUser2(this);

		return roles2;
	}

	public Role removeRoles2(Role roles2) {
		getRoles2().remove(roles2);
		roles2.setUser2(null);

		return roles2;
	}

	public List<Scale> getScales1() {
		return this.scales1;
	}

	public void setScales1(List<Scale> scales1) {
		this.scales1 = scales1;
	}

	public Scale addScales1(Scale scales1) {
		getScales1().add(scales1);
		scales1.setUser1(this);

		return scales1;
	}

	public Scale removeScales1(Scale scales1) {
		getScales1().remove(scales1);
		scales1.setUser1(null);

		return scales1;
	}

	public List<Scale> getScales2() {
		return this.scales2;
	}

	public void setScales2(List<Scale> scales2) {
		this.scales2 = scales2;
	}

	public Scale addScales2(Scale scales2) {
		getScales2().add(scales2);
		scales2.setUser2(this);

		return scales2;
	}

	public Scale removeScales2(Scale scales2) {
		getScales2().remove(scales2);
		scales2.setUser2(null);

		return scales2;
	}

	public List<ScaleValue> getScaleValues1() {
		return this.scaleValues1;
	}

	public void setScaleValues1(List<ScaleValue> scaleValues1) {
		this.scaleValues1 = scaleValues1;
	}

	public ScaleValue addScaleValues1(ScaleValue scaleValues1) {
		getScaleValues1().add(scaleValues1);
		scaleValues1.setUser1(this);

		return scaleValues1;
	}

	public ScaleValue removeScaleValues1(ScaleValue scaleValues1) {
		getScaleValues1().remove(scaleValues1);
		scaleValues1.setUser1(null);

		return scaleValues1;
	}

	public List<ScaleValue> getScaleValues2() {
		return this.scaleValues2;
	}

	public void setScaleValues2(List<ScaleValue> scaleValues2) {
		this.scaleValues2 = scaleValues2;
	}

	public ScaleValue addScaleValues2(ScaleValue scaleValues2) {
		getScaleValues2().add(scaleValues2);
		scaleValues2.setUser2(this);

		return scaleValues2;
	}

	public ScaleValue removeScaleValues2(ScaleValue scaleValues2) {
		getScaleValues2().remove(scaleValues2);
		scaleValues2.setUser2(null);

		return scaleValues2;
	}

	public List<Scheme> getSchemes1() {
		return this.schemes1;
	}

	public void setSchemes1(List<Scheme> schemes1) {
		this.schemes1 = schemes1;
	}

	public Scheme addSchemes1(Scheme schemes1) {
		getSchemes1().add(schemes1);
		schemes1.setUser1(this);

		return schemes1;
	}

	public Scheme removeSchemes1(Scheme schemes1) {
		getSchemes1().remove(schemes1);
		schemes1.setUser1(null);

		return schemes1;
	}

	public List<Scheme> getSchemes2() {
		return this.schemes2;
	}

	public void setSchemes2(List<Scheme> schemes2) {
		this.schemes2 = schemes2;
	}

	public Scheme addSchemes2(Scheme schemes2) {
		getSchemes2().add(schemes2);
		schemes2.setUser2(this);

		return schemes2;
	}

	public Scheme removeSchemes2(Scheme schemes2) {
		getSchemes2().remove(schemes2);
		schemes2.setUser2(null);

		return schemes2;
	}

	public List<SchemeMetadata> getSchemeMetadata1() {
		return this.schemeMetadata1;
	}

	public void setSchemeMetadata1(List<SchemeMetadata> schemeMetadata1) {
		this.schemeMetadata1 = schemeMetadata1;
	}

	public SchemeMetadata addSchemeMetadata1(SchemeMetadata schemeMetadata1) {
		getSchemeMetadata1().add(schemeMetadata1);
		schemeMetadata1.setUser1(this);

		return schemeMetadata1;
	}

	public SchemeMetadata removeSchemeMetadata1(SchemeMetadata schemeMetadata1) {
		getSchemeMetadata1().remove(schemeMetadata1);
		schemeMetadata1.setUser1(null);

		return schemeMetadata1;
	}

	public List<SchemeMetadata> getSchemeMetadata2() {
		return this.schemeMetadata2;
	}

	public void setSchemeMetadata2(List<SchemeMetadata> schemeMetadata2) {
		this.schemeMetadata2 = schemeMetadata2;
	}

	public SchemeMetadata addSchemeMetadata2(SchemeMetadata schemeMetadata2) {
		getSchemeMetadata2().add(schemeMetadata2);
		schemeMetadata2.setUser2(this);

		return schemeMetadata2;
	}

	public SchemeMetadata removeSchemeMetadata2(SchemeMetadata schemeMetadata2) {
		getSchemeMetadata2().remove(schemeMetadata2);
		schemeMetadata2.setUser2(null);

		return schemeMetadata2;
	}

	public List<SchemeRelation> getSchemeRelations1() {
		return this.schemeRelations1;
	}

	public void setSchemeRelations1(List<SchemeRelation> schemeRelations1) {
		this.schemeRelations1 = schemeRelations1;
	}

	public SchemeRelation addSchemeRelations1(SchemeRelation schemeRelations1) {
		getSchemeRelations1().add(schemeRelations1);
		schemeRelations1.setUser1(this);

		return schemeRelations1;
	}

	public SchemeRelation removeSchemeRelations1(SchemeRelation schemeRelations1) {
		getSchemeRelations1().remove(schemeRelations1);
		schemeRelations1.setUser1(null);

		return schemeRelations1;
	}

	public List<SchemeRelation> getSchemeRelations2() {
		return this.schemeRelations2;
	}

	public void setSchemeRelations2(List<SchemeRelation> schemeRelations2) {
		this.schemeRelations2 = schemeRelations2;
	}

	public SchemeRelation addSchemeRelations2(SchemeRelation schemeRelations2) {
		getSchemeRelations2().add(schemeRelations2);
		schemeRelations2.setUser2(this);

		return schemeRelations2;
	}

	public SchemeRelation removeSchemeRelations2(SchemeRelation schemeRelations2) {
		getSchemeRelations2().remove(schemeRelations2);
		schemeRelations2.setUser2(null);

		return schemeRelations2;
	}

	public List<SchemeRelationMetadata> getSchemeRelationMetadata1() {
		return this.schemeRelationMetadata1;
	}

	public void setSchemeRelationMetadata1(List<SchemeRelationMetadata> schemeRelationMetadata1) {
		this.schemeRelationMetadata1 = schemeRelationMetadata1;
	}

	public SchemeRelationMetadata addSchemeRelationMetadata1(SchemeRelationMetadata schemeRelationMetadata1) {
		getSchemeRelationMetadata1().add(schemeRelationMetadata1);
		schemeRelationMetadata1.setUser1(this);

		return schemeRelationMetadata1;
	}

	public SchemeRelationMetadata removeSchemeRelationMetadata1(SchemeRelationMetadata schemeRelationMetadata1) {
		getSchemeRelationMetadata1().remove(schemeRelationMetadata1);
		schemeRelationMetadata1.setUser1(null);

		return schemeRelationMetadata1;
	}

	public List<SchemeRelationMetadata> getSchemeRelationMetadata2() {
		return this.schemeRelationMetadata2;
	}

	public void setSchemeRelationMetadata2(List<SchemeRelationMetadata> schemeRelationMetadata2) {
		this.schemeRelationMetadata2 = schemeRelationMetadata2;
	}

	public SchemeRelationMetadata addSchemeRelationMetadata2(SchemeRelationMetadata schemeRelationMetadata2) {
		getSchemeRelationMetadata2().add(schemeRelationMetadata2);
		schemeRelationMetadata2.setUser2(this);

		return schemeRelationMetadata2;
	}

	public SchemeRelationMetadata removeSchemeRelationMetadata2(SchemeRelationMetadata schemeRelationMetadata2) {
		getSchemeRelationMetadata2().remove(schemeRelationMetadata2);
		schemeRelationMetadata2.setUser2(null);

		return schemeRelationMetadata2;
	}

	public List<Season> getSeasons1() {
		return this.seasons1;
	}

	public void setSeasons1(List<Season> seasons1) {
		this.seasons1 = seasons1;
	}

	public Season addSeasons1(Season seasons1) {
		getSeasons1().add(seasons1);
		seasons1.setUser1(this);

		return seasons1;
	}

	public Season removeSeasons1(Season seasons1) {
		getSeasons1().remove(seasons1);
		seasons1.setUser1(null);

		return seasons1;
	}

	public List<Season> getSeasons2() {
		return this.seasons2;
	}

	public void setSeasons2(List<Season> seasons2) {
		this.seasons2 = seasons2;
	}

	public Season addSeasons2(Season seasons2) {
		getSeasons2().add(seasons2);
		seasons2.setUser2(this);

		return seasons2;
	}

	public Season removeSeasons2(Season seasons2) {
		getSeasons2().remove(seasons2);
		seasons2.setUser2(null);

		return seasons2;
	}

	public List<Service> getServices1() {
		return this.services1;
	}

	public void setServices1(List<Service> services1) {
		this.services1 = services1;
	}

	public Service addServices1(Service services1) {
		getServices1().add(services1);
		services1.setUser1(this);

		return services1;
	}

	public Service removeServices1(Service services1) {
		getServices1().remove(services1);
		services1.setUser1(null);

		return services1;
	}

	public List<Service> getServices2() {
		return this.services2;
	}

	public void setServices2(List<Service> services2) {
		this.services2 = services2;
	}

	public Service addServices2(Service services2) {
		getServices2().add(services2);
		services2.setUser2(this);

		return services2;
	}

	public Service removeServices2(Service services2) {
		getServices2().remove(services2);
		services2.setUser2(null);

		return services2;
	}

	public List<ServiceRecord> getServiceRecords1() {
		return this.serviceRecords1;
	}

	public void setServiceRecords1(List<ServiceRecord> serviceRecords1) {
		this.serviceRecords1 = serviceRecords1;
	}

	public ServiceRecord addServiceRecords1(ServiceRecord serviceRecords1) {
		getServiceRecords1().add(serviceRecords1);
		serviceRecords1.setUser1(this);

		return serviceRecords1;
	}

	public ServiceRecord removeServiceRecords1(ServiceRecord serviceRecords1) {
		getServiceRecords1().remove(serviceRecords1);
		serviceRecords1.setUser1(null);

		return serviceRecords1;
	}

	public List<ServiceRecord> getServiceRecords2() {
		return this.serviceRecords2;
	}

	public void setServiceRecords2(List<ServiceRecord> serviceRecords2) {
		this.serviceRecords2 = serviceRecords2;
	}

	public ServiceRecord addServiceRecords2(ServiceRecord serviceRecords2) {
		getServiceRecords2().add(serviceRecords2);
		serviceRecords2.setUser2(this);

		return serviceRecords2;
	}

	public ServiceRecord removeServiceRecords2(ServiceRecord serviceRecords2) {
		getServiceRecords2().remove(serviceRecords2);
		serviceRecords2.setUser2(null);

		return serviceRecords2;
	}

	public List<ServiceRelation> getServiceRelations1() {
		return this.serviceRelations1;
	}

	public void setServiceRelations1(List<ServiceRelation> serviceRelations1) {
		this.serviceRelations1 = serviceRelations1;
	}

	public ServiceRelation addServiceRelations1(ServiceRelation serviceRelations1) {
		getServiceRelations1().add(serviceRelations1);
		serviceRelations1.setUser1(this);

		return serviceRelations1;
	}

	public ServiceRelation removeServiceRelations1(ServiceRelation serviceRelations1) {
		getServiceRelations1().remove(serviceRelations1);
		serviceRelations1.setUser1(null);

		return serviceRelations1;
	}

	public List<ServiceRelation> getServiceRelations2() {
		return this.serviceRelations2;
	}

	public void setServiceRelations2(List<ServiceRelation> serviceRelations2) {
		this.serviceRelations2 = serviceRelations2;
	}

	public ServiceRelation addServiceRelations2(ServiceRelation serviceRelations2) {
		getServiceRelations2().add(serviceRelations2);
		serviceRelations2.setUser2(this);

		return serviceRelations2;
	}

	public ServiceRelation removeServiceRelations2(ServiceRelation serviceRelations2) {
		getServiceRelations2().remove(serviceRelations2);
		serviceRelations2.setUser2(null);

		return serviceRelations2;
	}

	public List<ServiceRequiredVariable> getServiceRequiredVariables1() {
		return this.serviceRequiredVariables1;
	}

	public void setServiceRequiredVariables1(List<ServiceRequiredVariable> serviceRequiredVariables1) {
		this.serviceRequiredVariables1 = serviceRequiredVariables1;
	}

	public ServiceRequiredVariable addServiceRequiredVariables1(ServiceRequiredVariable serviceRequiredVariables1) {
		getServiceRequiredVariables1().add(serviceRequiredVariables1);
		serviceRequiredVariables1.setUser1(this);

		return serviceRequiredVariables1;
	}

	public ServiceRequiredVariable removeServiceRequiredVariables1(ServiceRequiredVariable serviceRequiredVariables1) {
		getServiceRequiredVariables1().remove(serviceRequiredVariables1);
		serviceRequiredVariables1.setUser1(null);

		return serviceRequiredVariables1;
	}

	public List<ServiceRequiredVariable> getServiceRequiredVariables2() {
		return this.serviceRequiredVariables2;
	}

	public void setServiceRequiredVariables2(List<ServiceRequiredVariable> serviceRequiredVariables2) {
		this.serviceRequiredVariables2 = serviceRequiredVariables2;
	}

	public ServiceRequiredVariable addServiceRequiredVariables2(ServiceRequiredVariable serviceRequiredVariables2) {
		getServiceRequiredVariables2().add(serviceRequiredVariables2);
		serviceRequiredVariables2.setUser2(this);

		return serviceRequiredVariables2;
	}

	public ServiceRequiredVariable removeServiceRequiredVariables2(ServiceRequiredVariable serviceRequiredVariables2) {
		getServiceRequiredVariables2().remove(serviceRequiredVariables2);
		serviceRequiredVariables2.setUser2(null);

		return serviceRequiredVariables2;
	}

	public List<ServiceTask> getServiceTasks1() {
		return this.serviceTasks1;
	}

	public void setServiceTasks1(List<ServiceTask> serviceTasks1) {
		this.serviceTasks1 = serviceTasks1;
	}

	public ServiceTask addServiceTasks1(ServiceTask serviceTasks1) {
		getServiceTasks1().add(serviceTasks1);
		serviceTasks1.setUser1(this);

		return serviceTasks1;
	}

	public ServiceTask removeServiceTasks1(ServiceTask serviceTasks1) {
		getServiceTasks1().remove(serviceTasks1);
		serviceTasks1.setUser1(null);

		return serviceTasks1;
	}

	public List<ServiceTask> getServiceTasks2() {
		return this.serviceTasks2;
	}

	public void setServiceTasks2(List<ServiceTask> serviceTasks2) {
		this.serviceTasks2 = serviceTasks2;
	}

	public ServiceTask addServiceTasks2(ServiceTask serviceTasks2) {
		getServiceTasks2().add(serviceTasks2);
		serviceTasks2.setUser2(this);

		return serviceTasks2;
	}

	public ServiceTask removeServiceTasks2(ServiceTask serviceTasks2) {
		getServiceTasks2().remove(serviceTasks2);
		serviceTasks2.setUser2(null);

		return serviceTasks2;
	}

	public List<ServiceTeam> getServiceTeams1() {
		return this.serviceTeams1;
	}

	public void setServiceTeams1(List<ServiceTeam> serviceTeams1) {
		this.serviceTeams1 = serviceTeams1;
	}

	public ServiceTeam addServiceTeams1(ServiceTeam serviceTeams1) {
		getServiceTeams1().add(serviceTeams1);
		serviceTeams1.setUser1(this);

		return serviceTeams1;
	}

	public ServiceTeam removeServiceTeams1(ServiceTeam serviceTeams1) {
		getServiceTeams1().remove(serviceTeams1);
		serviceTeams1.setUser1(null);

		return serviceTeams1;
	}

	public List<ServiceTeam> getServiceTeams2() {
		return this.serviceTeams2;
	}

	public void setServiceTeams2(List<ServiceTeam> serviceTeams2) {
		this.serviceTeams2 = serviceTeams2;
	}

	public ServiceTeam addServiceTeams2(ServiceTeam serviceTeams2) {
		getServiceTeams2().add(serviceTeams2);
		serviceTeams2.setUser2(this);

		return serviceTeams2;
	}

	public ServiceTeam removeServiceTeams2(ServiceTeam serviceTeams2) {
		getServiceTeams2().remove(serviceTeams2);
		serviceTeams2.setUser2(null);

		return serviceTeams2;
	}

	public List<Team> getTeams1() {
		return this.teams1;
	}

	public void setTeams1(List<Team> teams1) {
		this.teams1 = teams1;
	}

	public Team addTeams1(Team teams1) {
		getTeams1().add(teams1);
		teams1.setUser1(this);

		return teams1;
	}

	public Team removeTeams1(Team teams1) {
		getTeams1().remove(teams1);
		teams1.setUser1(null);

		return teams1;
	}

	public List<Team> getTeams2() {
		return this.teams2;
	}

	public void setTeams2(List<Team> teams2) {
		this.teams2 = teams2;
	}

	public Team addTeams2(Team teams2) {
		getTeams2().add(teams2);
		teams2.setUser2(this);

		return teams2;
	}

	public Team removeTeams2(Team teams2) {
		getTeams2().remove(teams2);
		teams2.setUser2(null);

		return teams2;
	}

	public List<Team> getTeams3() {
		return this.teams3;
	}

	public void setTeams3(List<Team> teams3) {
		this.teams3 = teams3;
	}

	public Team addTeams3(Team teams3) {
		getTeams3().add(teams3);
		teams3.setUser3(this);

		return teams3;
	}

	public Team removeTeams3(Team teams3) {
		getTeams3().remove(teams3);
		teams3.setUser3(null);

		return teams3;
	}

	public List<TeamMember> getTeamMembers1() {
		return this.teamMembers1;
	}

	public void setTeamMembers1(List<TeamMember> teamMembers1) {
		this.teamMembers1 = teamMembers1;
	}

	public TeamMember addTeamMembers1(TeamMember teamMembers1) {
		getTeamMembers1().add(teamMembers1);
		teamMembers1.setUser1(this);

		return teamMembers1;
	}

	public TeamMember removeTeamMembers1(TeamMember teamMembers1) {
		getTeamMembers1().remove(teamMembers1);
		teamMembers1.setUser1(null);

		return teamMembers1;
	}

	public List<TeamMember> getTeamMembers2() {
		return this.teamMembers2;
	}

	public void setTeamMembers2(List<TeamMember> teamMembers2) {
		this.teamMembers2 = teamMembers2;
	}

	public TeamMember addTeamMembers2(TeamMember teamMembers2) {
		getTeamMembers2().add(teamMembers2);
		teamMembers2.setUser2(this);

		return teamMembers2;
	}

	public TeamMember removeTeamMembers2(TeamMember teamMembers2) {
		getTeamMembers2().remove(teamMembers2);
		teamMembers2.setUser2(null);

		return teamMembers2;
	}

	public List<TeamMember> getTeamMembers3() {
		return this.teamMembers3;
	}

	public void setTeamMembers3(List<TeamMember> teamMembers3) {
		this.teamMembers3 = teamMembers3;
	}

	public TeamMember addTeamMembers3(TeamMember teamMembers3) {
		getTeamMembers3().add(teamMembers3);
		teamMembers3.setUser3(this);

		return teamMembers3;
	}

	public TeamMember removeTeamMembers3(TeamMember teamMembers3) {
		getTeamMembers3().remove(teamMembers3);
		teamMembers3.setUser3(null);

		return teamMembers3;
	}

	public List<TimingRule> getTimingRules1() {
		return this.timingRules1;
	}

	public void setTimingRules1(List<TimingRule> timingRules1) {
		this.timingRules1 = timingRules1;
	}

	public TimingRule addTimingRules1(TimingRule timingRules1) {
		getTimingRules1().add(timingRules1);
		timingRules1.setUser1(this);

		return timingRules1;
	}

	public TimingRule removeTimingRules1(TimingRule timingRules1) {
		getTimingRules1().remove(timingRules1);
		timingRules1.setUser1(null);

		return timingRules1;
	}

	public List<TimingRule> getTimingRules2() {
		return this.timingRules2;
	}

	public void setTimingRules2(List<TimingRule> timingRules2) {
		this.timingRules2 = timingRules2;
	}

	public TimingRule addTimingRules2(TimingRule timingRules2) {
		getTimingRules2().add(timingRules2);
		timingRules2.setUser2(this);

		return timingRules2;
	}

	public TimingRule removeTimingRules2(TimingRule timingRules2) {
		getTimingRules2().remove(timingRules2);
		timingRules2.setUser2(null);

		return timingRules2;
	}

	public List<Tooltip> getTooltips1() {
		return this.tooltips1;
	}

	public void setTooltips1(List<Tooltip> tooltips1) {
		this.tooltips1 = tooltips1;
	}

	public Tooltip addTooltips1(Tooltip tooltips1) {
		getTooltips1().add(tooltips1);
		tooltips1.setUser1(this);

		return tooltips1;
	}

	public Tooltip removeTooltips1(Tooltip tooltips1) {
		getTooltips1().remove(tooltips1);
		tooltips1.setUser1(null);

		return tooltips1;
	}

	public List<Tooltip> getTooltips2() {
		return this.tooltips2;
	}

	public void setTooltips2(List<Tooltip> tooltips2) {
		this.tooltips2 = tooltips2;
	}

	public Tooltip addTooltips2(Tooltip tooltips2) {
		getTooltips2().add(tooltips2);
		tooltips2.setUser2(this);

		return tooltips2;
	}

	public Tooltip removeTooltips2(Tooltip tooltips2) {
		getTooltips2().remove(tooltips2);
		tooltips2.setUser2(null);

		return tooltips2;
	}

	public List<Tvp> getTvps1() {
		return this.tvps1;
	}

	public void setTvps1(List<Tvp> tvps1) {
		this.tvps1 = tvps1;
	}

	public Tvp addTvps1(Tvp tvps1) {
		getTvps1().add(tvps1);
		tvps1.setUser1(this);

		return tvps1;
	}

	public Tvp removeTvps1(Tvp tvps1) {
		getTvps1().remove(tvps1);
		tvps1.setUser1(null);

		return tvps1;
	}

	public List<Tvp> getTvps2() {
		return this.tvps2;
	}

	public void setTvps2(List<Tvp> tvps2) {
		this.tvps2 = tvps2;
	}

	public Tvp addTvps2(Tvp tvps2) {
		getTvps2().add(tvps2);
		tvps2.setUser2(this);

		return tvps2;
	}

	public Tvp removeTvps2(Tvp tvps2) {
		getTvps2().remove(tvps2);
		tvps2.setUser2(null);

		return tvps2;
	}

	public List<TvpMetadata> getTvpMetadata1() {
		return this.tvpMetadata1;
	}

	public void setTvpMetadata1(List<TvpMetadata> tvpMetadata1) {
		this.tvpMetadata1 = tvpMetadata1;
	}

	public TvpMetadata addTvpMetadata1(TvpMetadata tvpMetadata1) {
		getTvpMetadata1().add(tvpMetadata1);
		tvpMetadata1.setUser1(this);

		return tvpMetadata1;
	}

	public TvpMetadata removeTvpMetadata1(TvpMetadata tvpMetadata1) {
		getTvpMetadata1().remove(tvpMetadata1);
		tvpMetadata1.setUser1(null);

		return tvpMetadata1;
	}

	public List<TvpMetadata> getTvpMetadata2() {
		return this.tvpMetadata2;
	}

	public void setTvpMetadata2(List<TvpMetadata> tvpMetadata2) {
		this.tvpMetadata2 = tvpMetadata2;
	}

	public TvpMetadata addTvpMetadata2(TvpMetadata tvpMetadata2) {
		getTvpMetadata2().add(tvpMetadata2);
		tvpMetadata2.setUser2(this);

		return tvpMetadata2;
	}

	public TvpMetadata removeTvpMetadata2(TvpMetadata tvpMetadata2) {
		getTvpMetadata2().remove(tvpMetadata2);
		tvpMetadata2.setUser2(null);

		return tvpMetadata2;
	}

	public List<TvpProductProfile> getTvpProductProfiles1() {
		return this.tvpProductProfiles1;
	}

	public void setTvpProductProfiles1(List<TvpProductProfile> tvpProductProfiles1) {
		this.tvpProductProfiles1 = tvpProductProfiles1;
	}

	public TvpProductProfile addTvpProductProfiles1(TvpProductProfile tvpProductProfiles1) {
		getTvpProductProfiles1().add(tvpProductProfiles1);
		tvpProductProfiles1.setUser1(this);

		return tvpProductProfiles1;
	}

	public TvpProductProfile removeTvpProductProfiles1(TvpProductProfile tvpProductProfiles1) {
		getTvpProductProfiles1().remove(tvpProductProfiles1);
		tvpProductProfiles1.setUser1(null);

		return tvpProductProfiles1;
	}

	public List<TvpProductProfile> getTvpProductProfiles2() {
		return this.tvpProductProfiles2;
	}

	public void setTvpProductProfiles2(List<TvpProductProfile> tvpProductProfiles2) {
		this.tvpProductProfiles2 = tvpProductProfiles2;
	}

	public TvpProductProfile addTvpProductProfiles2(TvpProductProfile tvpProductProfiles2) {
		getTvpProductProfiles2().add(tvpProductProfiles2);
		tvpProductProfiles2.setUser2(this);

		return tvpProductProfiles2;
	}

	public TvpProductProfile removeTvpProductProfiles2(TvpProductProfile tvpProductProfiles2) {
		getTvpProductProfiles2().remove(tvpProductProfiles2);
		tvpProductProfiles2.setUser2(null);

		return tvpProductProfiles2;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public List<User> getUsers1() {
		return this.users1;
	}

	public void setUsers1(List<User> users1) {
		this.users1 = users1;
	}

	public User addUsers1(User users1) {
		getUsers1().add(users1);
		users1.setUser1(this);

		return users1;
	}

	public User removeUsers1(User users1) {
		getUsers1().remove(users1);
		users1.setUser1(null);

		return users1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public List<User> getUsers2() {
		return this.users2;
	}

	public void setUsers2(List<User> users2) {
		this.users2 = users2;
	}

	public User addUsers2(User users2) {
		getUsers2().add(users2);
		users2.setUser2(this);

		return users2;
	}

	public User removeUsers2(User users2) {
		getUsers2().remove(users2);
		users2.setUser2(null);

		return users2;
	}

	public List<UserItem> getUserItems() {
		return this.userItems;
	}

	public void setUserItems(List<UserItem> userItems) {
		this.userItems = userItems;
	}

	public UserItem addUserItem(UserItem userItem) {
		getUserItems().add(userItem);
		userItem.setUser(this);

		return userItem;
	}

	public UserItem removeUserItem(UserItem userItem) {
		getUserItems().remove(userItem);
		userItem.setUser(null);

		return userItem;
	}

	public List<UserMetadata> getUserMetadata1() {
		return this.userMetadata1;
	}

	public void setUserMetadata1(List<UserMetadata> userMetadata1) {
		this.userMetadata1 = userMetadata1;
	}

	public UserMetadata addUserMetadata1(UserMetadata userMetadata1) {
		getUserMetadata1().add(userMetadata1);
		userMetadata1.setUser1(this);

		return userMetadata1;
	}

	public UserMetadata removeUserMetadata1(UserMetadata userMetadata1) {
		getUserMetadata1().remove(userMetadata1);
		userMetadata1.setUser1(null);

		return userMetadata1;
	}

	public List<UserMetadata> getUserMetadata2() {
		return this.userMetadata2;
	}

	public void setUserMetadata2(List<UserMetadata> userMetadata2) {
		this.userMetadata2 = userMetadata2;
	}

	public UserMetadata addUserMetadata2(UserMetadata userMetadata2) {
		getUserMetadata2().add(userMetadata2);
		userMetadata2.setUser2(this);

		return userMetadata2;
	}

	public UserMetadata removeUserMetadata2(UserMetadata userMetadata2) {
		getUserMetadata2().remove(userMetadata2);
		userMetadata2.setUser2(null);

		return userMetadata2;
	}

	public List<UserRole> getUserRoles1() {
		return this.userRoles1;
	}

	public void setUserRoles1(List<UserRole> userRoles1) {
		this.userRoles1 = userRoles1;
	}

	public UserRole addUserRoles1(UserRole userRoles1) {
		getUserRoles1().add(userRoles1);
		userRoles1.setUser1(this);

		return userRoles1;
	}

	public UserRole removeUserRoles1(UserRole userRoles1) {
		getUserRoles1().remove(userRoles1);
		userRoles1.setUser1(null);

		return userRoles1;
	}

	public List<UserRole> getUserRoles2() {
		return this.userRoles2;
	}

	public void setUserRoles2(List<UserRole> userRoles2) {
		this.userRoles2 = userRoles2;
	}

	public UserRole addUserRoles2(UserRole userRoles2) {
		getUserRoles2().add(userRoles2);
		userRoles2.setUser2(this);

		return userRoles2;
	}

	public UserRole removeUserRoles2(UserRole userRoles2) {
		getUserRoles2().remove(userRoles2);
		userRoles2.setUser2(null);

		return userRoles2;
	}

	public List<UserRole> getUserRoles3() {
		return this.userRoles3;
	}

	public void setUserRoles3(List<UserRole> userRoles3) {
		this.userRoles3 = userRoles3;
	}

	public UserRole addUserRoles3(UserRole userRoles3) {
		getUserRoles3().add(userRoles3);
		userRoles3.setUser3(this);

		return userRoles3;
	}

	public UserRole removeUserRoles3(UserRole userRoles3) {
		getUserRoles3().remove(userRoles3);
		userRoles3.setUser3(null);

		return userRoles3;
	}

	public List<UserSession> getUserSessions1() {
		return this.userSessions1;
	}

	public void setUserSessions1(List<UserSession> userSessions1) {
		this.userSessions1 = userSessions1;
	}

	public UserSession addUserSessions1(UserSession userSessions1) {
		getUserSessions1().add(userSessions1);
		userSessions1.setUser1(this);

		return userSessions1;
	}

	public UserSession removeUserSessions1(UserSession userSessions1) {
		getUserSessions1().remove(userSessions1);
		userSessions1.setUser1(null);

		return userSessions1;
	}

	public List<UserSession> getUserSessions2() {
		return this.userSessions2;
	}

	public void setUserSessions2(List<UserSession> userSessions2) {
		this.userSessions2 = userSessions2;
	}

	public UserSession addUserSessions2(UserSession userSessions2) {
		getUserSessions2().add(userSessions2);
		userSessions2.setUser2(this);

		return userSessions2;
	}

	public UserSession removeUserSessions2(UserSession userSessions2) {
		getUserSessions2().remove(userSessions2);
		userSessions2.setUser2(null);

		return userSessions2;
	}

	public List<UserSession> getUserSessions3() {
		return this.userSessions3;
	}

	public void setUserSessions3(List<UserSession> userSessions3) {
		this.userSessions3 = userSessions3;
	}

	public UserSession addUserSessions3(UserSession userSessions3) {
		getUserSessions3().add(userSessions3);
		userSessions3.setUser3(this);

		return userSessions3;
	}

	public UserSession removeUserSessions3(UserSession userSessions3) {
		getUserSessions3().remove(userSessions3);
		userSessions3.setUser3(null);

		return userSessions3;
	}

	public List<UserVariableSetMember> getUserVariableSetMembers1() {
		return this.userVariableSetMembers1;
	}

	public void setUserVariableSetMembers1(List<UserVariableSetMember> userVariableSetMembers1) {
		this.userVariableSetMembers1 = userVariableSetMembers1;
	}

	public UserVariableSetMember addUserVariableSetMembers1(UserVariableSetMember userVariableSetMembers1) {
		getUserVariableSetMembers1().add(userVariableSetMembers1);
		userVariableSetMembers1.setUser1(this);

		return userVariableSetMembers1;
	}

	public UserVariableSetMember removeUserVariableSetMembers1(UserVariableSetMember userVariableSetMembers1) {
		getUserVariableSetMembers1().remove(userVariableSetMembers1);
		userVariableSetMembers1.setUser1(null);

		return userVariableSetMembers1;
	}

	public List<UserVariableSetMember> getUserVariableSetMembers2() {
		return this.userVariableSetMembers2;
	}

	public void setUserVariableSetMembers2(List<UserVariableSetMember> userVariableSetMembers2) {
		this.userVariableSetMembers2 = userVariableSetMembers2;
	}

	public UserVariableSetMember addUserVariableSetMembers2(UserVariableSetMember userVariableSetMembers2) {
		getUserVariableSetMembers2().add(userVariableSetMembers2);
		userVariableSetMembers2.setUser2(this);

		return userVariableSetMembers2;
	}

	public UserVariableSetMember removeUserVariableSetMembers2(UserVariableSetMember userVariableSetMembers2) {
		getUserVariableSetMembers2().remove(userVariableSetMembers2);
		userVariableSetMembers2.setUser2(null);

		return userVariableSetMembers2;
	}

	public List<UserVariableSetMember> getUserVariableSetMembers3() {
		return this.userVariableSetMembers3;
	}

	public void setUserVariableSetMembers3(List<UserVariableSetMember> userVariableSetMembers3) {
		this.userVariableSetMembers3 = userVariableSetMembers3;
	}

	public UserVariableSetMember addUserVariableSetMembers3(UserVariableSetMember userVariableSetMembers3) {
		getUserVariableSetMembers3().add(userVariableSetMembers3);
		userVariableSetMembers3.setUser3(this);

		return userVariableSetMembers3;
	}

	public UserVariableSetMember removeUserVariableSetMembers3(UserVariableSetMember userVariableSetMembers3) {
		getUserVariableSetMembers3().remove(userVariableSetMembers3);
		userVariableSetMembers3.setUser3(null);

		return userVariableSetMembers3;
	}

	public List<Variable> getVariables1() {
		return this.variables1;
	}

	public void setVariables1(List<Variable> variables1) {
		this.variables1 = variables1;
	}

	public Variable addVariables1(Variable variables1) {
		getVariables1().add(variables1);
		variables1.setUser1(this);

		return variables1;
	}

	public Variable removeVariables1(Variable variables1) {
		getVariables1().remove(variables1);
		variables1.setUser1(null);

		return variables1;
	}

	public List<Variable> getVariables2() {
		return this.variables2;
	}

	public void setVariables2(List<Variable> variables2) {
		this.variables2 = variables2;
	}

	public Variable addVariables2(Variable variables2) {
		getVariables2().add(variables2);
		variables2.setUser2(this);

		return variables2;
	}

	public Variable removeVariables2(Variable variables2) {
		getVariables2().remove(variables2);
		variables2.setUser2(null);

		return variables2;
	}

	public List<VariableMapping> getVariableMappings1() {
		return this.variableMappings1;
	}

	public void setVariableMappings1(List<VariableMapping> variableMappings1) {
		this.variableMappings1 = variableMappings1;
	}

	public VariableMapping addVariableMappings1(VariableMapping variableMappings1) {
		getVariableMappings1().add(variableMappings1);
		variableMappings1.setUser1(this);

		return variableMappings1;
	}

	public VariableMapping removeVariableMappings1(VariableMapping variableMappings1) {
		getVariableMappings1().remove(variableMappings1);
		variableMappings1.setUser1(null);

		return variableMappings1;
	}

	public List<VariableMapping> getVariableMappings2() {
		return this.variableMappings2;
	}

	public void setVariableMappings2(List<VariableMapping> variableMappings2) {
		this.variableMappings2 = variableMappings2;
	}

	public VariableMapping addVariableMappings2(VariableMapping variableMappings2) {
		getVariableMappings2().add(variableMappings2);
		variableMappings2.setUser2(this);

		return variableMappings2;
	}

	public VariableMapping removeVariableMappings2(VariableMapping variableMappings2) {
		getVariableMappings2().remove(variableMappings2);
		variableMappings2.setUser2(null);

		return variableMappings2;
	}

	public List<VariableRelation> getVariableRelations1() {
		return this.variableRelations1;
	}

	public void setVariableRelations1(List<VariableRelation> variableRelations1) {
		this.variableRelations1 = variableRelations1;
	}

	public VariableRelation addVariableRelations1(VariableRelation variableRelations1) {
		getVariableRelations1().add(variableRelations1);
		variableRelations1.setUser1(this);

		return variableRelations1;
	}

	public VariableRelation removeVariableRelations1(VariableRelation variableRelations1) {
		getVariableRelations1().remove(variableRelations1);
		variableRelations1.setUser1(null);

		return variableRelations1;
	}

	public List<VariableRelation> getVariableRelations2() {
		return this.variableRelations2;
	}

	public void setVariableRelations2(List<VariableRelation> variableRelations2) {
		this.variableRelations2 = variableRelations2;
	}

	public VariableRelation addVariableRelations2(VariableRelation variableRelations2) {
		getVariableRelations2().add(variableRelations2);
		variableRelations2.setUser2(this);

		return variableRelations2;
	}

	public VariableRelation removeVariableRelations2(VariableRelation variableRelations2) {
		getVariableRelations2().remove(variableRelations2);
		variableRelations2.setUser2(null);

		return variableRelations2;
	}

	public List<VariableRelationValue> getVariableRelationValues1() {
		return this.variableRelationValues1;
	}

	public void setVariableRelationValues1(List<VariableRelationValue> variableRelationValues1) {
		this.variableRelationValues1 = variableRelationValues1;
	}

	public VariableRelationValue addVariableRelationValues1(VariableRelationValue variableRelationValues1) {
		getVariableRelationValues1().add(variableRelationValues1);
		variableRelationValues1.setUser1(this);

		return variableRelationValues1;
	}

	public VariableRelationValue removeVariableRelationValues1(VariableRelationValue variableRelationValues1) {
		getVariableRelationValues1().remove(variableRelationValues1);
		variableRelationValues1.setUser1(null);

		return variableRelationValues1;
	}

	public List<VariableRelationValue> getVariableRelationValues2() {
		return this.variableRelationValues2;
	}

	public void setVariableRelationValues2(List<VariableRelationValue> variableRelationValues2) {
		this.variableRelationValues2 = variableRelationValues2;
	}

	public VariableRelationValue addVariableRelationValues2(VariableRelationValue variableRelationValues2) {
		getVariableRelationValues2().add(variableRelationValues2);
		variableRelationValues2.setUser2(this);

		return variableRelationValues2;
	}

	public VariableRelationValue removeVariableRelationValues2(VariableRelationValue variableRelationValues2) {
		getVariableRelationValues2().remove(variableRelationValues2);
		variableRelationValues2.setUser2(null);

		return variableRelationValues2;
	}

	public List<VariableResult> getVariableResults1() {
		return this.variableResults1;
	}

	public void setVariableResults1(List<VariableResult> variableResults1) {
		this.variableResults1 = variableResults1;
	}

	public VariableResult addVariableResults1(VariableResult variableResults1) {
		getVariableResults1().add(variableResults1);
		variableResults1.setUser1(this);

		return variableResults1;
	}

	public VariableResult removeVariableResults1(VariableResult variableResults1) {
		getVariableResults1().remove(variableResults1);
		variableResults1.setUser1(null);

		return variableResults1;
	}

	public List<VariableResult> getVariableResults2() {
		return this.variableResults2;
	}

	public void setVariableResults2(List<VariableResult> variableResults2) {
		this.variableResults2 = variableResults2;
	}

	public VariableResult addVariableResults2(VariableResult variableResults2) {
		getVariableResults2().add(variableResults2);
		variableResults2.setUser2(this);

		return variableResults2;
	}

	public VariableResult removeVariableResults2(VariableResult variableResults2) {
		getVariableResults2().remove(variableResults2);
		variableResults2.setUser2(null);

		return variableResults2;
	}

	public List<VariableSet> getVariableSets1() {
		return this.variableSets1;
	}

	public void setVariableSets1(List<VariableSet> variableSets1) {
		this.variableSets1 = variableSets1;
	}

	public VariableSet addVariableSets1(VariableSet variableSets1) {
		getVariableSets1().add(variableSets1);
		variableSets1.setUser1(this);

		return variableSets1;
	}

	public VariableSet removeVariableSets1(VariableSet variableSets1) {
		getVariableSets1().remove(variableSets1);
		variableSets1.setUser1(null);

		return variableSets1;
	}

	public List<VariableSet> getVariableSets2() {
		return this.variableSets2;
	}

	public void setVariableSets2(List<VariableSet> variableSets2) {
		this.variableSets2 = variableSets2;
	}

	public VariableSet addVariableSets2(VariableSet variableSets2) {
		getVariableSets2().add(variableSets2);
		variableSets2.setUser2(this);

		return variableSets2;
	}

	public VariableSet removeVariableSets2(VariableSet variableSets2) {
		getVariableSets2().remove(variableSets2);
		variableSets2.setUser2(null);

		return variableSets2;
	}

	public List<VariableSetAccess> getVariableSetAccesses1() {
		return this.variableSetAccesses1;
	}

	public void setVariableSetAccesses1(List<VariableSetAccess> variableSetAccesses1) {
		this.variableSetAccesses1 = variableSetAccesses1;
	}

	public VariableSetAccess addVariableSetAccesses1(VariableSetAccess variableSetAccesses1) {
		getVariableSetAccesses1().add(variableSetAccesses1);
		variableSetAccesses1.setUser1(this);

		return variableSetAccesses1;
	}

	public VariableSetAccess removeVariableSetAccesses1(VariableSetAccess variableSetAccesses1) {
		getVariableSetAccesses1().remove(variableSetAccesses1);
		variableSetAccesses1.setUser1(null);

		return variableSetAccesses1;
	}

	public List<VariableSetAccess> getVariableSetAccesses2() {
		return this.variableSetAccesses2;
	}

	public void setVariableSetAccesses2(List<VariableSetAccess> variableSetAccesses2) {
		this.variableSetAccesses2 = variableSetAccesses2;
	}

	public VariableSetAccess addVariableSetAccesses2(VariableSetAccess variableSetAccesses2) {
		getVariableSetAccesses2().add(variableSetAccesses2);
		variableSetAccesses2.setUser2(this);

		return variableSetAccesses2;
	}

	public VariableSetAccess removeVariableSetAccesses2(VariableSetAccess variableSetAccesses2) {
		getVariableSetAccesses2().remove(variableSetAccesses2);
		variableSetAccesses2.setUser2(null);

		return variableSetAccesses2;
	}

	public List<VariableSetMember> getVariableSetMembers1() {
		return this.variableSetMembers1;
	}

	public void setVariableSetMembers1(List<VariableSetMember> variableSetMembers1) {
		this.variableSetMembers1 = variableSetMembers1;
	}

	public VariableSetMember addVariableSetMembers1(VariableSetMember variableSetMembers1) {
		getVariableSetMembers1().add(variableSetMembers1);
		variableSetMembers1.setUser1(this);

		return variableSetMembers1;
	}

	public VariableSetMember removeVariableSetMembers1(VariableSetMember variableSetMembers1) {
		getVariableSetMembers1().remove(variableSetMembers1);
		variableSetMembers1.setUser1(null);

		return variableSetMembers1;
	}

	public List<VariableSetMember> getVariableSetMembers2() {
		return this.variableSetMembers2;
	}

	public void setVariableSetMembers2(List<VariableSetMember> variableSetMembers2) {
		this.variableSetMembers2 = variableSetMembers2;
	}

	public VariableSetMember addVariableSetMembers2(VariableSetMember variableSetMembers2) {
		getVariableSetMembers2().add(variableSetMembers2);
		variableSetMembers2.setUser2(this);

		return variableSetMembers2;
	}

	public VariableSetMember removeVariableSetMembers2(VariableSetMember variableSetMembers2) {
		getVariableSetMembers2().remove(variableSetMembers2);
		variableSetMembers2.setUser2(null);

		return variableSetMembers2;
	}

	public List<VariableSetRelation> getVariableSetRelations1() {
		return this.variableSetRelations1;
	}

	public void setVariableSetRelations1(List<VariableSetRelation> variableSetRelations1) {
		this.variableSetRelations1 = variableSetRelations1;
	}

	public VariableSetRelation addVariableSetRelations1(VariableSetRelation variableSetRelations1) {
		getVariableSetRelations1().add(variableSetRelations1);
		variableSetRelations1.setUser1(this);

		return variableSetRelations1;
	}

	public VariableSetRelation removeVariableSetRelations1(VariableSetRelation variableSetRelations1) {
		getVariableSetRelations1().remove(variableSetRelations1);
		variableSetRelations1.setUser1(null);

		return variableSetRelations1;
	}

	public List<VariableSetRelation> getVariableSetRelations2() {
		return this.variableSetRelations2;
	}

	public void setVariableSetRelations2(List<VariableSetRelation> variableSetRelations2) {
		this.variableSetRelations2 = variableSetRelations2;
	}

	public VariableSetRelation addVariableSetRelations2(VariableSetRelation variableSetRelations2) {
		getVariableSetRelations2().add(variableSetRelations2);
		variableSetRelations2.setUser2(this);

		return variableSetRelations2;
	}

	public VariableSetRelation removeVariableSetRelations2(VariableSetRelation variableSetRelations2) {
		getVariableSetRelations2().remove(variableSetRelations2);
		variableSetRelations2.setUser2(null);

		return variableSetRelations2;
	}
*/
}
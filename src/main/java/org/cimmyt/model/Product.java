package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the product database table.
 * @author RHTOLEDO
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="breeding_line_name")
	private String breedingLineName;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="cross_id")
	private Integer crossId;

	@Column(name="derivative_name")
	private String derivativeName;

	private String description;

	private String designation;

	@Column(name="display_name")
	private String displayName;

	@Column(name="fixed_line_name")
	private String fixedLineName;

	private String generation;

	private Integer gid;

	@Column(name="institute_id")
	private Integer instituteId;

	@Column(name="ip_rights")
	private String ipRights;

	@Column(name="ip_status")
	private String ipStatus;

	@Column(name="iris_preferred_id")
	private String irisPreferredId;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="mta_status")
	private String mtaStatus;

	@Column(name="name_type")
	private String nameType;

	private String notes;

	private String parentage;

	@Column(name="product_gid_id")
	private Integer productGidId;

	@Column(name="product_key")
	private String productKey;

	@Column(name="product_status")
	private String productStatus;

	@Column(name="product_type")
	private String productType;

	private String remarks;

	@Column(name="season_id")
	private Integer seasonId;

	@Column(name="seed_storage_id")
	private Integer seedStorageId;

	@Column(name="selection_method")
	private String selectionMethod;

	@Column(name="system_product_name")
	private String systemProductName;

	private Integer year;

	//bi-directional many-to-one association to Family
	//@OneToMany(mappedBy="product1")
	//private List<Family> families1;

	//bi-directional many-to-one association to Family
	//@OneToMany(mappedBy="product2")
	//private List<Family> families2;

	//bi-directional many-to-one association to Organization
	//@ManyToOne
	//private Organization organization;

	//bi-directional many-to-one association to Program
	@ManyToOne
	private Program program;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to ProductGid
	@OneToMany(mappedBy="product")
	private List<ProductGid> productGids;

	//bi-directional many-to-one association to ProductListMember
	//@OneToMany(mappedBy="product")
	//private List<ProductListMember> productListMembers;

	//bi-directional many-to-one association to ProductMetadata
	@OneToMany(mappedBy="product")
	private List<ProductMetadata> productMetadata;

	//bi-directional many-to-one association to ProductName
	@OneToMany(mappedBy="product")
	private List<ProductName> productNames;
	

	//bi-directional many-to-many association to Operacional.Entry
	@OneToMany(mappedBy="product")
	private List<Entry> entries;
	
	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	public Entry addEntry(Entry entry){
		getEntries().add(entry);
		entry.setProduct(this);
		
		return entry;
	}
	
	public Entry removeEntry(Entry entry){
		getEntries().remove(entry);
		entry.setProduct(this);
		
		return entry;
	}
	

	public Product() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBreedingLineName() {
		return this.breedingLineName;
	}

	public void setBreedingLineName(String breedingLineName) {
		this.breedingLineName = breedingLineName;
	}

	public Timestamp getCreationTimestamp() {
		return this.creationTimestamp;
	}

	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Integer getCrossId() {
		return this.crossId;
	}

	public void setCrossId(Integer crossId) {
		this.crossId = crossId;
	}

	public String getDerivativeName() {
		return this.derivativeName;
	}

	public void setDerivativeName(String derivativeName) {
		this.derivativeName = derivativeName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFixedLineName() {
		return this.fixedLineName;
	}

	public void setFixedLineName(String fixedLineName) {
		this.fixedLineName = fixedLineName;
	}

	public String getGeneration() {
		return this.generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getInstituteId() {
		return this.instituteId;
	}

	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}

	public String getIpRights() {
		return this.ipRights;
	}

	public void setIpRights(String ipRights) {
		this.ipRights = ipRights;
	}

	public String getIpStatus() {
		return this.ipStatus;
	}

	public void setIpStatus(String ipStatus) {
		this.ipStatus = ipStatus;
	}

	public String getIrisPreferredId() {
		return this.irisPreferredId;
	}

	public void setIrisPreferredId(String irisPreferredId) {
		this.irisPreferredId = irisPreferredId;
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

	public String getMtaStatus() {
		return this.mtaStatus;
	}

	public void setMtaStatus(String mtaStatus) {
		this.mtaStatus = mtaStatus;
	}

	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getParentage() {
		return this.parentage;
	}

	public void setParentage(String parentage) {
		this.parentage = parentage;
	}

	public Integer getProductGidId() {
		return this.productGidId;
	}

	public void setProductGidId(Integer productGidId) {
		this.productGidId = productGidId;
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public String getProductStatus() {
		return this.productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getSeasonId() {
		return this.seasonId;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}

	public Integer getSeedStorageId() {
		return this.seedStorageId;
	}

	public void setSeedStorageId(Integer seedStorageId) {
		this.seedStorageId = seedStorageId;
	}

	public String getSelectionMethod() {
		return this.selectionMethod;
	}

	public void setSelectionMethod(String selectionMethod) {
		this.selectionMethod = selectionMethod;
	}

	public String getSystemProductName() {
		return this.systemProductName;
	}

	public void setSystemProductName(String systemProductName) {
		this.systemProductName = systemProductName;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	//public List<Family> getFamilies1() {
	//	return this.families1;
	//}

	//public void setFamilies1(List<Family> families1) {
	//	this.families1 = families1;
	//}

	//public Family addFamilies1(Family families1) {
	//	getFamilies1().add(families1);
	//	families1.setProduct1(this);

	//	return families1;
	//}

	//public Family removeFamilies1(Family families1) {
	//	getFamilies1().remove(families1);
	//	families1.setProduct1(null);

	//	return families1;
	//}

	//public List<Family> getFamilies2() {
	//	return this.families2;
	//}

	//public void setFamilies2(List<Family> families2) {
	//	this.families2 = families2;
	//}

	//public Family addFamilies2(Family families2) {
	//	getFamilies2().add(families2);
	//	families2.setProduct2(this);

	//	return families2;
	//}

	//public Family removeFamilies2(Family families2) {
	//	getFamilies2().remove(families2);
	//	families2.setProduct2(null);

	//	return families2;
	//}

	//public Organization getOrganization() {
	//	return this.organization;
	//}

	//public void setOrganization(Organization organization) {
	//	this.organization = organization;
	//}

	public Program getProgram() {
		return this.program;
	}

	public void setProgram(Program program) {
		this.program = program;
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

	public List<ProductGid> getProductGids() {
		return this.productGids;
	}

	public void setProductGids(List<ProductGid> productGids) {
		this.productGids = productGids;
	}

	public ProductGid addProductGid(ProductGid productGid) {
		getProductGids().add(productGid);
		productGid.setProduct(this);

		return productGid;
	}

	public ProductGid removeProductGid(ProductGid productGid) {
		getProductGids().remove(productGid);
		productGid.setProduct(null);

		return productGid;
	}

	//public List<ProductListMember> getProductListMembers() {
	//	return this.productListMembers;
	//}

	//public void setProductListMembers(List<ProductListMember> productListMembers) {
	//	this.productListMembers = productListMembers;
	//}

	//public ProductListMember addProductListMember(ProductListMember productListMember) {
	//	getProductListMembers().add(productListMember);
	//	productListMember.setProduct(this);

	//	return productListMember;
	//}

	//public ProductListMember removeProductListMember(ProductListMember productListMember) {
	//	getProductListMembers().remove(productListMember);
	//	productListMember.setProduct(null);

	//	return productListMember;
	//}

	public List<ProductMetadata> getProductMetadata() {
		return this.productMetadata;
	}

	public void setProductMetadata(List<ProductMetadata> productMetadata) {
		this.productMetadata = productMetadata;
	}

	public ProductMetadata addProductMetadata(ProductMetadata productMetadata) {
		getProductMetadata().add(productMetadata);
		productMetadata.setProduct(this);

		return productMetadata;
	}

	public ProductMetadata removeProductMetadata(ProductMetadata productMetadata) {
		getProductMetadata().remove(productMetadata);
		productMetadata.setProduct(null);

		return productMetadata;
	}

	public List<ProductName> getProductNames() {
		return this.productNames;
	}

	public void setProductNames(List<ProductName> productNames) {
		this.productNames = productNames;
	}

	public ProductName addProductName(ProductName productName) {
		getProductNames().add(productName);
		productName.setProduct(this);

		return productName;
	}

	public ProductName removeProductName(ProductName productName) {
		getProductNames().remove(productName);
		productName.setProduct(null);

		return productName;
	}

}

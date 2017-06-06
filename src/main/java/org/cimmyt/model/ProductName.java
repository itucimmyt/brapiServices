package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the product_name database table.
 * @author RHTOLEDO 
 */
@Entity
@Table(schema="master",name="product_name")
@NamedQuery(name="ProductName.findAll", query="SELECT p FROM ProductName p")
public class ProductName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private String description;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="language_code")
	private String languageCode;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="name_type")
	private String nameType;

	private String notes;

	private String remarks;

	@Column(name="system_product_name")
	private String systemProductName;

	private String value;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	//bi-directional many-to-one association to ProductGid
	@ManyToOne
	@JoinColumn(name="product_gid_id")
	private ProductGid productGid;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	public ProductName() {
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

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSystemProductName() {
		return this.systemProductName;
	}

	public void setSystemProductName(String systemProductName) {
		this.systemProductName = systemProductName;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductGid getProductGid() {
		return this.productGid;
	}

	public void setProductGid(ProductGid productGid) {
		this.productGid = productGid;
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

}
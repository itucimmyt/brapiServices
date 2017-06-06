package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the product_gid database table.
 * @author RHTOLEDO
 */
@Entity
@Table(schema="master", name="product_gid")
@NamedQuery(name="ProductGid.findAll", query="SELECT p FROM ProductGid p")
public class ProductGid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private Integer gid;

	@Column(name="gid_type")
	private String gidType;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String notes;

	//private Object organization;

	private String remarks;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to ProductName
	@OneToMany(mappedBy="productGid")
	private List<ProductName> productNames;

	public ProductGid() {
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

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGidType() {
		return this.gidType;
	}

	public void setGidType(String gidType) {
		this.gidType = gidType;
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

	//public Object getOrganization() {
	//	return this.organization;
	//}

	//public void setOrganization(Object organization) {
	//	this.organization = organization;
	//}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public List<ProductName> getProductNames() {
		return this.productNames;
	}

	public void setProductNames(List<ProductName> productNames) {
		this.productNames = productNames;
	}

	public ProductName addProductName(ProductName productName) {
		getProductNames().add(productName);
		productName.setProductGid(this);

		return productName;
	}

	public ProductName removeProductName(ProductName productName) {
		getProductNames().remove(productName);
		productName.setProductGid(null);

		return productName;
	}

}
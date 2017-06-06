package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the changelog database table.
 * 
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Changelog.findAll", query="SELECT c FROM Changelog c")
public class Changelog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Temporal(TemporalType.DATE)
	@Column(name="date_done")
	private Date dateDone;

	private String description;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="issue_key")
	private String issueKey;

	@Column(name="issue_type")
	private String issueType;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	private String remarks;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="key_person_id")
	//private User user2;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user3;

	public Changelog() {
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

	public Date getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
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

	public String getIssueKey() {
		return this.issueKey;
	}

	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}

	public String getIssueType() {
		return this.issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
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

	//public User getUser3() {
	//	return this.user3;
	//}

	//public void setUser3(User user3) {
	//	this.user3 = user3;
	//}

}
package org.cimmyt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the plot database table.
 * @author RHTOLEDO
 *
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Units.findAll", query="SELECT p FROM Units p")
public class Units implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private Integer type;
	
	public Units(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	
}

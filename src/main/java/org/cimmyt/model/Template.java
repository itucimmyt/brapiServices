package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the templates database table.
 * 
 */
@Entity
@Table(name="templates", schema="operational")
@NamedQuery(name="Template.findAll", query="SELECT t FROM Template t")
public class Template implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
/*
	@Column(name="printouts_material_size")
	private Object printoutsMaterialSize;
*/
	@Column(name="printouts_material_type")
	private String printoutsMaterialType;

	@Column(name="printouts_per_material")
	private Integer printoutsPerMaterial;
/*
	@Column(name="template_body_fields")
	private Object templateBodyFields;
*/
	@Column(name="template_category")
	private String templateCategory;

	@Column(name="template_description")
	private String templateDescription;

	@Column(name="template_dimensions_unit")
	private String templateDimensionsUnit;
/*
	@Column(name="template_footer_fields")
	private Object templateFooterFields;

	@Column(name="template_header_fields")
	private Object templateHeaderFields;
*/
	@Column(name="template_height")
	private double templateHeight;

	@Column(name="template_name")
	private String templateName;

	@Column(name="template_preview_image")
	private byte[] templatePreviewImage;

	@Column(name="template_width")
	private double templateWidth;

	public Template() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
/*
	public Object getPrintoutsMaterialSize() {
		return this.printoutsMaterialSize;
	}

	public void setPrintoutsMaterialSize(Object printoutsMaterialSize) {
		this.printoutsMaterialSize = printoutsMaterialSize;
	}
*/
	public String getPrintoutsMaterialType() {
		return this.printoutsMaterialType;
	}

	public void setPrintoutsMaterialType(String printoutsMaterialType) {
		this.printoutsMaterialType = printoutsMaterialType;
	}

	public Integer getPrintoutsPerMaterial() {
		return this.printoutsPerMaterial;
	}

	public void setPrintoutsPerMaterial(Integer printoutsPerMaterial) {
		this.printoutsPerMaterial = printoutsPerMaterial;
	}
/*
	public Object getTemplateBodyFields() {
		return this.templateBodyFields;
	}

	public void setTemplateBodyFields(Object templateBodyFields) {
		this.templateBodyFields = templateBodyFields;
	}
*/
	public String getTemplateCategory() {
		return this.templateCategory;
	}

	public void setTemplateCategory(String templateCategory) {
		this.templateCategory = templateCategory;
	}

	public String getTemplateDescription() {
		return this.templateDescription;
	}

	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}

	public String getTemplateDimensionsUnit() {
		return this.templateDimensionsUnit;
	}

	public void setTemplateDimensionsUnit(String templateDimensionsUnit) {
		this.templateDimensionsUnit = templateDimensionsUnit;
	}
/*
	public Object getTemplateFooterFields() {
		return this.templateFooterFields;
	}

	public void setTemplateFooterFields(Object templateFooterFields) {
		this.templateFooterFields = templateFooterFields;
	}

	public Object getTemplateHeaderFields() {
		return this.templateHeaderFields;
	}

	public void setTemplateHeaderFields(Object templateHeaderFields) {
		this.templateHeaderFields = templateHeaderFields;
	}
*/
	public double getTemplateHeight() {
		return this.templateHeight;
	}

	public void setTemplateHeight(double templateHeight) {
		this.templateHeight = templateHeight;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public byte[] getTemplatePreviewImage() {
		return this.templatePreviewImage;
	}

	public void setTemplatePreviewImage(byte[] templatePreviewImage) {
		this.templatePreviewImage = templatePreviewImage;
	}

	public double getTemplateWidth() {
		return this.templateWidth;
	}

	public void setTemplateWidth(double templateWidth) {
		this.templateWidth = templateWidth;
	}

}
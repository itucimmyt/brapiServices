package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the entry database table.
 * 
 */
@Entity
@Table(schema="operational")
@NamedQuery(name="Entry.findAll", query="SELECT e FROM Entry e")
public class Entry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	private String entcode;

	private Integer entno;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	private BigDecimal key;

	private String metno;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	@Column(name="product_gid")
	private Integer productGid;

	@Column(name="product_gid_id")
	private Integer productGidId;

	//@Column(name="product_id")
	//private Integer productId;

	@Column(name="product_name")
	private String productName;

	private String remarks;

	//bi-directional many-to-one association to Cross
	@OneToMany(mappedBy="entry1")
	private List<Cross> crosses1;

	//bi-directional many-to-one association to Cross
	@OneToMany(mappedBy="entry2")
	private List<Cross> crosses2;

	//bi-directional many-to-one association to SeedStorageLog
	@ManyToOne
	@JoinColumn(name="seed_storage_log_id")
	private SeedStorageLog seedStorageLog;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to EntryData
	@OneToMany(mappedBy="entry")
	private List<EntryData> entryData;

	//bi-directional many-to-one association to EntryMetadata
	@OneToMany(mappedBy="entry")
	private List<EntryMetadata> entryMetadata;

	//bi-directional many-to-one association to Plot
	@OneToMany(mappedBy="entry")
	private List<Plot> plots;

	//bi-directional many-to-one association to PlotData
	@OneToMany(mappedBy="entry")
	private List<PlotData> plotData;

	//bi-directional many-to-one association to PlotMetadata
	@OneToMany(mappedBy="entry")
	private List<PlotMetadata> plotMetadata;

	//bi-directional many-to-one association to Subplot
	@OneToMany(mappedBy="entry")
	private List<Subplot> subplots;

	//bi-directional many-to-one association to SubplotData
	@OneToMany(mappedBy="entry")
	private List<SubplotData> subplotData;

	//bi-directional many-to-one association to SubplotMetadata
	@OneToMany(mappedBy="entry")
	private List<SubplotMetadata> subplotMetadata;
	
	
	/**
	 * Relationship with Product
	 */
	@ManyToOne
	private Product product;
	
	public Product getProduct(){
		return this.product;
	}
	
	public void setProduct(Product product){
		this.product = product;
	}


	public Entry() {
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

	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public String getEntcode() {
		return this.entcode;
	}

	public void setEntcode(String entcode) {
		this.entcode = entcode;
	}

	public Integer getEntno() {
		return this.entno;
	}

	public void setEntno(Integer entno) {
		this.entno = entno;
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

	public BigDecimal getKey() {
		return this.key;
	}

	public void setKey(BigDecimal key) {
		this.key = key;
	}

	public String getMetno() {
		return this.metno;
	}

	public void setMetno(String metno) {
		this.metno = metno;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public Integer getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getProductGid() {
		return this.productGid;
	}

	public void setProductGid(Integer productGid) {
		this.productGid = productGid;
	}

	public Integer getProductGidId() {
		return this.productGidId;
	}

	public void setProductGidId(Integer productGidId) {
		this.productGidId = productGidId;
	}

	//public Integer getProductId() {
	//	return this.productId;
	//}

	//public void setProductId(Integer productId) {
	//	this.productId = productId;
	//}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<Cross> getCrosses1() {
		return this.crosses1;
	}

	public void setCrosses1(List<Cross> crosses1) {
		this.crosses1 = crosses1;
	}

	public Cross addCrosses1(Cross crosses1) {
		getCrosses1().add(crosses1);
		crosses1.setEntry1(this);

		return crosses1;
	}

	public Cross removeCrosses1(Cross crosses1) {
		getCrosses1().remove(crosses1);
		crosses1.setEntry1(null);

		return crosses1;
	}

	public List<Cross> getCrosses2() {
		return this.crosses2;
	}

	public void setCrosses2(List<Cross> crosses2) {
		this.crosses2 = crosses2;
	}

	public Cross addCrosses2(Cross crosses2) {
		getCrosses2().add(crosses2);
		crosses2.setEntry2(this);

		return crosses2;
	}

	public Cross removeCrosses2(Cross crosses2) {
		getCrosses2().remove(crosses2);
		crosses2.setEntry2(null);

		return crosses2;
	}

	public SeedStorageLog getSeedStorageLog() {
		return this.seedStorageLog;
	}

	public void setSeedStorageLog(SeedStorageLog seedStorageLog) {
		this.seedStorageLog = seedStorageLog;
	}

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	public List<EntryData> getEntryData() {
		return this.entryData;
	}

	public void setEntryData(List<EntryData> entryData) {
		this.entryData = entryData;
	}

	public EntryData addEntryData(EntryData entryData) {
		getEntryData().add(entryData);
		entryData.setEntry(this);

		return entryData;
	}

	public EntryData removeEntryData(EntryData entryData) {
		getEntryData().remove(entryData);
		entryData.setEntry(null);

		return entryData;
	}

	public List<EntryMetadata> getEntryMetadata() {
		return this.entryMetadata;
	}

	public void setEntryMetadata(List<EntryMetadata> entryMetadata) {
		this.entryMetadata = entryMetadata;
	}

	public EntryMetadata addEntryMetadata(EntryMetadata entryMetadata) {
		getEntryMetadata().add(entryMetadata);
		entryMetadata.setEntry(this);

		return entryMetadata;
	}

	public EntryMetadata removeEntryMetadata(EntryMetadata entryMetadata) {
		getEntryMetadata().remove(entryMetadata);
		entryMetadata.setEntry(null);

		return entryMetadata;
	}

	public List<Plot> getPlots() {
		return this.plots;
	}

	public void setPlots(List<Plot> plots) {
		this.plots = plots;
	}

	public Plot addPlot(Plot plot) {
		getPlots().add(plot);
		plot.setEntry(this);

		return plot;
	}

	public Plot removePlot(Plot plot) {
		getPlots().remove(plot);
		plot.setEntry(null);

		return plot;
	}

	public List<PlotData> getPlotData() {
		return this.plotData;
	}

	public void setPlotData(List<PlotData> plotData) {
		this.plotData = plotData;
	}

	public PlotData addPlotData(PlotData plotData) {
		getPlotData().add(plotData);
		plotData.setEntry(this);

		return plotData;
	}

	public PlotData removePlotData(PlotData plotData) {
		getPlotData().remove(plotData);
		plotData.setEntry(null);

		return plotData;
	}

	public List<PlotMetadata> getPlotMetadata() {
		return this.plotMetadata;
	}

	public void setPlotMetadata(List<PlotMetadata> plotMetadata) {
		this.plotMetadata = plotMetadata;
	}

	public PlotMetadata addPlotMetadata(PlotMetadata plotMetadata) {
		getPlotMetadata().add(plotMetadata);
		plotMetadata.setEntry(this);

		return plotMetadata;
	}

	public PlotMetadata removePlotMetadata(PlotMetadata plotMetadata) {
		getPlotMetadata().remove(plotMetadata);
		plotMetadata.setEntry(null);

		return plotMetadata;
	}

	public List<Subplot> getSubplots() {
		return this.subplots;
	}

	public void setSubplots(List<Subplot> subplots) {
		this.subplots = subplots;
	}

	public Subplot addSubplot(Subplot subplot) {
		getSubplots().add(subplot);
		subplot.setEntry(this);

		return subplot;
	}

	public Subplot removeSubplot(Subplot subplot) {
		getSubplots().remove(subplot);
		subplot.setEntry(null);

		return subplot;
	}

	public List<SubplotData> getSubplotData() {
		return this.subplotData;
	}

	public void setSubplotData(List<SubplotData> subplotData) {
		this.subplotData = subplotData;
	}

	public SubplotData addSubplotData(SubplotData subplotData) {
		getSubplotData().add(subplotData);
		subplotData.setEntry(this);

		return subplotData;
	}

	public SubplotData removeSubplotData(SubplotData subplotData) {
		getSubplotData().remove(subplotData);
		subplotData.setEntry(null);

		return subplotData;
	}

	public List<SubplotMetadata> getSubplotMetadata() {
		return this.subplotMetadata;
	}

	public void setSubplotMetadata(List<SubplotMetadata> subplotMetadata) {
		this.subplotMetadata = subplotMetadata;
	}

	public SubplotMetadata addSubplotMetadata(SubplotMetadata subplotMetadata) {
		getSubplotMetadata().add(subplotMetadata);
		subplotMetadata.setEntry(this);

		return subplotMetadata;
	}

	public SubplotMetadata removeSubplotMetadata(SubplotMetadata subplotMetadata) {
		getSubplotMetadata().remove(subplotMetadata);
		subplotMetadata.setEntry(null);

		return subplotMetadata;
	}

}
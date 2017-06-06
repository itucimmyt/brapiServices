package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the plot database table.
 * 
 */
@Entity
@Table(schema="operational")
@NamedQuery(name="Plot.findAll", query="SELECT p FROM Plot p")
public class Plot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String code;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="is_void")
	private Boolean isVoid;

	private BigDecimal key;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	private Integer plotno;

	private String remarks;

	private Integer rep;

	//bi-directional many-to-one association to Entry
	@ManyToOne
	private Entry entry;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to PlotData
	@OneToMany(mappedBy="plot")
	private List<PlotData> plotData;

	//bi-directional many-to-one association to PlotMetadata
	@OneToMany(mappedBy="plot")
	private List<PlotMetadata> plotMetadata;

	//bi-directional many-to-one association to Subplot
	@OneToMany(mappedBy="plot")
	private List<Subplot> subplots;

	//bi-directional many-to-one association to SubplotData
	@OneToMany(mappedBy="plot")
	private List<SubplotData> subplotData;

	//bi-directional many-to-one association to SubplotMetadata
	@OneToMany(mappedBy="plot")
	private List<SubplotMetadata> subplotMetadata;

	public Plot() {
	}
	
	public Plot(Integer studyId){
		this.study = new Study(studyId);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Integer getPlotno() {
		return this.plotno;
	}

	public void setPlotno(Integer plotno) {
		this.plotno = plotno;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getRep() {
		return this.rep;
	}

	public void setRep(Integer rep) {
		this.rep = rep;
	}

	public Entry getEntry() {
		return this.entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	public List<PlotData> getPlotData() {
		return this.plotData;
	}

	public void setPlotData(List<PlotData> plotData) {
		this.plotData = plotData;
	}

	public PlotData addPlotData(PlotData plotData) {
		getPlotData().add(plotData);
		plotData.setPlot(this);

		return plotData;
	}

	public PlotData removePlotData(PlotData plotData) {
		getPlotData().remove(plotData);
		plotData.setPlot(null);

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
		plotMetadata.setPlot(this);

		return plotMetadata;
	}

	public PlotMetadata removePlotMetadata(PlotMetadata plotMetadata) {
		getPlotMetadata().remove(plotMetadata);
		plotMetadata.setPlot(null);

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
		subplot.setPlot(this);

		return subplot;
	}

	public Subplot removeSubplot(Subplot subplot) {
		getSubplots().remove(subplot);
		subplot.setPlot(null);

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
		subplotData.setPlot(this);

		return subplotData;
	}

	public SubplotData removeSubplotData(SubplotData subplotData) {
		getSubplotData().remove(subplotData);
		subplotData.setPlot(null);

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
		subplotMetadata.setPlot(this);

		return subplotMetadata;
	}

	public SubplotMetadata removeSubplotMetadata(SubplotMetadata subplotMetadata) {
		getSubplotMetadata().remove(subplotMetadata);
		subplotMetadata.setPlot(null);

		return subplotMetadata;
	}

}
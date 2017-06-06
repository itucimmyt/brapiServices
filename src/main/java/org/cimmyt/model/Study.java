package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the study database table.
 * 
 */
@Entity
@Table(schema="operational")
@NamedQuery(name="Study.findAll", query="SELECT s FROM Study s")
public class Study implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_draft")
	private Boolean isDraft;

	@Column(name="is_imported")
	private Boolean isImported;

	@Column(name="is_uploaded")
	private Boolean isUploaded;

	@Column(name="is_void")
	private Boolean isVoid;

	private BigDecimal key;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String name;

	private String notes;

	private Integer number;

	@Column(name="phase_id")
	private Integer phaseId;

//	@Column(name="place_id")
//	private Integer placeId;

	@Column(name="program_id")
	private Integer programId;

	private String remarks;

	@Column(name="season_id")
	private Integer seasonId;

	@Column(name="study_status")
	private String studyStatus;

	private String title;

	private Integer year;

	//bi-directional many-to-one association to Entry
	@OneToMany(mappedBy="study")
	private List<Entry> entries;

	//bi-directional many-to-one association to EntryData
	@OneToMany(mappedBy="study")
	private List<EntryData> entryData;

	//bi-directional many-to-one association to EntryMetadata
	@OneToMany(mappedBy="study")
	private List<EntryMetadata> entryMetadata;

	//bi-directional many-to-one association to FieldLayoutStudy
	@OneToMany(mappedBy="study")
	private List<FieldLayoutStudy> fieldLayoutStudies;

	//bi-directional many-to-one association to FileCabinet
	@OneToMany(mappedBy="study")
	private List<FileCabinet> fileCabinets;

	//bi-directional many-to-one association to Plot
	@OneToMany(mappedBy="study")
	private List<Plot> plots;

	//bi-directional many-to-one association to PlotData
	@OneToMany(mappedBy="study")
	private List<PlotData> plotData;

	//bi-directional many-to-one association to PlotMetadata
	@OneToMany(mappedBy="study")
	private List<PlotMetadata> plotMetadata;

	//bi-directional many-to-one association to StudyMetadata
	@OneToMany(mappedBy="study")
	private List<StudyMetadata> studyMetadata;

	//bi-directional many-to-one association to StudyTaskDefinition
	@OneToMany(mappedBy="study")
	private List<StudyTaskDefinition> studyTaskDefinitions;

	//bi-directional many-to-one association to Subplot
	@OneToMany(mappedBy="study")
	private List<Subplot> subplots;

	//bi-directional many-to-one association to SubplotData
	@OneToMany(mappedBy="study")
	private List<SubplotData> subplotData;

	//bi-directional many-to-one association to SubplotMetadata
	@OneToMany(mappedBy="study")
	private List<SubplotMetadata> subplotMetadata;

	//bi-directional many-to-one association to TempEntryData
	@OneToMany(mappedBy="study")
	private List<TempEntryData> tempEntryData;

	//bi-directional many-to-one association to TempEntryMetadata
	@OneToMany(mappedBy="study")
	private List<TempEntryMetadata> tempEntryMetadata;

	//bi-directional many-to-one association to TempPlot
	@OneToMany(mappedBy="study")
	private List<TempPlot> tempPlots;

	//bi-directional many-to-one association to TempPlotData
	@OneToMany(mappedBy="study")
	private List<TempPlotData> tempPlotData;

	//bi-directional many-to-one association to TempPlotMetadata
	@OneToMany(mappedBy="study")
	private List<TempPlotMetadata> tempPlotMetadata;
	
	//bi-directional many-to-one association to Master.Place
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Place place;
	
	public Place getPlace(){
		return this.place;
	}
	
	public void setPlace(Place place){
		this.place = place;
	}
	

	public Study() {
	}
	
	public Study(Integer id) {
		this.id = id;
	}	
	
	public Study(String remarks){
		this.remarks = remarks;
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

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDraft() {
		return this.isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public Boolean getIsImported() {
		return this.isImported;
	}

	public void setIsImported(Boolean isImported) {
		this.isImported = isImported;
	}

	public Boolean getIsUploaded() {
		return this.isUploaded;
	}

	public void setIsUploaded(Boolean isUploaded) {
		this.isUploaded = isUploaded;
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

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPhaseId() {
		return this.phaseId;
	}

	public void setPhaseId(Integer phaseId) {
		this.phaseId = phaseId;
	}

	//public Integer getPlaceId() {
	//	return this.placeId;
	//}

	//public void setPlaceId(Integer placeId) {
	//	this.placeId = placeId;
	//}

	public Integer getProgramId() {
		return this.programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
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

	public String getStudyStatus() {
		return this.studyStatus;
	}

	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<Entry> getEntries() {
		return this.entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public Entry addEntry(Entry entry) {
		getEntries().add(entry);
		entry.setStudy(this);

		return entry;
	}

	public Entry removeEntry(Entry entry) {
		getEntries().remove(entry);
		entry.setStudy(null);

		return entry;
	}

	public List<EntryData> getEntryData() {
		return this.entryData;
	}

	public void setEntryData(List<EntryData> entryData) {
		this.entryData = entryData;
	}

	public EntryData addEntryData(EntryData entryData) {
		getEntryData().add(entryData);
		entryData.setStudy(this);

		return entryData;
	}

	public EntryData removeEntryData(EntryData entryData) {
		getEntryData().remove(entryData);
		entryData.setStudy(null);

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
		entryMetadata.setStudy(this);

		return entryMetadata;
	}

	public EntryMetadata removeEntryMetadata(EntryMetadata entryMetadata) {
		getEntryMetadata().remove(entryMetadata);
		entryMetadata.setStudy(null);

		return entryMetadata;
	}

	public List<FieldLayoutStudy> getFieldLayoutStudies() {
		return this.fieldLayoutStudies;
	}

	public void setFieldLayoutStudies(List<FieldLayoutStudy> fieldLayoutStudies) {
		this.fieldLayoutStudies = fieldLayoutStudies;
	}

	public FieldLayoutStudy addFieldLayoutStudy(FieldLayoutStudy fieldLayoutStudy) {
		getFieldLayoutStudies().add(fieldLayoutStudy);
		fieldLayoutStudy.setStudy(this);

		return fieldLayoutStudy;
	}

	public FieldLayoutStudy removeFieldLayoutStudy(FieldLayoutStudy fieldLayoutStudy) {
		getFieldLayoutStudies().remove(fieldLayoutStudy);
		fieldLayoutStudy.setStudy(null);

		return fieldLayoutStudy;
	}

	public List<FileCabinet> getFileCabinets() {
		return this.fileCabinets;
	}

	public void setFileCabinets(List<FileCabinet> fileCabinets) {
		this.fileCabinets = fileCabinets;
	}

	public FileCabinet addFileCabinet(FileCabinet fileCabinet) {
		getFileCabinets().add(fileCabinet);
		fileCabinet.setStudy(this);

		return fileCabinet;
	}

	public FileCabinet removeFileCabinet(FileCabinet fileCabinet) {
		getFileCabinets().remove(fileCabinet);
		fileCabinet.setStudy(null);

		return fileCabinet;
	}

	public List<Plot> getPlots() {
		return this.plots;
	}

	public void setPlots(List<Plot> plots) {
		this.plots = plots;
	}

	public Plot addPlot(Plot plot) {
		getPlots().add(plot);
		plot.setStudy(this);

		return plot;
	}

	public Plot removePlot(Plot plot) {
		getPlots().remove(plot);
		plot.setStudy(null);

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
		plotData.setStudy(this);

		return plotData;
	}

	public PlotData removePlotData(PlotData plotData) {
		getPlotData().remove(plotData);
		plotData.setStudy(null);

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
		plotMetadata.setStudy(this);

		return plotMetadata;
	}

	public PlotMetadata removePlotMetadata(PlotMetadata plotMetadata) {
		getPlotMetadata().remove(plotMetadata);
		plotMetadata.setStudy(null);

		return plotMetadata;
	}

	public List<StudyMetadata> getStudyMetadata() {
		return this.studyMetadata;
	}

	public void setStudyMetadata(List<StudyMetadata> studyMetadata) {
		this.studyMetadata = studyMetadata;
	}

	public StudyMetadata addStudyMetadata(StudyMetadata studyMetadata) {
		getStudyMetadata().add(studyMetadata);
		studyMetadata.setStudy(this);

		return studyMetadata;
	}

	public StudyMetadata removeStudyMetadata(StudyMetadata studyMetadata) {
		getStudyMetadata().remove(studyMetadata);
		studyMetadata.setStudy(null);

		return studyMetadata;
	}

	public List<StudyTaskDefinition> getStudyTaskDefinitions() {
		return this.studyTaskDefinitions;
	}

	public void setStudyTaskDefinitions(List<StudyTaskDefinition> studyTaskDefinitions) {
		this.studyTaskDefinitions = studyTaskDefinitions;
	}

	public StudyTaskDefinition addStudyTaskDefinition(StudyTaskDefinition studyTaskDefinition) {
		getStudyTaskDefinitions().add(studyTaskDefinition);
		studyTaskDefinition.setStudy(this);

		return studyTaskDefinition;
	}

	public StudyTaskDefinition removeStudyTaskDefinition(StudyTaskDefinition studyTaskDefinition) {
		getStudyTaskDefinitions().remove(studyTaskDefinition);
		studyTaskDefinition.setStudy(null);

		return studyTaskDefinition;
	}

	public List<Subplot> getSubplots() {
		return this.subplots;
	}

	public void setSubplots(List<Subplot> subplots) {
		this.subplots = subplots;
	}

	public Subplot addSubplot(Subplot subplot) {
		getSubplots().add(subplot);
		subplot.setStudy(this);

		return subplot;
	}

	public Subplot removeSubplot(Subplot subplot) {
		getSubplots().remove(subplot);
		subplot.setStudy(null);

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
		subplotData.setStudy(this);

		return subplotData;
	}

	public SubplotData removeSubplotData(SubplotData subplotData) {
		getSubplotData().remove(subplotData);
		subplotData.setStudy(null);

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
		subplotMetadata.setStudy(this);

		return subplotMetadata;
	}

	public SubplotMetadata removeSubplotMetadata(SubplotMetadata subplotMetadata) {
		getSubplotMetadata().remove(subplotMetadata);
		subplotMetadata.setStudy(null);

		return subplotMetadata;
	}

	public List<TempEntryData> getTempEntryData() {
		return this.tempEntryData;
	}

	public void setTempEntryData(List<TempEntryData> tempEntryData) {
		this.tempEntryData = tempEntryData;
	}

	public TempEntryData addTempEntryData(TempEntryData tempEntryData) {
		getTempEntryData().add(tempEntryData);
		tempEntryData.setStudy(this);

		return tempEntryData;
	}

	public TempEntryData removeTempEntryData(TempEntryData tempEntryData) {
		getTempEntryData().remove(tempEntryData);
		tempEntryData.setStudy(null);

		return tempEntryData;
	}

	public List<TempEntryMetadata> getTempEntryMetadata() {
		return this.tempEntryMetadata;
	}

	public void setTempEntryMetadata(List<TempEntryMetadata> tempEntryMetadata) {
		this.tempEntryMetadata = tempEntryMetadata;
	}

	public TempEntryMetadata addTempEntryMetadata(TempEntryMetadata tempEntryMetadata) {
		getTempEntryMetadata().add(tempEntryMetadata);
		tempEntryMetadata.setStudy(this);

		return tempEntryMetadata;
	}

	public TempEntryMetadata removeTempEntryMetadata(TempEntryMetadata tempEntryMetadata) {
		getTempEntryMetadata().remove(tempEntryMetadata);
		tempEntryMetadata.setStudy(null);

		return tempEntryMetadata;
	}

	public List<TempPlot> getTempPlots() {
		return this.tempPlots;
	}

	public void setTempPlots(List<TempPlot> tempPlots) {
		this.tempPlots = tempPlots;
	}

	public TempPlot addTempPlot(TempPlot tempPlot) {
		getTempPlots().add(tempPlot);
		tempPlot.setStudy(this);

		return tempPlot;
	}

	public TempPlot removeTempPlot(TempPlot tempPlot) {
		getTempPlots().remove(tempPlot);
		tempPlot.setStudy(null);

		return tempPlot;
	}

	public List<TempPlotData> getTempPlotData() {
		return this.tempPlotData;
	}

	public void setTempPlotData(List<TempPlotData> tempPlotData) {
		this.tempPlotData = tempPlotData;
	}

	public TempPlotData addTempPlotData(TempPlotData tempPlotData) {
		getTempPlotData().add(tempPlotData);
		tempPlotData.setStudy(this);

		return tempPlotData;
	}

	public TempPlotData removeTempPlotData(TempPlotData tempPlotData) {
		getTempPlotData().remove(tempPlotData);
		tempPlotData.setStudy(null);

		return tempPlotData;
	}

	public List<TempPlotMetadata> getTempPlotMetadata() {
		return this.tempPlotMetadata;
	}

	public void setTempPlotMetadata(List<TempPlotMetadata> tempPlotMetadata) {
		this.tempPlotMetadata = tempPlotMetadata;
	}

	public TempPlotMetadata addTempPlotMetadata(TempPlotMetadata tempPlotMetadata) {
		getTempPlotMetadata().add(tempPlotMetadata);
		tempPlotMetadata.setStudy(this);

		return tempPlotMetadata;
	}

	public TempPlotMetadata removeTempPlotMetadata(TempPlotMetadata tempPlotMetadata) {
		getTempPlotMetadata().remove(tempPlotMetadata);
		tempPlotMetadata.setStudy(null);

		return tempPlotMetadata;
	}

}
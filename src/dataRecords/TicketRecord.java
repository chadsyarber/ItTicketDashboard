package dataRecords;

import java.sql.Date;

/**
 * Represents the HD_TICKET table
 * @author Owner
 *
 */
public class TicketRecord {
	
	private long id;
	private String title;
	private String summary;
	private long hdPriorityId;
	private long hdImpactId;
	private Date modified;
	private Date created;
	private long ownerId;
	private long submitterId;
	private long hdStatusId;
	private long hdQueueId;
	private long hdCategoryId;
	private String ccList;
	private Date escalated;
	private String customFieldValue0;
	private String customFieldValue1;
	private String customFieldValue2;
	private String customFieldValue3;
	private String customFieldValue4;
	private String customFieldValue5;
	private String customFieldValue6;
	private String customFieldValue7;
	private String customFieldValue8;
	private String customFieldValue9;
	private String customFieldValue10;
	private String customFieldValue11;
	private String customFieldValue12;
	private String customFieldValue13;
	private String customFieldValue14;
	private String customFieldValue15;
	private Date dueDate;
	private boolean isManual;
	private Date slaNotified;
	private Date timeOpened;
	private Date timeClosed;
	private Date timeStalled;
	private long machineId;
	private int statisfactionRating;
	private String statisfactionComment;
	private String resolution;
	private long assetId;
	private long parentId;
	private boolean isParent;
	private long approverId;
	private String approveState;
	private boolean approval;
	private String approvalNote;
	private long serviceTicketId;
	private long serviceStatusId;
	private boolean useProcessStatus;	

	public TicketRecord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the hdPriorityId
	 */
	public long getHdPriorityId() {
		return hdPriorityId;
	}

	/**
	 * @param hdPriorityId the hdPriorityId to set
	 */
	public void setHdPriorityId(long hdPriorityId) {
		this.hdPriorityId = hdPriorityId;
	}

	/**
	 * @return the hdImpactId
	 */
	public long getHdImpactId() {
		return hdImpactId;
	}

	/**
	 * @param hdImpactId the hdImpactId to set
	 */
	public void setHdImpactId(long hdImpactId) {
		this.hdImpactId = hdImpactId;
	}

	/**
	 * @return the modified
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * @param modified the modified to set
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the ownerId
	 */
	public long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * @return the submitterId
	 */
	public long getSubmitterId() {
		return submitterId;
	}

	/**
	 * @param submitterId the submitterId to set
	 */
	public void setSubmitterId(long submitterId) {
		this.submitterId = submitterId;
	}

	/**
	 * @return the hdStatusId
	 */
	public long getHdStatusId() {
		return hdStatusId;
	}

	/**
	 * @param hdStatusId the hdStatusId to set
	 */
	public void setHdStatusId(long hdStatusId) {
		this.hdStatusId = hdStatusId;
	}

	/**
	 * @return the hdQueueId
	 */
	public long getHdQueueId() {
		return hdQueueId;
	}

	/**
	 * @param hdQueueId the hdQueueId to set
	 */
	public void setHdQueueId(long hdQueueId) {
		this.hdQueueId = hdQueueId;
	}

	/**
	 * @return the hdCategoryId
	 */
	public long getHdCategoryId() {
		return hdCategoryId;
	}

	/**
	 * @param hdCategoryId the hdCategoryId to set
	 */
	public void setHdCategoryId(long hdCategoryId) {
		this.hdCategoryId = hdCategoryId;
	}

	/**
	 * @return the ccList
	 */
	public String getCcList() {
		return ccList;
	}

	/**
	 * @param ccList the ccList to set
	 */
	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	/**
	 * @return the escalated
	 */
	public Date getEscalated() {
		return escalated;
	}

	/**
	 * @param escalated the escalated to set
	 */
	public void setEscalated(Date escalated) {
		this.escalated = escalated;
	}

	/**
	 * @return the customFieldValue0
	 */
	public String getCustomFieldValue0() {
		return customFieldValue0;
	}

	/**
	 * @param customFieldValue0 the customFieldValue0 to set
	 */
	public void setCustomFieldValue0(String customFieldValue0) {
		this.customFieldValue0 = customFieldValue0;
	}

	/**
	 * @return the customFieldValue1
	 */
	public String getCustomFieldValue1() {
		return customFieldValue1;
	}

	/**
	 * @param customFieldValue1 the customFieldValue1 to set
	 */
	public void setCustomFieldValue1(String customFieldValue1) {
		this.customFieldValue1 = customFieldValue1;
	}

	/**
	 * @return the customFieldValue2
	 */
	public String getCustomFieldValue2() {
		return customFieldValue2;
	}

	/**
	 * @param customFieldValue2 the customFieldValue2 to set
	 */
	public void setCustomFieldValue2(String customFieldValue2) {
		this.customFieldValue2 = customFieldValue2;
	}

	/**
	 * @return the customFieldValue3
	 */
	public String getCustomFieldValue3() {
		return customFieldValue3;
	}

	/**
	 * @param customFieldValue3 the customFieldValue3 to set
	 */
	public void setCustomFieldValue3(String customFieldValue3) {
		this.customFieldValue3 = customFieldValue3;
	}

	/**
	 * @return the customFieldValue4
	 */
	public String getCustomFieldValue4() {
		return customFieldValue4;
	}

	/**
	 * @param customFieldValue4 the customFieldValue4 to set
	 */
	public void setCustomFieldValue4(String customFieldValue4) {
		this.customFieldValue4 = customFieldValue4;
	}

	/**
	 * @return the customFieldValue5
	 */
	public String getCustomFieldValue5() {
		return customFieldValue5;
	}

	/**
	 * @param customFieldValue5 the customFieldValue5 to set
	 */
	public void setCustomFieldValue5(String customFieldValue5) {
		this.customFieldValue5 = customFieldValue5;
	}

	/**
	 * @return the customFieldValue6
	 */
	public String getCustomFieldValue6() {
		return customFieldValue6;
	}

	/**
	 * @param customFieldValue6 the customFieldValue6 to set
	 */
	public void setCustomFieldValue6(String customFieldValue6) {
		this.customFieldValue6 = customFieldValue6;
	}

	/**
	 * @return the customFieldValue7
	 */
	public String getCustomFieldValue7() {
		return customFieldValue7;
	}

	/**
	 * @param customFieldValue7 the customFieldValue7 to set
	 */
	public void setCustomFieldValue7(String customFieldValue7) {
		this.customFieldValue7 = customFieldValue7;
	}

	/**
	 * @return the customFieldValue8
	 */
	public String getCustomFieldValue8() {
		return customFieldValue8;
	}

	/**
	 * @param customFieldValue8 the customFieldValue8 to set
	 */
	public void setCustomFieldValue8(String customFieldValue8) {
		this.customFieldValue8 = customFieldValue8;
	}

	/**
	 * @return the customFieldValue9
	 */
	public String getCustomFieldValue9() {
		return customFieldValue9;
	}

	/**
	 * @param customFieldValue9 the customFieldValue9 to set
	 */
	public void setCustomFieldValue9(String customFieldValue9) {
		this.customFieldValue9 = customFieldValue9;
	}

	/**
	 * @return the customFieldValue10
	 */
	public String getCustomFieldValue10() {
		return customFieldValue10;
	}

	/**
	 * @param customFieldValue10 the customFieldValue10 to set
	 */
	public void setCustomFieldValue10(String customFieldValue10) {
		this.customFieldValue10 = customFieldValue10;
	}

	/**
	 * @return the customFieldValue11
	 */
	public String getCustomFieldValue11() {
		return customFieldValue11;
	}

	/**
	 * @param customFieldValue11 the customFieldValue11 to set
	 */
	public void setCustomFieldValue11(String customFieldValue11) {
		this.customFieldValue11 = customFieldValue11;
	}

	/**
	 * @return the customFieldValue12
	 */
	public String getCustomFieldValue12() {
		return customFieldValue12;
	}

	/**
	 * @param customFieldValue12 the customFieldValue12 to set
	 */
	public void setCustomFieldValue12(String customFieldValue12) {
		this.customFieldValue12 = customFieldValue12;
	}

	/**
	 * @return the customFieldValue13
	 */
	public String getCustomFieldValue13() {
		return customFieldValue13;
	}

	/**
	 * @param customFieldValue13 the customFieldValue13 to set
	 */
	public void setCustomFieldValue13(String customFieldValue13) {
		this.customFieldValue13 = customFieldValue13;
	}

	/**
	 * @return the customFieldValue14
	 */
	public String getCustomFieldValue14() {
		return customFieldValue14;
	}

	/**
	 * @param customFieldValue14 the customFieldValue14 to set
	 */
	public void setCustomFieldValue14(String customFieldValue14) {
		this.customFieldValue14 = customFieldValue14;
	}

	/**
	 * @return the customFieldValue15
	 */
	public String getCustomFieldValue15() {
		return customFieldValue15;
	}

	/**
	 * @param customFieldValue15 the customFieldValue15 to set
	 */
	public void setCustomFieldValue15(String customFieldValue15) {
		this.customFieldValue15 = customFieldValue15;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the isManual
	 */
	public boolean isManual() {
		return isManual;
	}

	/**
	 * @param isManual the isManual to set
	 */
	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	/**
	 * @return the slaNotified
	 */
	public Date getSlaNotified() {
		return slaNotified;
	}

	/**
	 * @param slaNotified the slaNotified to set
	 */
	public void setSlaNotified(Date slaNotified) {
		this.slaNotified = slaNotified;
	}

	/**
	 * @return the timeOpened
	 */
	public Date getTimeOpened() {
		return timeOpened;
	}

	/**
	 * @param timeOpened the timeOpened to set
	 */
	public void setTimeOpened(Date timeOpened) {
		this.timeOpened = timeOpened;
	}

	/**
	 * @return the timeClosed
	 */
	public Date getTimeClosed() {
		return timeClosed;
	}

	/**
	 * @param timeClosed the timeClosed to set
	 */
	public void setTimeClosed(Date timeClosed) {
		this.timeClosed = timeClosed;
	}

	/**
	 * @return the timeStalled
	 */
	public Date getTimeStalled() {
		return timeStalled;
	}

	/**
	 * @param timeStalled the timeStalled to set
	 */
	public void setTimeStalled(Date timeStalled) {
		this.timeStalled = timeStalled;
	}

	/**
	 * @return the machineId
	 */
	public long getMachineId() {
		return machineId;
	}

	/**
	 * @param machineId the machineId to set
	 */
	public void setMachineId(long machineId) {
		this.machineId = machineId;
	}

	/**
	 * @return the statisfactionRating
	 */
	public int getStatisfactionRating() {
		return statisfactionRating;
	}

	/**
	 * @param statisfactionRating the statisfactionRating to set
	 */
	public void setStatisfactionRating(int statisfactionRating) {
		this.statisfactionRating = statisfactionRating;
	}

	/**
	 * @return the statisfactionComment
	 */
	public String getStatisfactionComment() {
		return statisfactionComment;
	}

	/**
	 * @param statisfactionComment the statisfactionComment to set
	 */
	public void setStatisfactionComment(String statisfactionComment) {
		this.statisfactionComment = statisfactionComment;
	}

	/**
	 * @return the resolution
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * @param resolution the resolution to set
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**
	 * @return the assetId
	 */
	public long getAssetId() {
		return assetId;
	}

	/**
	 * @param assetId the assetId to set
	 */
	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	/**
	 * @return the parentId
	 */
	public long getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the isParent
	 */
	public boolean isParent() {
		return isParent;
	}

	/**
	 * @param isParent the isParent to set
	 */
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}

	/**
	 * @return the approverId
	 */
	public long getApproverId() {
		return approverId;
	}

	/**
	 * @param approverId the approverId to set
	 */
	public void setApproverId(long approverId) {
		this.approverId = approverId;
	}

	/**
	 * @return the approveState
	 */
	public String getApproveState() {
		return approveState;
	}

	/**
	 * @param approveState the approveState to set
	 */
	public void setApproveState(String approveState) {
		this.approveState = approveState;
	}

	/**
	 * @return the approval
	 */
	public boolean isApproval() {
		return approval;
	}

	/**
	 * @param approval the approval to set
	 */
	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	/**
	 * @return the approvalNote
	 */
	public String getApprovalNote() {
		return approvalNote;
	}

	/**
	 * @param approvalNote the approvalNote to set
	 */
	public void setApprovalNote(String approvalNote) {
		this.approvalNote = approvalNote;
	}

	/**
	 * @return the serviceTicketId
	 */
	public long getServiceTicketId() {
		return serviceTicketId;
	}

	/**
	 * @param serviceTicketId the serviceTicketId to set
	 */
	public void setServiceTicketId(long serviceTicketId) {
		this.serviceTicketId = serviceTicketId;
	}

	/**
	 * @return the serviceStatusId
	 */
	public long getServiceStatusId() {
		return serviceStatusId;
	}

	/**
	 * @param serviceStatusId the serviceStatusId to set
	 */
	public void setServiceStatusId(long serviceStatusId) {
		this.serviceStatusId = serviceStatusId;
	}

	/**
	 * @return the useProcessStatus
	 */
	public boolean isUseProcessStatus() {
		return useProcessStatus;
	}

	/**
	 * @param useProcessStatus the useProcessStatus to set
	 */
	public void setUseProcessStatus(boolean useProcessStatus) {
		this.useProcessStatus = useProcessStatus;
	}

}


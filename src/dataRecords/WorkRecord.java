package dataRecords;

import java.sql.Date;

/**
 * Represents the HD_WORK table
 * @author Chad Yarber
 *
 */
public class WorkRecord {

	private long id;
	private long hdTicketId;
	private String userId;
	private boolean modified;
	private String note;
	private Date start;
	private Date stop;
	private String voidedBy;
	private int adjustmentHours;
	
	public WorkRecord() {
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
	 * @return the hdTicketId
	 */
	public long getHdTicketId() {
		return hdTicketId;
	}

	/**
	 * @param hdTicketId the hdTicketId to set
	 */
	public void setHdTicketId(long hdTicketId) {
		this.hdTicketId = hdTicketId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the modified
	 */
	public boolean isModified() {
		return modified;
	}

	/**
	 * @param modified the modified to set
	 */
	public void setModified(boolean modified) {
		this.modified = modified;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the start
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the stop
	 */
	public Date getStop() {
		return stop;
	}

	/**
	 * @param stop the stop to set
	 */
	public void setStop(Date stop) {
		this.stop = stop;
	}

	/**
	 * @return the voidedBy
	 */
	public String getVoidedBy() {
		return voidedBy;
	}

	/**
	 * @param voidedBy the voidedBy to set
	 */
	public void setVoidedBy(String voidedBy) {
		this.voidedBy = voidedBy;
	}

	/**
	 * @return the adjustmentHours
	 */
	public int getAdjustmentHours() {
		return adjustmentHours;
	}

	/**
	 * @param adjustmentHours the adjustmentHours to set
	 */
	public void setAdjustmentHours(int adjustmentHours) {
		this.adjustmentHours = adjustmentHours;
	}

	

}

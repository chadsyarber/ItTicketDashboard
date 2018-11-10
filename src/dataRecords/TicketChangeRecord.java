package dataRecords;

import java.sql.Date;

/**
 * Represents the HD_TICKET_CHANGE table
 * @author Chad Yarber
 *
 */
public class TicketChangeRecord {

	private long id;
	private long hdTicketId;
	private Date timestamp;
	private String userId;
	private String comment;
	private String description;
	private String ownersOnlyDescription;
	private boolean mailed;
	private Date mailedTimestamp;
	private String mailerSession;
	private boolean notifyUsers;
	private boolean viaEmail;
	private boolean ownersOnly;
	private boolean resolutionChanged;
	
	public TicketChangeRecord() {
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
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ownersOnlyDescription
	 */
	public String getOwnersOnlyDescription() {
		return ownersOnlyDescription;
	}

	/**
	 * @param ownersOnlyDescription the ownersOnlyDescription to set
	 */
	public void setOwnersOnlyDescription(String ownersOnlyDescription) {
		this.ownersOnlyDescription = ownersOnlyDescription;
	}

	/**
	 * @return the mailed
	 */
	public boolean isMailed() {
		return mailed;
	}

	/**
	 * @param mailed the mailed to set
	 */
	public void setMailed(boolean mailed) {
		this.mailed = mailed;
	}

	/**
	 * @return the mailedTimestamp
	 */
	public Date getMailedTimestamp() {
		return mailedTimestamp;
	}

	/**
	 * @param mailedTimestamp the mailedTimestamp to set
	 */
	public void setMailedTimestamp(Date mailedTimestamp) {
		this.mailedTimestamp = mailedTimestamp;
	}

	/**
	 * @return the mailerSession
	 */
	public String getMailerSession() {
		return mailerSession;
	}

	/**
	 * @param mailerSession the mailerSession to set
	 */
	public void setMailerSession(String mailerSession) {
		this.mailerSession = mailerSession;
	}

	/**
	 * @return the notifyUsers
	 */
	public boolean isNotifyUsers() {
		return notifyUsers;
	}

	/**
	 * @param notifyUsers the notifyUsers to set
	 */
	public void setNotifyUsers(boolean notifyUsers) {
		this.notifyUsers = notifyUsers;
	}

	/**
	 * @return the viaEmail
	 */
	public boolean isViaEmail() {
		return viaEmail;
	}

	/**
	 * @param viaEmail the viaEmail to set
	 */
	public void setViaEmail(boolean viaEmail) {
		this.viaEmail = viaEmail;
	}

	/**
	 * @return the ownersOnly
	 */
	public boolean isOwnersOnly() {
		return ownersOnly;
	}

	/**
	 * @param ownersOnly the ownersOnly to set
	 */
	public void setOwnersOnly(boolean ownersOnly) {
		this.ownersOnly = ownersOnly;
	}

	/**
	 * @return the resolutionChanged
	 */
	public boolean isResolutionChanged() {
		return resolutionChanged;
	}

	/**
	 * @param resolutionChanged the resolutionChanged to set
	 */
	public void setResolutionChanged(boolean resolutionChanged) {
		this.resolutionChanged = resolutionChanged;
	}

}
